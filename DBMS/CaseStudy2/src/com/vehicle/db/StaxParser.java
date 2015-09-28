package com.vehicle.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import com.vehicle.core.Bike;
import com.vehicle.core.Car;
import com.vehicle.core.Vehicle;

/**
 * This class performs the parsing of the xml file and extracts the data from
 * xml files and stores it in the object and stores that object into list
 * depending upon the type
 * 
 * @author Shishir Date 22nd September 2015
 *
 */
public class StaxParser {

	static final String ROW = "row";
	static final String TYPE = "type";
	static final String VEHICLEID = "vehicleId";
	static final String MAKE = "make";
	static final String MODEL = "model";
	static final String ENGINEINCC = "engineInCC";
	static final String FUELCAPACITY = "fuelCapacity";
	static final String MILEAGE = "mileage";
	static final String PRICE = "price";
	static final String ROADTAX = "roadTax";
	static final String AC = "ac";
	static final String POWERSTEERING = "powerSteering";
	static final String ACCESSORYKIT = "accessoryKit";
	static final String SELFSTART = "selfStart";
	static final String HELMETPRICE = "helmetPrice";

	public List<Vehicle> readConfig(String configFile) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		try {
			// create a new XMLInputFactory
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			// Setup a new eventReader
			InputStream in = new FileInputStream(configFile);
			// read the XML document
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);

			Vehicle vehicle = null;

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				if (event.isStartElement()) {
					// If we have an item element, we create a new item
					StartElement startElement = event.asStartElement();

					if (startElement.getName().getLocalPart() == (ROW)) {
						@SuppressWarnings("unchecked")
						Iterator<Attribute> attributes = startElement
								.getAttributes();
						while (attributes.hasNext()) {
							Attribute attribute = attributes.next();
							if (attribute.getName().getLocalPart().equals(TYPE)) {
								if (attribute.getValue()
										.equalsIgnoreCase("car")) {
									vehicle = new Car();
								} else {
									vehicle = new Bike();
								}
							}
						}
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(VEHICLEID)) {
						event = eventReader.nextEvent();
						vehicle.setVehicleID(Integer.parseInt(event
								.asCharacters().getData()));
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(MAKE)) {
						event = eventReader.nextEvent();
						vehicle.setMake(event.asCharacters().getData());
						continue;
					}
				}

				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(MODEL)) {
						event = eventReader.nextEvent();
						vehicle.setModel(event.asCharacters().getData());
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(ENGINEINCC)) {
						event = eventReader.nextEvent();
						vehicle.setEngineInCC(Integer.parseInt(event
								.asCharacters().getData()));
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(FUELCAPACITY)) {
						event = eventReader.nextEvent();
						vehicle.setFuelCapacity(Integer.parseInt(event
								.asCharacters().getData()));
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(MILEAGE)) {
						event = eventReader.nextEvent();
						vehicle.setMileage(Integer.parseInt(event
								.asCharacters().getData()));
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(PRICE)) {
						event = eventReader.nextEvent();
						vehicle.setPrice(Float.parseFloat(event.asCharacters()
								.getData()));
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(ROADTAX)) {
						event = eventReader.nextEvent();
						vehicle.setRoadTax(Float.parseFloat(event
								.asCharacters().getData()));
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(AC)) {
						event = eventReader.nextEvent();
						((Car) vehicle).setAC(Boolean.parseBoolean(event
								.asCharacters().getData()));
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(POWERSTEERING)) {
						event = eventReader.nextEvent();
						((Car) vehicle).setPowerSteering(Boolean
								.parseBoolean(event.asCharacters().getData()));
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(ACCESSORYKIT)) {
						event = eventReader.nextEvent();
						((Car) vehicle).setAccessoryKit(event.asCharacters()
								.getData());
						vehicles.add(vehicle);
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(SELFSTART)) {
						event = eventReader.nextEvent();
						((Bike) vehicle).setSelfStart(Boolean
								.parseBoolean(event.asCharacters().getData()));
						continue;
					}
				}
				if (event.isStartElement()) {
					if (event.asStartElement().getName().getLocalPart()
							.equals(HELMETPRICE)) {
						event = eventReader.nextEvent();
						((Bike) vehicle).setHelmetPrice(Integer.parseInt(event
								.asCharacters().getData()));
						vehicles.add(vehicle);
						continue;
					}
				}
				// If we reach the end of an item element, we add it to the

				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart() == (ROW)) {

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