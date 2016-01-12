package VehicleXML;

/*
 * this class take the contents from XML file for insert in database
 * @author banwari kevat
 */
import helper.MyException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import model.*;

public class ReadInputXml {
	
	  
	  String CREATEDBY = "createdby";
	  String VEHICLE = "vehicle";
	  String CAR = "Car";
	  String BIKE = "Bike";
	  String ENGINEINCC = "enginecc";
	  String FUELCAPACITY = "fuelcapacity";
	  String MAKE = "make";
	  String MILAGE = "milage";
	  String MODEL = "model";
	  String PRICE = "price";
	  String ROADTAX = "roadtax";
	  String AC = "ac";
	  String ACCESSORYKIT = "accessorykit";
	  String POWERSTEERING = "powersteering";
	  String HELMETPRICE = "helmetprice";
	  String SELFSTART = "selfstart";

	  public List<Vehicle> readConfig(String configFile) throws MyException
	  {
	   	  List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		  Vehicle vehicle = null;
		
	    try 
	    {
	      //create XMLInputFactory
	      XMLInputFactory inputFactory = XMLInputFactory.newInstance();
	      // Setup eventReader
	      InputStream inputStream = new FileInputStream(configFile);
	      XMLEventReader eventReader = inputFactory.createXMLEventReader(inputStream);
	      // read the XML document
	      vehicle = null;
	      XMLEvent event;

	      while (eventReader.hasNext())
	      {
	        event = eventReader.nextEvent();
	        if (event.isStartElement())
	        {
	          StartElement startElement = event.asStartElement();
	          // If we have an item element, we create a new item
	          if (startElement.getName().getLocalPart() == (VEHICLE)) 
	          {
	            //vehicle = new Vehicle();
	            // We read the attributes from this tag and add the date
	            // attribute to our object
	            @SuppressWarnings("unchecked")
				Iterator<Attribute> attributes = startElement.getAttributes();
	           
	        	   Attribute attribute = attributes.next();
	        	   if (attribute.getName().toString().equals("name"))
	        	   {
			           if (CAR.equals(attribute.getValue())) 
			           {
			               vehicle = new Car();
			         
			            }
			           else
			           {
			        	   vehicle = new Bike();
			        	   
			           }
	        	   }
	        	   continue;
	            
	          }
	        
	          if (event.isStartElement()) {
		          if (event.asStartElement().getName().getLocalPart()
		              .equals(CREATEDBY)) {
		            event = eventReader.nextEvent();
		            vehicle.setCreated_By((event.asCharacters().getData()));
		            continue;
		          }
	          }
	          
	          if (event.isStartElement()) {
		            if (event.asStartElement().getName().getLocalPart()
		                .equals(ENGINEINCC)) {
		              event = eventReader.nextEvent();
		              vehicle.setEnginInCC(Integer.parseInt(event.asCharacters().getData()));
		              continue;
		            }
		          }

	          if (event.isStartElement()) {
	            if (event.asStartElement().getName().getLocalPart()
	                .equals(FUELCAPACITY)) {
	              event = eventReader.nextEvent();
	              vehicle.setFuelCapacity(Integer.parseInt(event.asCharacters().getData()));
	              continue;
	            }
	          }
	          if (event.isStartElement()) {
		          if (event.asStartElement().getName().getLocalPart()
		              .equals(MAKE)) {
		            event = eventReader.nextEvent();
		            vehicle.setMake((event.asCharacters().getData()));
		            continue;
		          }
	          }
	          if (event.isStartElement()) {
		          if (event.asStartElement().getName().getLocalPart()
		              .equals(MILAGE)) {
		            event = eventReader.nextEvent();
		            vehicle.setMilage(Integer.parseInt(event.asCharacters().getData()));
		            continue;
		          }
	          }
	          if (event.isStartElement()) {
		          if (event.asStartElement().getName().getLocalPart()
			              .equals(MODEL)) {
			            event = eventReader.nextEvent();
			            vehicle.setModel((event.asCharacters().getData()));
			            continue;
			          }
	          }
	          if (event.isStartElement()) {
		          if (event.asStartElement().getName().getLocalPart()
			              .equals(PRICE)) {
			            event = eventReader.nextEvent();
			            vehicle.setPrice(Double.parseDouble(event.asCharacters().getData()));
			            continue;
			          }
	          }
	          if (event.isStartElement()) {
		          if (event.asStartElement().getName().getLocalPart()
			              .equals(ROADTAX)) {
			            event = eventReader.nextEvent();
			            vehicle.setRoadTax(Double.parseDouble(event.asCharacters().getData()));
			            continue;
			          }
	          }
	          if (event.isStartElement()) {
	        	  boolean ac = false;
	        	  if (event.asStartElement().getName().getLocalPart()
			              .equals(AC)) {
	        		  event = eventReader.nextEvent();
		        	  if( event.asCharacters().getData().equals("YES") )
		        	  {
		        		  ac = true;
		        		  ((Car)vehicle).setAC(ac);
		        		  continue;
		        	  }
	        	  }
	          }
	          if (event.isStartElement()) {
	        	  boolean ackit = false;
	        	  if (event.asStartElement().getName().getLocalPart()
			              .equals(ACCESSORYKIT)) {
	        		  event = eventReader.nextEvent();
		        	  if( event.asCharacters().getData().equals("YES") )
		        	  {
		        		  ackit = true;
		        		  ((Car)vehicle).setAccessoryKit(ackit);
		        		  continue;
		        	  }
	        	  }
	          }
	          if (event.isStartElement()) {
	        	  boolean psteering = false;
	        	  if (event.asStartElement().getName().getLocalPart()
			              .equals(POWERSTEERING)) {
	        		  event = eventReader.nextEvent();
		        	  if( event.asCharacters().getData().equals("YES") )
		        	  {
		        		  psteering = true;
		        		  ((Car)vehicle).setPowerSteering(psteering);
		        		  continue;
		        	  }
	        	  }
	          }
	          if (event.isStartElement()) {
	        	  if (event.asStartElement().getName().getLocalPart()
			              .equals(HELMETPRICE)) {
			            event = eventReader.nextEvent();
			            ((Bike)vehicle).setHelmetPrize((Double.parseDouble(event.asCharacters().getData())));
			            continue;
			          }
	          }
	          if (event.isStartElement()) {
	        	  boolean selfStart = false;
	        	  if (event.asStartElement().getName().getLocalPart()
			              .equals(SELFSTART)) {
	        		  event = eventReader.nextEvent();
		        	  if( event.asCharacters().getData().equals("YES") )
		        	  {
		        		  selfStart = true;
		        		  ((Bike)vehicle).setSelfStart(selfStart);
		        		  continue;
		        	  }
	        	  }
	          }
	        }
	        
	        // If we reach the end of an item element, we add it to the list
	        if (event.isEndElement()) {
	          EndElement endElement = event.asEndElement();
	          if (endElement.getName().getLocalPart() == ("vehicle")) {
	        	  java.util.Date today = new java.util.Date();
	      		  java.sql.Date date = new java.sql.Date(today.getTime());
	      		  vehicle.setCreated_Time(date);
	        	  vehicleList.add(vehicle);
	        	  continue;
	            //connectionItemsList.add(connectionItems);
	          }
	        }
	      

	      }
	    } catch (FileNotFoundException e) {
	    	throw new MyException(e);
	    } catch (XMLStreamException e) {
	    	throw new MyException(e);
	    }
	    return vehicleList;
	  }
}
