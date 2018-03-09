package com.metacube;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

/**
 * This class calls the service method to convert the temperature
 * @author Akshita Dixit
 *
 */
public class TemperatureConversion {
	
	/**
	 * Main method that calls the service method to convert the temperature
	 * given as parameter.
	 * @param args
	 * @throws RemoteException
	 * @throws ServiceException
	 */
	public static void main(String args[]) throws RemoteException, ServiceException {
		
		ConvertToCelsiusServiceLocator obj = new ConvertToCelsiusServiceLocator();
		System.out.println(obj.getConvertToCelsius().convertToCelsius(-40));
	}
	
}
