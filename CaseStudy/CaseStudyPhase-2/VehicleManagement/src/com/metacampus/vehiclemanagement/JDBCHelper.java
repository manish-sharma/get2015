package com.metacampus.vehiclemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.metacampus.vehiclemanagement.ConnectionUtil;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;



public class JDBCHelper {
@SuppressWarnings("resource")
public static  void insertData(Vehicle vehicle) {
		
		
		Connection con = null;
		PreparedStatement ps = null;
		
		con = ConnectionUtil.getConnection();
		String query =getQuery();
		

		try {
			
			ps = con.prepareStatement(query);
			
			/* set variable in prepared statement */
			ps.setInt(1, vehicle.getVehicleId());
			ps.setString(2, vehicle.getMake());
			ps.setString(3,vehicle.getModel());
			ps.setString(4,vehicle.getEngineInCC());
			ps.setDouble(5, vehicle.getFuelCapacity());
			ps.setDouble(6,vehicle.getMilage());
			ps.setDouble(7,vehicle.getPrice());
			ps.setDouble(8,vehicle.getRoadTax());
			ps.setString(9, vehicle.getCreatedBy());
			
			ps.executeUpdate();
			
			
			if(vehicle instanceof Bike)
			{
				String queryBike =getQueryForBike();
				ps = con.prepareStatement(queryBike);
				ps.setInt(1, vehicle.getVehicleId());
				ps.setBoolean(2, ((Bike) vehicle).isSelfStart());
				ps.setInt(3, ((Bike) vehicle).getHelmetPrice());
				int a1 = ps.executeUpdate();
				System.out.println("a ia " +a1);
				
				
				
			}
			else
			{
				String queryCar =getQueryForCar();
				ps = con.prepareStatement(queryCar);
				ps.setInt(1, vehicle.getVehicleId());
				ps.setBoolean(2, ((Car) vehicle).isAC());
				ps.setBoolean(3, ((Car) vehicle).isPowerStearing());
				ps.setString(4, ((Car) vehicle).getAccessoryKit());
				ps.executeUpdate();
				
				
			}


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

private static String getQuery() {
	
	String query=" INSERT INTO vehicle"+
			     " (vehicle_ID,make,model,engine_in_CC,fuel_capacity, milage ,price,road_tax,created_by)"+
			     " VALUES"+
				 " (?,?,?,?,?,?,?,?,?)";
	return query;
}
private static String getQueryForBike() {
	String query=" INSERT INTO bike"+
			     " (vehicle_ID,self_start,helmet_price)"+
			     " Values"+
			     " (?,?,?)";
	return query;
			
	
}
private static String getQueryForCar() {
	String query=" INSERT INTO car"+
                 " (vehicle_ID,AC,power_stearing,accessory_Kit)"+
                 " Values"+
                 " (?,?,?,?)";
	return query;
	
}




}
