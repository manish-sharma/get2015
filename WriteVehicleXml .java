/**
 * @author sumitra
 * @description this is the class which writes the data into the vehicle.xml file
 */
package com.xml;

import java.io.FileOutputStream;
import java.sql.Timestamp;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import com.vehicle.modelClasses.VehicleAttributes;
import com.vehicle.modelClasses.VehicleTypes;

public class WriteVehicleXml {
	private String vehicleFile;

	/**
	 * @name setFile()
	 * @description it sets the value of vehicleFile by the name of XML file
	 * @param vehicleFile
	 *            (name of XML file in which we have to write)
	 * @return
	 */
	public void setFile(String vehicleFile) {
		this.vehicleFile = vehicleFile;
	}

	/**
	 * @name saveConfigCar()
	 * @description this method creates the vehicle.xml file
	 * @param
	 * @throws Exception
	 * @return
	 */
	public void saveConfigCar(String make,String model,String engineInCC,String fuelCapacity ,
			               String  milage ,String price , String roadTax,String Ac,String powerSteering,String accessoryKit) throws Exception {
		java.util.Date date = new java.util.Date();
		
		// create an XMLOutputFactory
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		// create XMLEventWriter
		XMLEventWriter eventWriter = outputFactory
				.createXMLEventWriter(new FileOutputStream(vehicleFile));
		// create an EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");

		// create and write Start Tag
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);

		// create vehicle open tag
		StartElement configStartElement = eventFactory.createStartElement("",
				"", "vehicle");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		// create car open tag
		StartElement configStartElementNewVehicle = eventFactory
				.createStartElement("", "", VehicleTypes.Car.toString());
		eventWriter.add(configStartElementNewVehicle);
		eventWriter.add(end);
//create node
		createNode(eventWriter, VehicleAttributes.make.toString(), make);
		createNode(eventWriter, VehicleAttributes.createDTime.toString(),
				(new Timestamp(date.getTime())).toString());
		createNode(eventWriter, VehicleAttributes.model.toString(), model);
		createNode(eventWriter, VehicleAttributes.engineInCC.toString(),
				engineInCC);
		createNode(eventWriter, VehicleAttributes.fuelCapacity.toString(),
				fuelCapacity);
		createNode(eventWriter, VehicleAttributes.milage.toString(), milage);
		createNode(eventWriter, VehicleAttributes.price.toString(), price);
		createNode(eventWriter, VehicleAttributes.roadTax.toString(), roadTax);

		createNode(eventWriter, VehicleAttributes.AC.toString(), Ac);
		createNode(eventWriter, VehicleAttributes.powerSteering.toString(),
				powerSteering);
		createNode(eventWriter, VehicleAttributes.accessoryKit.toString(),
				accessoryKit);

		// create car close tag
		eventWriter.add(eventFactory.createEndElement("", "",
				VehicleTypes.Car.toString()));
		eventWriter.add(end);

		
		// create vehicle close tag
		eventWriter.add(eventFactory.createEndElement("", "", "vehicle"));
		eventWriter.add(end);

		// create and write End Tag
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}
	

	/**
	 * @name saveConfigBike()
	 * @description this method creates the vehicle.xml file
	 * @param
	 * @throws Exception
	 * @return
	 */
public void saveConfigBike(String make,String model,String engineInCC,String fuelCapacity ,
            String  milage ,String price , String roadTax,String selfStart,String helmetPrice) throws Exception {
java.util.Date date = new java.util.Date();
// create an XMLOutputFactory
XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
// create XMLEventWriter
XMLEventWriter eventWriter = outputFactory
	.createXMLEventWriter(new FileOutputStream(vehicleFile));
// create an EventFactory
XMLEventFactory eventFactory = XMLEventFactory.newInstance();
XMLEvent end = eventFactory.createDTD("\n");

// create and write Start Tag
StartDocument startDocument = eventFactory.createStartDocument();
eventWriter.add(startDocument);

// create vehicle open tag
StartElement configStartElement = eventFactory.createStartElement("",
	"", "vehicle");
eventWriter.add(configStartElement);
eventWriter.add(end);

//create bike open tag
	StartElement configStartElementNewVehicle = eventFactory.createStartElement("", "",
				VehicleTypes.Bike.toString());
		eventWriter.add(configStartElementNewVehicle);
		eventWriter.add(end);

		// Write the different nodes of bike
		createNode(eventWriter, VehicleAttributes.make.toString(),
				make);
		createNode(eventWriter, VehicleAttributes.createDTime.toString(),
				(new Timestamp(date.getTime())).toString());
		createNode(eventWriter, VehicleAttributes.model.toString(),
				model);
		createNode(eventWriter, VehicleAttributes.engineInCC.toString(), engineInCC);
		createNode(eventWriter, VehicleAttributes.fuelCapacity.toString(), fuelCapacity);
		createNode(eventWriter, VehicleAttributes.milage.toString(), milage);
		createNode(eventWriter, VehicleAttributes.price.toString(), price);
		createNode(eventWriter, VehicleAttributes.roadTax.toString(), roadTax);

		createNode(eventWriter, VehicleAttributes.selfStart.toString(), selfStart);
		createNode(eventWriter, VehicleAttributes.helmetPrice.toString(),
				helmetPrice);

		// create bike close tag
		eventWriter.add(eventFactory.createEndElement("", "",
				VehicleTypes.Bike.toString()));
		eventWriter.add(end);
		
		// create vehicle close tag
		eventWriter.add(eventFactory.createEndElement("", "", "vehicle"));
		eventWriter.add(end);

		// create and write End Tag
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	/**
	 * @name createNode()
	 * @description this method will create a node of vehicle(either of car or
	 *              bike )in XML file
	 * @param eventWriter
	 * @param name
	 *            (attribute name for which we have to set the data in XML)
	 * @param value
	 *            (attribute value)
	 * @return
	 * @throws XMLStreamException
	 */
	private void createNode(XMLEventWriter eventWriter, String name,
			String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");

		// create Start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);

		// create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);

		// create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);

	}
}
