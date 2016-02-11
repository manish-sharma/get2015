package com.sforce.soap.Example;

import java.net.URL;
import java.rmi.RemoteException;

import com.sforce.soap.enterprise.LoginResult;
import com.sforce.soap.enterprise.SessionHeader;
import com.sforce.soap.enterprise.SforceServiceLocator;
import com.sforce.soap.enterprise.SoapBindingStub;
import com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailBindingStub;
import com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailServiceLocator;

public class GetContactDetail {
	
	private final static String CONTACTID = "0032800000CNyGx";
	private final static String CONTACTNAME = "nikhil";
	private final static String CONTACTEMAIL = "nikhil.tinkar@meatcube.com";
	private final static String LOGINID = "nikhiltinkar@metacube.com";
	private final static String PASSWORD = "Nikhil@123";
	
	
	public static String getContactById(String Id,
			GetContactDetailBindingStub stub) {
		String ContactDetail = "";

		try {
			ContactDetail = stub.searchContactById(Id);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return ContactDetail;

	}

	public static String getContactByName(String Name,
			GetContactDetailBindingStub stub) {
		String ContactDetail = "";

		try {
			ContactDetail = stub.searchContactByName(Name);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return ContactDetail;
	}

	public static String getContactByEmail(String Email,
			GetContactDetailBindingStub stub) {
		String ContactDetail = "";

		try {
			ContactDetail =	stub.searchContactByEmail(Email);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return ContactDetail;

	}

	public static String getAllContact(GetContactDetailBindingStub stub) {
		String ContactDetail = "";

		try {
			ContactDetail =	stub.getAllContact();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return ContactDetail;
	}

	public static void main(String[] args) {

		try {

			// Get a stub for calling partner WSDL's login method in order to
			// get SessionID
			SoapBindingStub bind = (SoapBindingStub) new SforceServiceLocator()
					.getSoap();
			LoginResult lr = bind.login(LOGINID,
					PASSWORD);

			// Create a sessionHeader object and set its sessioId property to
			// sessionId
			// received in loginResult object
			SessionHeader sh = new SessionHeader();
			sh.setSessionId(lr.getSessionId());

			// Create a service locator object for your custom web service
			GetContactDetailServiceLocator locator = new GetContactDetailServiceLocator();

			// Get URL for your custom web service
			URL url = new URL(locator.getGetContactDetailAddress());

			// Create a stub for your custom web service with URL for your
			// service and locator as parameters
			GetContactDetailBindingStub stub = new GetContactDetailBindingStub(
					url, locator);

			// Set the header property of stub with name "SessionHeader" and
			// value as sh-sessionHeader
			// object created above
			stub.setHeader(locator.getGetContactDetailAddress(),
					"SessionHeader", sh);

			
			System.out.println("Search contact By Id \n"+getContactById(CONTACTID, stub));

			System.out.println("Search contact By Name \n"+getContactByName(CONTACTNAME, stub));
			

			System.out.println("Search contact By Email \n"+getContactByEmail(CONTACTEMAIL, stub));
			

			System.out.println("Get All  contacts \n"+getAllContact(stub));
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
