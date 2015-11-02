package vehicles;
import java.io.*;
import java.util.*;

import javax.xml.stream.*;
import javax.xml.stream.events.*;
/**
 * to read the XML of the vehicle
 * @author Ravika
 *
 */
public class StaXParserForVehicle {
	 static final String CAR = "Car";
	 static final String BIKE = "Bike";
	 static final String MAKE = "Make";
	 static final String MODEL = "Model";
	 static final String ENGINEINCC = "EngineInCC";
	 static final String FUELCAPACTY = "FuelCapacity";
	 static final String MILAGE = "Milage";
	 static final String PRICE = "Price";
	 static final String ROADTAX = "RoadTax";
	 static final String TYPE = "Type";
	 static final String AC = "AC";
	 static final String POWERSTEERING = "PowerSteering";
	 static final String ACCESSORYKIT = "AccessoryKit";
	 static final String SELF_STARAT = "SelfStart";
	 static final String HELMET_PRICE = "HelmetPrice";

	 
  public List<Vehicle> readConfig(String configFile) {
	  List<Vehicle> vehicles = new ArrayList<Vehicle>();
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
				  // If we have an vehicle element, we create a new item
				  if (startElement.getName().getLocalPart() == CAR) {
					  vehicle = new Car();
					  continue;
				  }	
				  if(startElement.getName().getLocalPart() == BIKE) {
					  vehicle = new Bike();
					  continue;
				  }
				  if (event.asStartElement().getName().getLocalPart().equals(MODEL)) {
					  event = eventReader.nextEvent();
					  vehicle.setModel(event.asCharacters().getData());
					  continue;
				  }
				  
				  if (event.asStartElement().getName().getLocalPart().equals(MAKE)) {
					  event = eventReader.nextEvent();
					  vehicle.setMake(event.asCharacters().getData());
					  continue;
				  }
				  if (event.asStartElement().getName().getLocalPart().equals(ENGINEINCC)) {
					  event = eventReader.nextEvent();
					  vehicle.setEngineInCC(Integer.parseInt(event.asCharacters().getData()));
					  continue;
				  }

				  if (event.asStartElement().getName().getLocalPart().equals(FUELCAPACTY)) {
					  event = eventReader.nextEvent();
					  vehicle.setFuelCapacity(Integer.parseInt(event.asCharacters().getData()));
					  continue;
				  }

				  if (event.asStartElement().getName().getLocalPart().equals(MILAGE)) {
					  event = eventReader.nextEvent();
					  vehicle.setMilage(Integer.parseInt(event.asCharacters().getData()));;
					  continue;
				  }
        
				  if (event.asStartElement().getName().getLocalPart().equals(PRICE)) {
					  event = eventReader.nextEvent();
					  vehicle.setPrice(Long.parseLong(event.asCharacters().getData()));
					  continue;
				  }
          
				  if (event.asStartElement().getName().getLocalPart().equals(ROADTAX)) {
					  event = eventReader.nextEvent();
					  vehicle.setRoadTax(Integer.parseInt(event.asCharacters().getData()));
					  continue;
				  }
				  if (event.asStartElement().getName().getLocalPart().equals(AC)) {
					  event = eventReader.nextEvent();
					  ((Car) vehicle).setAC(Boolean.parseBoolean(event.asCharacters().getData()));
					  continue;
				  }
			  
				  if (event.asStartElement().getName().getLocalPart().equals(POWERSTEERING)) {
					  event = eventReader.nextEvent();
					  ((Car) vehicle).setPowerSteering(Boolean.parseBoolean(event.asCharacters().getData()));
					  continue;
				  }
				  if (event.asStartElement().getName().getLocalPart().equals(ACCESSORYKIT)) {
					  event = eventReader.nextEvent();
					  ((Car) vehicle).setAccessoryKit(event.asCharacters().getData());
					  continue;
				  }
				  if (event.asStartElement().getName().getLocalPart().equals(SELF_STARAT)) {
					  event = eventReader.nextEvent();
					  ((Bike) vehicle).setSelfStart(Boolean.parseBoolean(event.asCharacters().getData()));
					  continue;
				  }
				  if (event.asStartElement().getName().getLocalPart().equals(HELMET_PRICE)) {
					  event = eventReader.nextEvent();
					  ((Bike)vehicle).setHelmetPrice(Integer.parseInt(event.asCharacters().getData()));
					  continue;
				  }
			  }
			  // If we reach the end of an item element, we add it to the list
			  if (event.isEndElement()) {
				  EndElement endElement = event.asEndElement();
				  if (endElement.getName().getLocalPart() == (CAR)) {
					  vehicles.add(vehicle);
				  }
				  if (endElement.getName().getLocalPart() == (BIKE)) {
					  vehicles.add(vehicle);
				  } 
			  }

		  }
	  } catch (FileNotFoundException e) {
		  e.printStackTrace();
	  } catch (XMLStreamException e) {
		  e.printStackTrace();
	  }
	  return vehicles;
  }

} 