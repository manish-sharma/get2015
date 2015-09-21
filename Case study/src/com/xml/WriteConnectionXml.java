/**
 * @author Pooja Khandelwal
 * @createdDate 20/09/2015
 * @name WriteConnectionXml
 * @description this is the class which writes the data into the connection.xml file
 */
package com.xml;

import java.io.FileOutputStream;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import com.connection.ConnectionAttributes;

public class WriteConnectionXml {
	private String connectionFile;

	/**
	 * @name setFile()
	 * @description it sets the value of connectionFile by the name of XML file
	 * @param connectionFile
	 *            (nmae of XML file in which we have to write)
	 * @return
	 */
	public void setFile(String connectionFile) {
		this.connectionFile = connectionFile;
	}

	/**
	 * @name saveConfig()
	 * @description this method creates the connection.xml file
	 * @param
	 * @throws Exception
	 * @return
	 */
	public void saveConfig() throws Exception {
		// create an XMLOutputFactory
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		// create XMLEventWriter
		XMLEventWriter eventWriter = outputFactory
				.createXMLEventWriter(new FileOutputStream(connectionFile));
		// create an EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");

		// create and write Start Tag
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);

		// create and write connection open tag
		StartElement configStartElement = eventFactory.createStartElement("",
				"", "connection");
		eventWriter.add(configStartElement);
		// create and write jdbc open tag
		StartElement configStartElement1 = eventFactory.createStartElement("",
				"", "jdbc");
		eventWriter.add(configStartElement1);
		eventWriter.add(end);
		eventWriter.add(end);

		// Write the different nodes
		createNode(eventWriter, ConnectionAttributes.url.toString(),
				"jdbc:mysql://localhost:3306/Vehicle");
		createNode(eventWriter, ConnectionAttributes.driver.toString(),
				"com.mysql.jdbc.Driver");
		createNode(eventWriter, ConnectionAttributes.username.toString(),
				"root");
		createNode(eventWriter, ConnectionAttributes.password.toString(),
				"mysql");

		// create and write jdbc close tag
		eventWriter.add(eventFactory.createEndElement("", "", "jdbc"));
		eventWriter.add(end);
		// create and write connection close tag
		eventWriter.add(eventFactory.createEndElement("", "", "connection"));
		eventWriter.add(end);

		// create and write End Tag
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	/**
	 * @name createNode()
	 * @description this method will create a node of connection in XML file
	 * @param eventWriter
	 * @param name
	 *            (attribute name for which we have to set the data in xml)
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
		// create Content for a new node
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
