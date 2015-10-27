package vehicles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 * to read the XML of connection
 * @author Ravika
 * @since 9/22/2015
 */
public class ReadConnectionXml {
	
	 static final String CONNECTION = "connection";
	 static final String URL = "url";
	 static final String DRIVER = "driver";
	 static final String USERNAME = "username";
	 static final String PASSWORD = "password";

	  public ConnectionItems readConfig(String configFile) {
	   // List<ConnectionItems> connectionItemsList = new ArrayList<ConnectionItems>();
		  ConnectionItems connectionItem = null;
	    try {
	      // First, create a new XMLInputFactory
	      XMLInputFactory inputFactory = XMLInputFactory.newInstance();
	      // Setup a new eventReader
	      InputStream in = new FileInputStream(configFile);
	      XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
	      // read the XML document
	      connectionItem = null;

	      while (eventReader.hasNext()) {
	        XMLEvent event = eventReader.nextEvent();

	        if (event.isStartElement()) {
	          StartElement startElement = event.asStartElement();
	          // If we have an item element, we create a new item
	          if (startElement.getName().getLocalPart() == (CONNECTION)) {
	            connectionItem= new ConnectionItems();
	            continue;
	          }
	          if (event.asStartElement().getName().getLocalPart().equals(URL)) {
	        	  event = eventReader.nextEvent();
	        	  connectionItem.setUrl(event.asCharacters().getData());
	        	  continue;
	          }

	          if (event.asStartElement().getName().getLocalPart().equals(DRIVER)) {
	              event = eventReader.nextEvent();
	              connectionItem.setDriver(event.asCharacters().getData());
	              continue;
	          }
	        
	          if (event.asStartElement().getName().getLocalPart().equals(USERNAME)) {
	            event = eventReader.nextEvent();
	            connectionItem.setUsername(event.asCharacters().getData());
	            continue;
	          }

	          if (event.asStartElement().getName().getLocalPart().equals(PASSWORD)) {
	            event = eventReader.nextEvent();
	            connectionItem.setPassword(event.asCharacters().getData());
	            continue;
	          }

	  
	        }
	        // If we reach the end of an item element, we add it to the list
	        if (event.isEndElement()) {
	          EndElement endElement = event.asEndElement();
	          if (endElement.getName().getLocalPart() == CONNECTION) {
	      	    return connectionItem;
	          }
	        }

	      }
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (XMLStreamException e) {
	      e.printStackTrace();
	    }
	    return connectionItem;
	  }

	} 


