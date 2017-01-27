package VehicleXML;
/*
 * this class take the contents from XML file
 * @author Banwari kevat
 */
import helper.MyException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;




public class ReadConnectionXml 
{
	String connection = "connection";
	  String url = "url";
	  String driver = "driver";
	  String username = "username";
	  String password = "password";

	 
	  public ConnectionItems readConfig(String configFile) throws MyException 
	  {
	   
		  ConnectionItems connectionItem = null;
	    try
	    {
	      // First, create a new XMLInputFactory
	      XMLInputFactory inputFactory = XMLInputFactory.newInstance();
	      // Setup a new eventReader
	      InputStream in = new FileInputStream(configFile);
	      XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
	      // read the XML document
	      connectionItem = null;

	      while (eventReader.hasNext()) 
	      {
	        XMLEvent event = eventReader.nextEvent();

	        if (event.isStartElement()) 
	        {
	           StartElement startElement = event.asStartElement();
	           // If we have an item element, we create a new item
	           if (startElement.getName().getLocalPart() == (connection)) 
	            {
	              connectionItem= new ConnectionItems();
	            }
	         
	          if (event.isStartElement())
	          {
		            if (event.asStartElement().getName().getLocalPart().equals(url))
		            {
		              event = eventReader.nextEvent();
		              // put URL in connectionItem object
		              connectionItem.setUrl(event.asCharacters().getData());
		              continue;
		            }
		          }

	          if (event.isStartElement()) 
	          {
	            if (event.asStartElement().getName().getLocalPart().equals(driver))
	            {
	              event = eventReader.nextEvent();
	              // put driver in connectionItem object
	              connectionItem.setDriver(event.asCharacters().getData());	
	              continue;
	            }
	          }
	          if (event.asStartElement().getName().getLocalPart().equals(username)) 
	          {
	            event = eventReader.nextEvent();
	            // put username in connectionItem object
	            connectionItem.setUsername(event.asCharacters().getData()); 
	            continue;
	          }

	          if (event.asStartElement().getName().getLocalPart().equals(password)) 
	          {
	            event = eventReader.nextEvent();
	           // put password in connectionItem object
	            connectionItem.setPassword(event.asCharacters().getData()); 
	            continue;
	          }

	  
	        }
	        // reach on end element
	        if (event.isEndElement()) 
	        {
	        }

	      }
	    } catch (FileNotFoundException e) 
	    {
	    	throw new MyException(e);
	    } catch (XMLStreamException e) 
	    {
	    	throw new MyException(e);
	    }
	    return connectionItem;
	  }

	} 


