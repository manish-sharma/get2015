package vehicles;

import java.io.FileOutputStream;
import java.text.AttributedCharacterIterator.Attribute;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxWriter {
  private String configFile;

  public void setFile(String configFile) {
	  this.configFile = configFile;
  }

  public void saveConfig() throws Exception {
	  // create an XMLOutputFactory
	  XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
	  // create XMLEventWriter
	  XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(configFile));
	  // create an EventFactory
	  XMLEventFactory eventFactory = XMLEventFactory.newInstance();
	  XMLEvent end = eventFactory.createDTD("\n");
	  XMLEvent tab = eventFactory.createDTD("\t");

	  // create and write Start Tag
	  StartDocument startDocument = eventFactory.createStartDocument();
	  eventWriter.add(startDocument);
	  eventWriter.add(end);

	  // create config open tag
	  StartElement configStartElement = eventFactory.createStartElement("","", "config");
	  eventWriter.add(configStartElement);
	  eventWriter.add(end);
	  eventWriter.add(tab);

	  configStartElement = eventFactory.createStartElement("","", "Vehicle");
	  eventWriter.add(configStartElement);
	  eventWriter.add(end);
	  // Write the different nodes
	  createNode(eventWriter, "Type", VehicleType.CAR.toString());
	  createNode(eventWriter, "Model", "EcoSport");
	  createNode(eventWriter, "Make", "Ford");
	  createNode(eventWriter, "EngineInCC", "2000");
	  createNode(eventWriter, "FuelCapacity", "50");
	  createNode(eventWriter, "Milage", "22");
	  createNode(eventWriter, "Price", "850000");
	  createNode(eventWriter, "RoadTax", "40049");
 
	  eventWriter.add(tab);
	  eventWriter.add(eventFactory.createEndElement("", "", "Vehicle"));
	  eventWriter.add(end);
	  eventWriter.add(eventFactory.createEndElement("", "", "config"));
	  eventWriter.add(end);
	  eventWriter.add(eventFactory.createEndDocument());
	  eventWriter.close();
  }

  private void createNode(XMLEventWriter eventWriter, String name,String value) throws XMLStreamException {

	  XMLEventFactory eventFactory = XMLEventFactory.newInstance();
	  XMLEvent end = eventFactory.createDTD("\n");
	  XMLEvent tab = eventFactory.createDTD("\t\t");
	  // create Start node
	  StartElement sElement = eventFactory.createStartElement("", "", name);
	  eventWriter.add(end);
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