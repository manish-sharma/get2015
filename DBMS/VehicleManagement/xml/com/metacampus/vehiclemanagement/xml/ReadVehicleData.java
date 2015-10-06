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


	public List<Vehicle> readData(String vehicleDetailsFile) {
		boolean flag = false;
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		try {
			// First, create a new XMLInputFactory
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			// Setup a new eventReader
			InputStream inputStreamObj = new FileInputStream(vehicleDetailsFile);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(inputStreamObj);
			// read the XML document
			Vehicle vehicle = null;

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					// If we have an item element, we create a new item
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
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(MAKE)) {
							event = eventReader.nextEvent();
							vehicle.setMake(event.asCharacters().getData());
							continue;
						}
					}
					if (event.asStartElement().getName().getLocalPart()
							.equals(MODEL)) {
						event = eventReader.nextEvent();
						vehicle.setModel(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(ENGINE_CC)) {
						event = eventReader.nextEvent();
						vehicle.setEngineCC(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(FUEL_CAPACITY)) {
						event = eventReader.nextEvent();
						vehicle.setFuelCapacity(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(MILEAGE)) {
						event = eventReader.nextEvent();
						vehicle.setMileage(event.asCharacters().getData());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(PRICE)) {
						event = eventReader.nextEvent();
						vehicle.setPrice(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(ROAD_TAX)) {
						event = eventReader.nextEvent();
						vehicle.setRoadTax(Integer.parseInt(event.asCharacters().getData()));
						continue;
					}
					if(flag == true) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(AC)) {
							event = eventReader.nextEvent();
							((Car)vehicle).setAC(event.asCharacters().getData());
							continue;
						}
						if (event.asStartElement().getName().getLocalPart()
								.equals(POWER_STEERING)) {
							event = eventReader.nextEvent();
							((Car)vehicle).setPowerSteering(event.asCharacters().getData());
							continue;
						}
						if (event.asStartElement().getName().getLocalPart()
								.equals(ACCESSORY_KIT)) {
							event = eventReader.nextEvent();
							((Car)vehicle).setAccessoryKit(event.asCharacters().getData());
							continue;
						}
					}
					else {
						if (event.asStartElement().getName().getLocalPart()
								.equals(SELF_START)) {
							event = eventReader.nextEvent();
							((Bike)vehicle).setSelfStart(event.asCharacters().getData());
							continue;
						}

						if (event.asStartElement().getName().getLocalPart()
								.equals(HELMET_PRICE)) {
							event = eventReader.nextEvent();
							((Bike)vehicle).setHelmetPrice(Integer.parseInt(event.asCharacters().getData()));
							continue;
						}
					}
				}
				// If we reach the end of an item element, we add it to the list
				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart() == (CAR) || endElement.getName().getLocalPart() == (BIKE)) {
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