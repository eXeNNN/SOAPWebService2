package com.wsclient;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import pkg.HelloWorld;
import pkg.HelloWorldImplPortBindingStub;
import pkg.HelloWorldImplService;
import pkg.HelloWorldImplServiceLocator;

public class Main {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		
		HelloWorldImplService service = new HelloWorldImplServiceLocator();
		
		HelloWorld ws = new HelloWorldImplPortBindingStub(new URL(service.getHelloWorldImplPortAddress()), service);
		
		
		System.out.println("Suma: " + ws.addnumber(4, 8));
		System.out.println("Resta: " + ws.restnumber(10, 3));
		System.out.println("Multiplicación: " + ws.multiplynumber(3, 5));
		System.out.println("División: " + ws.dividenumber(6, 3));
		System.out.println("Imprimir bienvenida: " + ws.add("Pedro"));
		
	}

}
