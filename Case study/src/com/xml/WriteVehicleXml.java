/**
 * @author Pooja Khandelwal
 * @createdDate 20/09/2015
 * @name WriteVehicleXml
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

import com.vehicle.VehicleAttributes;
import com.vehicle.VehicleTypes;

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
	 * @name saveConfig()
	 * @description this method creates the vehicle.xml file
	 * @param
	 * @throws Exception
	 * @return
	 */
	public void saveConfig() throws Exception {
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

		// Write the different nodes of car
		createNode(eventWriter, VehicleAttributes.make.toString(), "Ford");
		createNode(eventWriter, VehicleAttributes.createDTime.toString(),
				(new Timestamp(date.getTime())).toString());
		createNode(eventWriter, VehicleAttributes.model.toString(), "EcoSport");
		createNode(eventWriter, VehicleAttributes.engineInCC.toString(), "2000");
		createNode(eventWriter, VehicleAttributes.fuelCapacity.toString(), "50");
		createNode(eventWriter, VehicleAttributes.milage.toString(), "22");
		createNode(eventWriter, VehicleAttributes.price.toString(), "850009");
		createNode(eventWriter, VehicleAttributes.roadTax.toString(), "40049");

		createNode(eventWriter, VehicleAttributes.AC.toString(), "true");
		createNode(eventWriter, VehicleAttributes.powerSteering.toString(),
				"true");
		createNode(eventWriter, VehicleAttributes.accessoryKit.toString(),
				"Radio , Cd Player");

		// create car close tag
		eventWriter.add(eventFactory.createEndElement("", "",
				VehicleTypes.Car.toString()));
		eventWriter.add(end);

		// create bike open tag
		configStartElementNewVehicle = eventFactory.createStartElement("", "",
				VehicleTypes.Bike.toString());
		eventWriter.add(configStartElementNewVehicle);
		eventWriter.add(end);

		// Write the different nodes of bike
		createNode(eventWriter, VehicleAttributes.make.toString(),
				"Royal Enfield");
		createNode(eventWriter, VehicleAttributes.createDTime.toString(),
				(new Timestamp(date.getTime())).toString());
		createNode(eventWriter, VehicleAttributes.model.toString(),
				"Bullet 300");
		createNode(eventWriter, VehicleAttributes.engineInCC.toString(), "350");
		createNode(eventWriter, VehicleAttributes.fuelCapacity.toString(), "15");
		createNode(eventWriter, VehicleAttributes.milage.toString(), "30");
		createNode(eventWriter, VehicleAttributes.price.toString(), "120009");
		createNode(eventWriter, VehicleAttributes.roadTax.toString(), "150049");

		createNode(eventWriter, VehicleAttributes.selfStart.toString(), "true");
		createNode(eventWriter, VehicleAttributes.helmetPrice.toString(),
				"1500");

		// create bike close tag
		eventWriter.add(eventFactory.createEndElement("", "",
				VehicleTypes.Bike.toString()));
		eventWriter.add(end);

		// create car open tag
		configStartElementNewVehicle = eventFactory.createStartElement("", "",
				VehicleTypes.Car.toString());
		eventWriter.add(configStartElementNewVehicle);
		eventWriter.add(end);

		// Write the different nodes of car
		createNode(eventWriter, VehicleAttributes.make.toString(), "Ford1");
		createNode(eventWriter, VehicleAttributes.createDTime.toString(),
				(new Timestamp(date.getTime())).toString());
		createNode(eventWriter, VehicleAttributes.model.toString(), "EcoSport1");
		createNode(eventWriter, VehicleAttributes.engineInCC.toString(),
				"20001");
		createNode(eventWriter, VehicleAttributes.fuelCapacity.toString(),
				"501");
		createNode(eventWriter, VehicleAttributes.milage.toString(), "221");
		createNode(eventWriter, VehicleAttributes.price.toString(), "8500091");
		createNode(eventWriter, VehicleAttributes.roadTax.toString(), "400491");

		createNode(eventWriter, VehicleAttributes.AC.toString(), "false");
		createNode(eventWriter, VehicleAttributes.powerSteering.toString(),
				"false");
		createNode(eventWriter, VehicleAttributes.accessoryKit.toString(),
				"Radio , Cd Player1");

		// create car close tag
		eventWriter.add(eventFactory.createEndElement("", "",
				VehicleTypes.Car.toString()));
		eventWriter.add(end);

		// create bike open tag
		configStartElementNewVehicle = eventFactory.createStartElement("", "",
				VehicleTypes.Bike.toString());
		eventWriter.add(configStartElementNewVehicle);
		eventWriter.add(end);

		// Write the different nodes of bike
		createNode(eventWriter, VehicleAttributes.make.toString(),
				"Royal Enfield1");
		createNode(eventWriter, VehicleAttributes.createDTime.toString(),
				(new Timestamp(date.getTime())).toString());
		createNode(eventWriter, VehicleAttributes.model.toString(),
				"Bullet 3001");
		createNode(eventWriter, VehicleAttributes.engineInCC.toString(), "3501");
		createNode(eventWriter, VehicleAttributes.fuelCapacity.toString(),
				"151");
		createNode(eventWriter, VehicleAttributes.milage.toString(), "301");
		createNode(eventWriter, VehicleAttributes.price.toString(), "1200091");
		createNode(eventWriter, VehicleAttributes.roadTax.toString(), "1500491");

		createNode(eventWriter, VehicleAttributes.selfStart.toString(), "false");
		createNode(eventWriter, VehicleAttributes.helmetPrice.toString(),
				"15001");

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
