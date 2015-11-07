package com.metacampus.vehiclemanagement.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import com.metacampus.vehiclemanagement.model.Vehicle;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Bike;

/**This class is the parser of the vehicledata.xml file. It works on the staxPaeser mechanism.
 * @author Khemanshu
 *
 */
public class StaXParser {
	  static final String Car = "Car";
	  static final String Bike = "Bike";
	  static final String created_by = "created_by";
	  static final String created_time = "created_time";
	  static final String make = "make";
	  static final String model = "model";
	  static final String engineInCC = "engineInCC";
	  static final String fuelCapacity = "fuelCapacity";
	  static final String mileage = "mileage";
	  static final String price = "price";
	  static final String roadTax = "roadTax";
	  static final String AC = "AC";
	  static final String powerSteering = "powerSteering";
	  static final String accessoryKit = "accessoryKit";
	  static final String selfStart = "selfStart";
	  static final String helmetPrice = "helmetPrice";
	  
	  @SuppressWarnings({ "unchecked", "null" })
	  public List<Vehicle> readConfig(String configFile) {
	    List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	    try {
	      // First, create a new XMLInputFactory
	  XMLInputFactory inputFactory = XMLInputFactory.newInstance();
	  // Setup a new eventReader
	  InputStream in = new FileInputStream(configFile);
	  XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
	  // read the XML document
	  Vehicle vehicle = null;
	
	  while (eventReader.hasNext()) {
	    XMLEvent event = eventReader.nextEvent();
	
	    if (event.isStartElement()) {
	      StartElement startElement = event.asStartElement();
	      // If we have an item element, we create a new item
	  if (startElement.getName().getLocalPart() == (Car)) {
	    vehicle = new Car();
	    
	  }
	  else if(startElement.getName().getLocalPart() == (Bike)) {
		  vehicle = new Bike();
	  }
	
	  
	  if (event.asStartElement().getName().getLocalPart()
			    .equals(created_by)) {
			  event = eventReader.nextEvent();
			  vehicle.setCreated_by(event.asCharacters().getData());
			  continue;
			}
	  if (event.asStartElement().getName().getLocalPart()
		    .equals(make)) {
		  event = eventReader.nextEvent();
		  vehicle.setMake(event.asCharacters().getData());
		  continue;
		}
	  
	  if (event.asStartElement().getName().getLocalPart()
	      .equals(model)) {
	    event = eventReader.nextEvent();
	    vehicle.setModel(event.asCharacters().getData());
	    continue;
	  }
	
	  if (event.asStartElement().getName().getLocalPart()
	      .equals(engineInCC)) {
	    event = eventReader.nextEvent();
	    vehicle.setEngineInCC(event.asCharacters().getData());
	    continue;
	  }
	
	  if (event.asStartElement().getName().getLocalPart()
	      .equals(fuelCapacity)) {
	    event = eventReader.nextEvent();
	    vehicle.setFuelCapacity(Integer.parseInt(event.asCharacters().getData()));
	    continue;
	  }
	  if (event.asStartElement().getName().getLocalPart()
		      .equals(mileage)) {
		    event = eventReader.nextEvent();
		    vehicle.setMileage(event.asCharacters().getData());
		    continue;
		  }
	  if (event.asStartElement().getName().getLocalPart()
		      .equals(price)) {
		    event = eventReader.nextEvent();
		    vehicle.setPrice(Float.parseFloat(event.asCharacters().getData()));
		    continue;
		  }
	  if (event.asStartElement().getName().getLocalPart()
		      .equals(roadTax)) {
		    event = eventReader.nextEvent();
		    vehicle.setRoadTax(Float.parseFloat(event.asCharacters().getData()));
		    continue;
		  }
	  if (event.asStartElement().getName().getLocalPart()
		      .equals(AC)) {
		    event = eventReader.nextEvent();
		    ((Car) vehicle).setAC(Boolean.parseBoolean(event.asCharacters().getData()));
		    continue;
		  }
	  if (event.asStartElement().getName().getLocalPart()
		      .equals(powerSteering)) {
		    event = eventReader.nextEvent();
		    ((Car) vehicle).setPowerSteering(Boolean.parseBoolean(event.asCharacters().getData()));
		    continue;
		  }
	  if (event.asStartElement().getName().getLocalPart()
		      .equals(accessoryKit)) {
		    event = eventReader.nextEvent();
		    ((Car) vehicle).setAccessoryKit(Boolean.parseBoolean(event.asCharacters().getData()));
		    continue;
		  }
	  if (event.asStartElement().getName().getLocalPart()
		      .equals(selfStart)) {
		    event = eventReader.nextEvent();
		    ((Bike) vehicle).setSelfStart(Boolean.parseBoolean(event.asCharacters().getData()));
		    continue;
		  }
	  if (event.asStartElement().getName().getLocalPart()
		      .equals(helmetPrice)) {
		    event = eventReader.nextEvent();
		    ((Bike )vehicle).setHelmetPrice(Float.parseFloat(event.asCharacters().getData()));
		    continue;
		  }
	}
	// If we reach the end of an item element, we add it to the list
	        if (event.isEndElement()) {
	          EndElement endElement = event.asEndElement();
	          java.sql.Date createdTime = new java.sql.Date(new java.util.Date().getTime());
	          vehicle.setCreated_time(createdTime);
	          if (endElement.getName().getLocalPart() == (Car)) {
	            vehicleList.add(vehicle);
	          }
	          else if(endElement.getName().getLocalPart() == (Bike)) {
	        	  vehicleList.add(vehicle);
	          }
	        }
	        
	      }
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (XMLStreamException e) {
	      e.printStackTrace();
	    }
	    return vehicleList;
	  }

} 

