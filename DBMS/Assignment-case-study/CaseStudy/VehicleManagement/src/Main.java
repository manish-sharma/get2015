import java.util.Iterator;
import java.util.List;

import com.metacampus.vehiclemanagement.helper.VehicleJDBCHelper;
import com.metacampus.vehiclemanagement.model.Vehicle;
import com.metacampus.vehiclemanagement.xml.ReadConnectionXml;
import com.metacampus.vehiclemanagement.xml.StaXParser;
import com.metacampus.vehiclemanagement.xml.WriteConnectionXML;


/**This class is use to store the vehicle object in database.vehicle object are read from the xml files.
 * @author Khemanshu
 *
 */
public class Main {
	
	public static void main(String args[]) {
		try
		{
			//writeConnectionXML object write the xml file which is use to create the connection.
			WriteConnectionXML connectionFile = new WriteConnectionXML();
		    connectionFile.setFile("Connection.xml");
		    connectionFile.saveConfig();
			//ReadConnectionXml reads connection.xml file.
		    ReadConnectionXml read = new ReadConnectionXml();
		    read.readConfig("connection.xml");
		    //StaxParser class read the vehicle object from the VehicleData.xml file.
		    StaXParser readVehicleData = new StaXParser();
		    //vehicleList holds all the vehicle object readsw from the xml.
		    List<Vehicle> vehicleList = readVehicleData.readConfig("C:/Users/Khemanshu/CaseStudy/VehicleManagement/VehicleData.xml");
		    Iterator<Vehicle> vehicleIterator = vehicleList.iterator();
		    while(vehicleIterator.hasNext()) {
		    	System.out.println("Hello");
		    	VehicleJDBCHelper.insert(vehicleIterator.next());
		    }
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
