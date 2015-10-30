package vehicles;
import java.io.FileOutputStream;

import javax.xml.stream.*;
import javax.xml.stream.events.*;

/**
 * to write the connection Xml
 * @author Ravika
 *
 */
public class WriteConnectionXML {
	private String connectionFile;
	/**
	 * set the path of file
	 * @param connectionFile
	 */
	  public void setFile(String connectionFile) {
	    this.connectionFile = connectionFile;
	  }
	  
	  /**
	   * to write the info of connection
	   * @throws Exception
	   */
	  public void saveConfig() throws Exception {
	    // create an XMLOutputFactory
	    XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
	    // create XMLEventWriter
	    XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(connectionFile));
	    // create an EventFactory
	    XMLEventFactory eventFactory = XMLEventFactory.newInstance();
	    XMLEvent end = eventFactory.createDTD("\n");
	    // create and write Start Tag
	    StartDocument startDocument = eventFactory.createStartDocument();
	    eventWriter.add(startDocument);

	    // create config open tag
	    StartElement configStartElement = eventFactory.createStartElement("", "", "connection");
	    eventWriter.add(configStartElement);
	    eventWriter.add(end);
	    // Write the different nodes
	    createNode(eventWriter, "url", "jdbc:mysql://localhost:3306/car_dekho");
	    createNode(eventWriter, "driver", "com.mysql.jdbc.Driver");
	    createNode(eventWriter, "username", "root");
	    createNode(eventWriter, "password", "mysql");

	    eventWriter.add(eventFactory.createEndElement("", "", "connection"));
	    eventWriter.add(end);
	    eventWriter.add(eventFactory.createEndDocument());
	    eventWriter.close();
	  }
	  /**
	   * create node of the tags 
	   * @param eventWriter
	   * @param name = name of tag
	   * @param value = value of the tag
	   * @throws XMLStreamException
	   */
	  private void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {

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

