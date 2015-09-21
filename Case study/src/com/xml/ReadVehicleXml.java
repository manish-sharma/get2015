/**
 * @author Pooja Khandelwal
 * @createdDate 20/09/2015
 * @name ReadVehicleXml
 * @description this is the class which read the vehicle attributes'(vehicle may be either car or bike) from vehicle.xml file
 */
package com.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import com.vehicle.Bike;
import com.vehicle.Car;
import com.vehicle.Vehicle;
import com.vehicle.VehicleAttributes;
import com.vehicle.VehicleTypes;

public class ReadVehicleXml {
	private static Vehicle vehicle;

	/**
	 * @name readConfig()
	 * @description this method read the xml file using SAX parsing algorithm
	 *              and then create either car or bike object and add it into a
	 *              vehiclesList
	 * @param configFile
	 *            (XML file name from where we it has to read the data)
	 * @return vehiclesList(list which may contain either car or bike or both
	 *         class objects)
	 */
	@SuppressWarnings({ "unchecked", "null" })
	public List<Vehicle> readConfig(String configFile) {
		List<Vehicle> vehiclesList = new ArrayList<Vehicle>();
		Car car = null;
		Bike bike = null;

		try {
			// First, create a new XMLInputFactory
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			// Setup a new eventReader
			InputStream in = new FileInputStream(configFile);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);

			// read the XML document until and unless next element is present in
			// XML
			while (eventReader.hasNext()) {
				// setting value for a next event of event reader or setting the
				// value of event by new element that is read
				XMLEvent event = eventReader.nextEvent();

				/* checks whether element read is start element or not */
				if (event.isStartElement()) {
					/* setting the read element as start element */
					StartElement startElement = event.asStartElement();
					// If we have an car element, we create a new car object
					if (startElement.getName().getLocalPart()
							.equalsIgnoreCase(VehicleTypes.Car.toString())) {
						car = new Car();
						vehicle = car;
					}
					// If we have an bike element, we create a new bike object
					else if (startElement.getName().getLocalPart()
							.equalsIgnoreCase(VehicleTypes.Bike.toString())) {
						bike = new Bike();
						vehicle = bike;
					}

					/*
					 * read different nodes of car or bike and their values and
					 * set the attributes' values of car or bike
					 */
					else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.createDTime.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setCreateDTime(Timestamp.valueOf(event
									.asCharacters().getData()));
						} else if (vehicle instanceof Bike) {
							bike.setCreateDTime(Timestamp.valueOf(event
									.asCharacters().getData()));
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(VehicleAttributes.make.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setMake(event.asCharacters().getData());
						} else if (vehicle instanceof Bike) {
							bike.setMake(event.asCharacters().getData());
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.model.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setModel(event.asCharacters().getData());
						} else if (vehicle instanceof Bike) {
							bike.setModel(event.asCharacters().getData());
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.engineInCC.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setEngineInCC(Integer.parseInt(event
									.asCharacters().getData()));
						} else if (vehicle instanceof Bike) {
							bike.setEngineInCC(Integer.parseInt(event
									.asCharacters().getData()));
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.fuelCapacity.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setFuelCapacity(Integer.parseInt(event
									.asCharacters().getData()));
						} else if (vehicle instanceof Bike) {
							bike.setFuelCapacity(Integer.parseInt(event
									.asCharacters().getData()));
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.milage.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setMilage(Integer.parseInt(event.asCharacters()
									.getData()));
						} else if (vehicle instanceof Bike) {
							bike.setMilage(Integer.parseInt(event
									.asCharacters().getData()));
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.price.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setPrice(Integer.parseInt(event.asCharacters()
									.getData()));
						} else if (vehicle instanceof Bike) {
							bike.setPrice(Integer.parseInt(event.asCharacters()
									.getData()));
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.roadTax.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setRoadTax(Integer.parseInt(event
									.asCharacters().getData()));
						} else if (vehicle instanceof Bike) {
							bike.setRoadTax(Integer.parseInt(event
									.asCharacters().getData()));
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.onRoadPrice.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setOnRoadPrice(Integer.parseInt(event
									.asCharacters().getData()));
						} else if (vehicle instanceof Bike) {
							bike.setOnRoadPrice(Integer.parseInt(event
									.asCharacters().getData()));
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.selfStart.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Bike) {
							bike.setSelfStart(Boolean.valueOf(event
									.asCharacters().getData()));
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.helmetPrice.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Bike) {
							bike.setHelmetPrice(Integer.parseInt(event
									.asCharacters().getData()));
						}
					} else if (startElement.getName().getLocalPart()
							.equalsIgnoreCase(VehicleAttributes.AC.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setAC(Boolean.valueOf(event.asCharacters()
									.getData()));
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.powerSteering.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setPowerSteering(Boolean.valueOf(event
									.asCharacters().getData()));
						}
					} else if (startElement
							.getName()
							.getLocalPart()
							.equalsIgnoreCase(
									VehicleAttributes.accessoryKit.toString())) {
						event = eventReader.nextEvent();
						if (vehicle instanceof Car) {
							car.setAccessoryKit(event.asCharacters().getData());
						}
					}
				}

				// If we reach the end of an item element, we add car or bike
				// object to the vehiclesList
				else if (event.isEndElement()) {
					EndElement endElement = event.asEndElement();
					if (endElement.getName().getLocalPart()
							.equalsIgnoreCase(VehicleTypes.Car.toString())) {
						vehiclesList.add(car);
					} else if (endElement.getName().getLocalPart()
							.equalsIgnoreCase(VehicleTypes.Bike.toString())) {
						vehiclesList.add(bike);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		return vehiclesList;
	}
}
