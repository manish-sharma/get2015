/**
 * @author Pooja Khandelwal
 * @created Date 20/09/2015
 * @name VehicleTablesCreation
 * @description this class create 3 tables vehicle,car and bike in vehicle database by calling 3 methods createVehicleTable(),createBikeTable() and createCarTable() of DatabaseHelperClass
 */
package com.test.vehicle;

import org.junit.Test;
import com.databsehelperclass.DatabaseHelper;

public class VehicleTablesCreationTest {
	/**
	 * @name vehicleTablesCreation()
	 * @description this method will create 3 tables vehicle,car and bike in
	 *              vehicle database by calling 3 methods
	 *              createVehicleTable(),createBikeTable() and createCarTable()
	 *              of DatabaseHelperClass
	 * @param
	 * @return
	 */
	@Test
	public void vehicleTablesCreation() {
		DatabaseHelper.createVehicleTable();
		DatabaseHelper.createBikeTable();
		DatabaseHelper.createCarTable();
	}

	@Test
	public void bikeTableCreation() {
	}

	@Test
	public void carTableCreation() {
	}
}
