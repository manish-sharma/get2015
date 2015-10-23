package vehicle.xmlParsing;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.SysexMessage;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import vehicle.pojoClasses.Bike;
import vehicle.pojoClasses.Car;
import vehicle.pojoClasses.Vehicle;

public class XmlParsing {
	/*
	 * static final String DATE = "date"; static final String ITEM = "item";
	 * static final String MODE = "mode"; static final String UNIT = "unit";
	 * static final String CURRENT = "current"; static final String INTERACTIVE
	 * = "interactive";
	 */

	static final String vehicleDetail = "vehicleDetail";
	static final String type = "type";
	static final String ID = "ID";
	static final String createdBy = "createdBy";
	static final String createdTime = "createdTime";
	static final String make = "make";
	static final String model = "model";
	static final String engineInCC = "engineInCC";
	static final String fuelCapacity = "fuelCapacity";
	static final String milage = "milage";
	static final String price = "price";
	static final String roadtax = "roadtax";

	static final String AC = "AC";
	static final String powerSteering = "powerSteering";

	static final String selfStart = "selfStart";
	static final String helmetPrice = "helmetPrice";

	@SuppressWarnings({ "unchecked", "null" })
	public java.util.List<Vehicle> readConfig(String configFile) {

		java.util.List<Vehicle> vehicles = new ArrayList<Vehicle>();
		// List<Item> items = new ArrayList<Item>();
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

				// System.out.println(event);
				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement();

					// If we have an item element, we create a new item
					if (startElement.getName().getLocalPart() == (vehicleDetail)) {

						// We read the attributes from this tag and add the date
						// attribute to our object
						Iterator<Attribute> attributes = startElement
								.getAttributes();
						while (attributes.hasNext()) {
							Attribute attribute = attributes.next();
							if (attribute.getName().toString().equals(type)) {
								if (attribute.getValue()
										.equalsIgnoreCase("CAR")) {
									System.out.println("In car");
									vehicle = new Car();
								} else {
									System.out.println("In bike" + "");
									vehicle = new Bike();
								}
							}
						}
					}

					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equals(ID)) {
							event = eventReader.nextEvent();

							vehicle.setID(event.asCharacters().getData());
							// System.out.println(vehicle.getID());
							continue;
						}
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(createdBy)) {
						event = eventReader.nextEvent();
						vehicle.setCreatedBy(event.asCharacters().getData());
						// System.out.println(vehicle.getCreatedBy());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(createdTime)) {
						event = eventReader.nextEvent();
						vehicle.setCreatedTime(event.asCharacters().getData());
						// System.out.println(vehicle.getCreatedTime());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(make)) {
						event = eventReader.nextEvent();
						vehicle.setMake(event.asCharacters().getData());
						// System.out.println(vehicle.getMake());
						continue;
					}
					if (event.asStartElement().getName().getLocalPart()
							.equals(model)) {
						event = eventReader.nextEvent();
						vehicle.setModel(event.asCharacters().getData());
						// System.out.println(vehicle.getModel());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(engineInCC)) {
						event = eventReader.nextEvent();
						vehicle.setEngineInCC(Integer.parseInt(event
								.asCharacters().getData()));
						// System.out.println(vehicle.getEngineInCC());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(fuelCapacity)) {
						event = eventReader.nextEvent();
						vehicle.setFuelCapacity(Integer.parseInt(event
								.asCharacters().getData()));
						// System.out.println(vehicle.getFuelCapacity());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(milage)) {
						event = eventReader.nextEvent();
						vehicle.setMilage(Integer.parseInt(event.asCharacters()
								.getData()));
						// System.out.println(vehicle.getMilage());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(price)) {
						event = eventReader.nextEvent();
						vehicle.setPrice(Integer.parseInt(event.asCharacters()
								.getData()));
						// System.out.println(vehicle.getPrice());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(roadtax)) {
						event = eventReader.nextEvent();
						vehicle.setRoadtax(Integer.parseInt(event
								.asCharacters().getData()));
						// System.out.println(vehicle.getRoadtax());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(AC)) {
						event = eventReader.nextEvent();
						((Car) vehicle).setAC(event.asCharacters().getData());
						// System.out.println(((Car) vehicle).getAC());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(powerSteering)) {
						event = eventReader.nextEvent();
						((Car) vehicle).setPowerSteering(event.asCharacters()
								.getData());
						// System.out.println(((Car)
						// vehicle).getPowerSteering());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(selfStart)) {
						event = eventReader.nextEvent();
						((Bike) vehicle).setSelfStart(event.asCharacters()
								.getData());
						// System.out.println(((Bike) vehicle).getSelfStart());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart()
							.equals(helmetPrice)) {
						event = eventReader.nextEvent();
						((Bike) vehicle).setHelmetPrice(Integer.parseInt(event
								.asCharacters().getData()));
						// System.out.println(((Bike)
						// vehicle).getHelmetPrice());
						continue;
					}
				}
				// If we reach the end of an item element, we add it to the
				// list
				if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart() == (vehicleDetail)) {
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
