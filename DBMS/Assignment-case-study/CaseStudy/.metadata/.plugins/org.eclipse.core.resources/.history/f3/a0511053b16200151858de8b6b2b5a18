package com.metacampus.vehiclemanagement.xml;
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


public class WriteConnectionXML {
	private String connectionFile;

	  public void setFile(String connectionFile) {
	    this.connectionFile = connectionFile;
	  }

	  public void saveConfig() throws Exception {
	    
		/* creating an XMLOutputFactory */
	    XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
	    
	    /* creating XMLEventWriter */
	    XMLEventWriter eventWriter = outputFactory
	        .createXMLEventWriter(new FileOutputStream(connectionFile));
	    
	    /* creating an EventFactory */
	    XMLEventFactory eventFactory = XMLEventFactory.newInstance();
	    XMLEvent end = eventFactory.createDTD("\n");
	    
	    /* creating and write Start Tag */
	    StartDocument startDocument = eventFactory.createStartDocument();
	    eventWriter.add(startDocument);

	    /* creating config open tag */
	    StartElement configStartElement = eventFactory.createStartElement("",
	        "", "connection");
	    eventWriter.add(configStartElement);
	    eventWriter.add(end);
	    
	    /* Writing the different nodes */
	    createNode(eventWriter, "url", "jdbc:mysql://localhost:3306/vehicle_management");
	    createNode(eventWriter, "driver", "com.mysql.jdbc.Driver");
	    createNode(eventWriter, "username", "root");
	    createNode(eventWriter, "password", "mysql");

	    eventWriter.add(eventFactory.createEndElement("", "", "connection"));
	    eventWriter.add(end);
	    eventWriter.add(eventFactory.createEndDocument());
	    eventWriter.close();
	  }

	  private void createNode(XMLEventWriter eventWriter, String name,
	      String value) throws XMLStreamException {

	    XMLEventFactory eventFactory = XMLEventFactory.newInstance();
	    XMLEvent end = eventFactory.createDTD("\n");
	    XMLEvent tab = eventFactory.createDTD("\t");
	    
	    /* creating Start node */
	    StartElement sElement = eventFactory.createStartElement("", "", name);
	    eventWriter.add(tab);
	    eventWriter.add(sElement);
	    
	    /* creating Content */
	    Characters characters = eventFactory.createCharacters(value);
	    eventWriter.add(characters);
	    
	    /* creating End node */
	    EndElement eElement = eventFactory.createEndElement("", "", name);
	    eventWriter.add(eElement);
	    eventWriter.add(end);

	  }

}
