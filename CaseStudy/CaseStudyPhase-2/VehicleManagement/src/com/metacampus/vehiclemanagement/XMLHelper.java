package com.metacampus.vehiclemanagement;

/*
 * @author neha
 * Date: 29 september 2015
 * Description: created for XML file parsing purpose
 */



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

import com.metacampus.vehiclemanagement.model.Bike;
import com.metacampus.vehiclemanagement.model.Car;
import com.metacampus.vehiclemanagement.model.Vehicle;



public class XMLHelper {
  static final String ITEM = "item";
  static final String BIKE = "bike";
  static final String CAR = "car";
  static final String VEHICLE_ID = "vehicleId";
  static final String MAKE = "make";
  static final String MODEL = "model";
  static final String ENGINE_IN_CC = "engineInCC";
  static final String FUEL_CAPACITY = "fuelCapacity";
  static final String MILAGE = "milage";
  static final String PRICE = "price";
  static final String ROAD_TAX = "roadTax";
  static final String CREATED_BY = "createdBy";
  static final String AC = "AC";
  static final String POWER_STEARING = "powerStearing";
  static final String ACCESSORY_KIT = "accessoryKit";
  static final String SELF_START = "selfStart";
  static final String HELMET_PRICE = "helmetPrice";
  
 

 
  public List<Vehicle> readConfig(String configFile) {
    List<Vehicle> vehicles = new ArrayList<Vehicle>();
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

        if (event.isStartElement()) 
        {
		          StartElement startElement = event.asStartElement();
		          // If we have an item element, we create a new item
		          if (startElement.getName().getLocalPart() == (ITEM)) 
		          {
		           
			            // We read the attributes from this tag and add the date
			            // attribute to our object
			            Iterator<Attribute> attributes = startElement.getAttributes();
			            while (attributes.hasNext()) 
			            {
				              Attribute attribute = attributes.next();
				             
				              if (attribute.getValue().equals(CAR)) 
				              {
				            	  vehicle = new Car();
				              }
				              else if (attribute.getValue().equals(BIKE))
				              {
				            	  vehicle = new Bike();
				              }
			
			            }
		          }
          
		          if (event.asStartElement().getName().getLocalPart()
		                  .equals(VEHICLE_ID)) 
		              {
		                event = eventReader.nextEvent();
		                vehicle.setVehicleId(Integer.parseInt(event.asCharacters().getData()));
		                continue;
		              }

		         
			          if (event.asStartElement().getName().getLocalPart()
			                .equals(MAKE)) 
			            {
			              event = eventReader.nextEvent();
			              vehicle.setMake(event.asCharacters().getData());
			              continue;
			            }
		        
		          
		          
		          if (event.asStartElement().getName().getLocalPart()
		              .equals(MODEL)) 
		          {
			            event = eventReader.nextEvent();
			            vehicle.setModel(event.asCharacters().getData());
			           
			            continue;
		          }
		          
		          
		
		          if (event.asStartElement().getName().getLocalPart()
		              .equals(ENGINE_IN_CC)) 
		          {
		            event = eventReader.nextEvent();
		            vehicle.setEngineInCC(event.asCharacters().getData());
		          
		            continue;
		          }
		          
		          
		
		          if (event.asStartElement().getName().getLocalPart()
		              .equals(FUEL_CAPACITY)) 
		          {
		            event = eventReader.nextEvent();
		            vehicle.setFuelCapacity(Double.parseDouble(event.asCharacters().getData()));
		            
		            continue;
		          }
		          
		          
		          if (event.asStartElement().getName().getLocalPart()
		                  .equals(MILAGE)) 
		              {
		                event = eventReader.nextEvent();
		                vehicle.setMilage(Double.parseDouble(event.asCharacters().getData()));
		               
		                continue;
		              }
		          
		          
		          if (event.asStartElement().getName().getLocalPart()
		                  .equals(PRICE)) 
		              {
		                event = eventReader.nextEvent();
		                vehicle.setPrice(Double.parseDouble(event.asCharacters().getData()));
		              
		                continue;
		              }
		          if (event.asStartElement().getName().getLocalPart()
		                  .equals(ROAD_TAX)) 
		              {
		                event = eventReader.nextEvent();
		                vehicle.setRoadTax(Double.parseDouble(event.asCharacters().getData()));
		                continue;
		              }
		          
		          
		          if (event.asStartElement().getName().getLocalPart()
		                  .equals(CREATED_BY)) 
		              {
		                event = eventReader.nextEvent();
		                vehicle.setCreatedBy(event.asCharacters().getData());
		                continue;
		              }
		          if (event.asStartElement().getName().getLocalPart()
		                   .equals(AC) )
		              {
		                event = eventReader.nextEvent();
		                ((Car) vehicle).setAC(Boolean.parseBoolean(event.asCharacters().getData()));
		                continue;
		              }
		          if (event.asStartElement().getName().getLocalPart()
		                  .equals(POWER_STEARING)) 
		              {
		                event = eventReader.nextEvent();
		                ((Car) vehicle).setPowerStearing(Boolean.parseBoolean(event.asCharacters().getData()));
		                continue;
		              }
		          if (event.asStartElement().getName().getLocalPart()
		                  .equals(ACCESSORY_KIT )) 
		              {
		                event = eventReader.nextEvent();
		                ((Car) vehicle).setAccessoryKit(event.asCharacters().getData());
		                continue;
		              }
		          if (event.asStartElement().getName().getLocalPart()
		                  .equals(SELF_START)) 
		              {
		                event = eventReader.nextEvent();
		                ((Bike) vehicle).setSelfStart(Boolean.parseBoolean(event.asCharacters().getData()));
		                continue;
		              }
		          
		          if (event.asStartElement().getName().getLocalPart()
		                  .equals(HELMET_PRICE)) 
		              {
		                event = eventReader.nextEvent();
		                ((Bike) vehicle).setHelmetPrice(Integer.parseInt(event.asCharacters().getData()));
		                continue;
		              }
        }
        // If we reach the end of an item element, we add it to the list
        if (event.isEndElement()) {
          EndElement endElement = event.asEndElement();
          if (endElement.getName().getLocalPart() == (ITEM)) {
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
