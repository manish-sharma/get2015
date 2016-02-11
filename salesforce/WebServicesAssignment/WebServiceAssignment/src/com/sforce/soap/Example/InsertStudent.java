package com.sforce.soap.Example;

import java.net.URL;

import com.sforce.soap.enterprise.LoginResult;
import com.sforce.soap.enterprise.SessionHeader;
import com.sforce.soap.enterprise.SforceServiceLocator;
import com.sforce.soap.enterprise.SoapBindingStub;
import com.sforce.soap.schemas._class.CreateStudent.CreateStudentBindingStub;
import com.sforce.soap.schemas._class.CreateStudent.CreateStudentServiceLocator;

public class InsertStudent {
	private final static String CLASSID = "a0628000004UBoq";
	private final static String CLASSNAME = "SAMPLE";	
	private final static String FIRSTNAME = "TEST";
	private final static String LASTNAME = "WebService";
	private final static String LOGINID = "nikhiltinkar@metacube.com";
	private final static String PASSWORD = "Nikhil@123";

	public static void main(String[] args) {

		try {

			// Get a stub for calling partner WSDL's login method in order to
			// get SessionID
			SoapBindingStub bind = (SoapBindingStub) new SforceServiceLocator()
					.getSoap();
			LoginResult lr = bind.login(LOGINID, PASSWORD);

			// Create a sessionHeader object and set its sessioId property to
			// sessionId
			// received in loginResult object
			SessionHeader sh = new SessionHeader();
			sh.setSessionId(lr.getSessionId());

			// Create a service locator object for your custom web service
			CreateStudentServiceLocator locator = new CreateStudentServiceLocator();

			// Get URL for your custom web service
			URL url = new URL(locator.getCreateStudentAddress());

			// Create a stub for your custom web service with URL for your
			// service and locator as parameters
			CreateStudentBindingStub stub = new CreateStudentBindingStub(
					url, locator);

			// Set the header property of stub with name "SessionHeader" and
			// value as sh-sessionHeader
			// object created above
			stub.setHeader(locator.getCreateStudentAddress(),
					"SessionHeader", sh);

			System.out.println("Insert Student in Existing class.  Id Of Student is  \n"
					+ stub.createStudentWithClassid(FIRSTNAME, LASTNAME, CLASSID));

			System.out.println("Id of Recently Created Student is -- \n"
					+ stub.createStudentWithRequiredField(FIRSTNAME, LASTNAME, CLASSNAME));

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
