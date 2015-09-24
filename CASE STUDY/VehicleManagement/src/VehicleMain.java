/**
 * Class to implement vehicle functionality
 * @author Sanjay
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.metacampus.vehiclemanagement.helper.VehicleJDBCHelper;
import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;
import com.metacampus.vehiclemanagement.xml.ReadConnectionXml;
import com.metacampus.vehiclemanagement.xml.ReadVehicleData;
import com.metacampus.vehiclemanagement.xml.WriteConnectionXML;


public class VehicleMain {

	public static void main(String[] args) {
		try
		{
			/* Wirting Connection XML File using Java Code */
			WriteConnectionXML connectionFile = new WriteConnectionXML();
		    connectionFile.setFile("Connection.xml");
		    connectionFile.saveConfig();
		  
		    /* Raeding Coneection XML File */
		    ReadConnectionXml readConnection = new ReadConnectionXml();
		    readConnection.readConfig("connection.xml");
		    
		    /* Reading Vehicle Data from XML file of vehicles */
			ReadVehicleData readVehicleData = new ReadVehicleData();
		    List<Vehicle> vehicleList = readVehicleData.readData("VehicleData.xml");
		    
		    /* Iteration over the list of vehicles and adding the objects
		     * of vehicle class to database using VehicleJDBCHelper class*/
		    Iterator<Vehicle> vehicleListIterator = vehicleList.iterator();
		    while(vehicleListIterator.hasNext()) {
		    	VehicleJDBCHelper.insert(vehicleListIterator.next());
		    }
		   
		    /* searchResultList contains the list of vehicles returned
		     * based upon the search */
		    List<Vehicle> searchResultList = new ArrayList<Vehicle>();
		    searchResultList =VehicleJDBCHelper.searchByMakeAndModel("Hyundai", "Verna");
		 
		    /* If list is null or size of list is zero then No Data available
		     * for particular search item 
		     */
		    if(searchResultList == null || searchResultList.size() == 0) {
		    	System.out.println("No Data Available");
		    }
		    
		    /* If list has some items then iterating over the list
		     * to get searched items 
		     */
		    else {
			    Iterator<Vehicle> searchResultIterator = searchResultList.iterator();
			    while(searchResultIterator.hasNext()) {
			    	
			    	Vehicle vehicle = searchResultIterator.next();
			    	
			    	/* If vehicle object is instance of class Car
			    	 * then specific attributes of Car class are used
			    	 */
			    	if(vehicle instanceof Car) {
			    		System.out.println("Make: "+vehicle.getMake());
			    		System.out.println("Model: "+vehicle.getModel());
			    		System.out.println("Engine CC: "+vehicle.getEngineCC());
			    		System.out.println("Fuel Capacity: "+vehicle.getFuelCapacity());
			    		System.out.println("Mileage: "+vehicle.getMileage());
			    		System.out.println("Price: "+vehicle.getPrice());
			    		System.out.println("Road Tax: "+vehicle.getRoadTax());
			    		System.out.println("AC: "+((Car)vehicle).getAC());
			    		System.out.println("Power Steering: "+((Car)vehicle).getPowerSteering());
			    		System.out.println("Accessory Kit: "+((Car)vehicle).getAccessoryKit());
			    	}
			    	
			    	/* If vehicle object is instance of class Bike
			    	 * then specific attributes of Bike class are used
			    	 */
			    	else if(vehicle instanceof Bike) {
			    		System.out.println("Make: "+vehicle.getMake());
			    		System.out.println("Model: "+vehicle.getModel());
			    		System.out.println("Engine CC: "+vehicle.getEngineCC());
			    		System.out.println("Fuel Capacity: "+vehicle.getFuelCapacity());
			    		System.out.println("Mileage: "+vehicle.getMileage());
			    		System.out.println("Price: "+vehicle.getPrice());
			    		System.out.println("Road Tax: "+vehicle.getRoadTax());
			    		System.out.println("Self Start: "+((Bike)vehicle).getSelfStart());
			    		System.out.println("Helmet Price: "+((Bike)vehicle).getHelmetPrice());
			    	}
			    }
		    }
		   
		    int numberOfRowsUpdated;
		    
		    /* Method invoked to update the price of the cars of company hyundai */ 
		    numberOfRowsUpdated = VehicleJDBCHelper.updateByMake("Hyundai");
		    if(numberOfRowsUpdated == 0) {
		    	System.out.println("No Record Found");
		    } 
		    else if (numberOfRowsUpdated == -1) {
		    	System.out.println("Some problem occurred while updating ");
		    }
		    else {
		    	System.out.println("Number of records Updated are :"+ numberOfRowsUpdated);
		    }
		    
		    int numberOfRowsDeleted;
		    numberOfRowsDeleted = VehicleJDBCHelper.deleteByMake("Hyundai");
		    if(numberOfRowsDeleted == 0) {
		    	System.out.println("No Record Found");
		    } 
		    else if (numberOfRowsDeleted == -1) {
		    	System.out.println("Some problem occurred while Deleting ");
		    }
		    else {
		    	System.out.println("Number of records Deleted are :"+ numberOfRowsDeleted);
		    }
		} catch(Exception e) {
		    	System.out.println(e.getMessage());
		}
	}
}
