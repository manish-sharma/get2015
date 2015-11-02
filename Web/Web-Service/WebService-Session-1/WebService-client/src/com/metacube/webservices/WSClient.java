package com.metacube.webservices;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class WSClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerServiceLocator sLocator=new ServerServiceLocator();
		sLocator.setServerEndpointAddress("http://localhost:8080/WebService-Assignment-1/services/Server");
		
		try {
			Server server=sLocator.getServer();
			System.out.println(server.fahrenheitToCelsius(77));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
