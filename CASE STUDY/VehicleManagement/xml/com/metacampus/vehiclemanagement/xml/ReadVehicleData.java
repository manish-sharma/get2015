/**
 * Class to read data of vehicles from xml file
 * @author Sanjay
 */

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

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;

public class ReadVehicleData {
	static final String CAR = "Car";
	static final String BIKE = "Bike";
	static final String MAKE = "make";
	static final String CREATED_BY = "createdBy";
	static final String MODEL = "model";
	static final String ENGINE_CC = "engineCC";
	static final String FUEL_CAPACITY = "fuelCapacity";
	static final String MILEAGE = "mileage";
	static final String PRICE = "price";
	static final String ROAD_TAX = "roadTax";
	static final String AC = "ac";
	static final String POWER_STEERING = "powerSteering";
	static final String ACCESSORY_KIT = "accessoryKit";
	static final String SELF_START = "selfStart";
	static final String HELMET_PRICE = "helmetPrice";


	public List<Vehicle> readData(String configFile) {
		boolean flag = false;
		
		/* VehicleList will contain the vehicle objects */
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		try {

			/* Creating a new XML Factory */
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();

			/* Setting up anew eventReader */
			InputStream inputStreamObj = new FileInputStream(configFile);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(inputStreamObj);

			/* Reading the XML document */
			Vehicle vehicle = null;

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					
					/* If we have an item element, we create a new item */
					if (startElement.getName().getLocalPart() == (CAR)) {
						System.out.println("Car");
						vehicle = new Car();
						flag = true;
					}
					else if (startElement.getName().getLocalPart() == (BIKE)){
						System.out.println("Bike");
						vehicle = new Bike();
						flag = false;
					}
					
					/* Reading make from XMl File */
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(MAKE)) {
							event = eventReader.nextEvent();
							vehicle.setMake(event.asCharacters().getData());
							continue;
						}
					}

					/* Reading Created By from XMl File */
					if (event.asStartElement().getName().getLocalPart()
							.equals(CREATED_BY)) {
						event = eventReader.nextEvent();
						vehicle.setCreatedBy(event.asCharacters().getData());
						continue;
					}

					/* Reading model from XMl File */
					if (event.asStartElement().getName().getLocalPart()
							.equals(MODEL)) {
						event = eventReader.nextEvent();
						vehicle.setModel(event.asCharacters().getData());
						continue;
					}

					/* Reading engineCC from XMl File */
					if (event.asStartElement().getName().getLocalPart()
							.equals(ENGINE_CC)) {
						event = eventReader.nextEvent();
						vehicle.setEngineCC(event.asCharacters().getData());
						continue;
					}

					/* Reading fuelCapacity from XMl File */
					if (event.asStartElement().getName().getLocalPart()
							.equals(FUEL_CAPACITY)) {
						event = eventReader.nextEvent();
						vehicle.setFuelCapacity(event.asCharacters().getData());
						continue;
					}

					/* Reading mileage from XMl File */
					if (event.asStartElement().getName().getLocalPart()
							.equals(MILEAGE)) {
						event = eventReader.nextEvent();
						vehicle.setMileage(event.asCharacters().getData());
						continue;
					}

					/* Reading price from XMl File */
					if (event.asStartElement().getName().getLocalPart()
							.equals(PRICE)) {
						event = eventReader.nextEvent();
						vehicle.setPrice(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}

					/* Reading raodtax from XMl File */
					if (event.asStartElement().getName().getLocalPart()
							.equals(ROAD_TAX)) {
						event = eventReader.nextEvent();
						vehicle.setRoadTax(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}
					if(flag == true) {
						
						/* Reading AC availability from XML File */
						if (event.asStartElement().getName().getLocalPart()
								.equals(AC)) {
							event = eventReader.nextEvent();
							((Car)vehicle).setAC(event.asCharacters().getData());
							continue;
						}
						
						/* Reading powerSteering availability from XML File */
						if (event.asStartElement().getName().getLocalPart()
								.equals(POWER_STEERING)) {
							event = eventReader.nextEvent();
							((Car)vehicle).setPowerSteering(event.asCharacters().getData());
							continue;
						}
						
						/* Reading accessoryKit availability from XML File */
						if (event.asStartElement().getName().getLocalPart()
								.equals(ACCESSORY_KIT)) {
							event = eventReader.nextEvent();
							((Car)vehicle).setAccessoryKit(event.asCharacters().getData());
							continue;
						}
					}
					else {
						
						/* Reading selfStart availability from XML File */
						if (event.asStartElement().getName().getLocalPart()
								.equals(SELF_START)) {
							event = eventReader.nextEvent();
							((Bike)vehicle).setSelfStart(event.asCharacters().getData());
							continue;
						}

						/* Reading HelmetPrice from XML File */
						if (event.asStartElement().getName().getLocalPart()
								.equals(HELMET_PRICE)) {
							event = eventReader.nextEvent();
							((Bike)vehicle).setHelmetPrice(Integer.parseInt(event.asCharacters().getData()));
							continue;
						}
					}
				}
				
				/* If we reach the end of an item element, we add it to the list */
				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					
					/* Getting system date */
					java.util.Date currentTime = new java.util.Date();
					java.sql.Date date = new java.sql.Date(currentTime.getTime());
					vehicle.setCreatedTime(date);
					if (endElement.getName().getLocalPart() == (CAR) || endElement.getName().getLocalPart() == (BIKE)) {
						
						/* Adding object of vehicle to list vehicles */
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