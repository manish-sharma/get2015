/**
 * @author Pooja Khandelwal
 * @createdDate 20/09/2015
 * @name ReadConnectionXml
 * @description this is the class which read the connection attributes' from connection.xml file
 */
package com.xml;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import com.connection.ConnectionAttributes;

public class ReadConnectionXml {
	/**
	 * @name readConfig()
	 * @description this method read the xml file using SAX parsing algorithm
	 *              and then create a object of connectionItems class
	 * @param configFile
	 *            (.xml file name from where we it has to read the data)
	 * @param connectionAttribute
	 *            (any attribute name which is required for getting connection)
	 * @return connectionItem(object of ConnectionItems class in which all read
	 *         data are set)
	 */
	@SuppressWarnings({ "unchecked", "null" })
	public ConnectionItems readConfig(String configFile,
			ConnectionAttributes connectionAttribute) {
		String url = null;
		String driver = null;
		String username = null;
		String password = null;

		/* checks the connection attribute name */
		if (connectionAttribute.equals(ConnectionAttributes.url)) {
			url = connectionAttribute.toString();
		} else if (connectionAttribute.equals(ConnectionAttributes.driver)) {
			driver = connectionAttribute.toString();
		} else if (connectionAttribute.equals(ConnectionAttributes.username)) {
			username = connectionAttribute.toString();
		} else if (connectionAttribute.equals(ConnectionAttributes.password)) {
			password = connectionAttribute.toString();
		}
		ConnectionItems connectionItem = null;

		try {
			// First, create a new XMLInputFactory
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			// Setup a new eventReader
			InputStream in = new FileInputStream(configFile);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);

			// read the XML document until and unless next element is present in
			// XML
			while (eventReader.hasNext()) {
				// setting value for a next event of event reader or setting the
				// value of event by new element that is read
				XMLEvent event = eventReader.nextEvent();

				/* checks whether element read is start element or not */
				if (event.isStartElement()) {
					/* setting the read element as start element */
					StartElement startElement = event.asStartElement();
					// If we have an connection element, we create a new
					// connection item
					if (startElement.getName().getLocalPart() == ((connectionAttribute)
							.toString())) {
						connectionItem = new ConnectionItems();
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equalsIgnoreCase(url)) {
							event = eventReader.nextEvent();
							connectionItem.setUrl(event.asCharacters()
									.getData());
							continue;
						}
					}
					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart()
								.equalsIgnoreCase(driver)) {
							event = eventReader.nextEvent();
							connectionItem.setDriver(event.asCharacters()
									.getData());
							continue;
						}
					}
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(username)) {
						event = eventReader.nextEvent();
						connectionItem.setUsername(event.asCharacters()
								.getData());
						continue;
					}
					if (event.asStartElement().getName().getLocalPart()
							.equalsIgnoreCase(password)) {
						event = eventReader.nextEvent();
						connectionItem.setPassword(event.asCharacters()
								.getData());
						continue;
					}
				}

				// If we reach the end of an connection element
				if (event.isEndElement()) {
					// set the end element that is read
					EndElement endElement = event.asEndElement();
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
