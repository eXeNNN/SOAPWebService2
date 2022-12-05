/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pkg;

public interface HelloWorld extends java.rmi.Remote {
    public java.lang.String add(java.lang.String name) throws java.rmi.RemoteException;
    public int addnumber(int value1, int value2) throws java.rmi.RemoteException;
    public int restnumber(int value1, int value2) throws java.rmi.RemoteException;
    public int multiplynumber(int value1, int value2) throws java.rmi.RemoteException;
    public int dividenumber(int value1, int value2) throws java.rmi.RemoteException;
}
