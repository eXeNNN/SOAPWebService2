/**
 * HelloWorldImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pkg;

public interface HelloWorldImplService extends javax.xml.rpc.Service {
    public java.lang.String getHelloWorldImplPortAddress();

    public pkg.HelloWorld getHelloWorldImplPort() throws javax.xml.rpc.ServiceException;

    public pkg.HelloWorld getHelloWorldImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
