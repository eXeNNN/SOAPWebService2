package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.namespace.QName;
import pkg.HelloWorld;

public class Cliente {

	public static void main(String[] args) throws MalformedURLException {
		
		ExampleService servicio = new ExampleService(new URL("http://localhost:8080/HelloServer/HelloWorldWS?wsdl"), new QName("http://pkg/", "HelloWorldImplService"));
		
		HelloWorld variable = servicio.getinit();
        System.out.println(variable.add("Pedro Fdez"));
        System.out.println(variable.addnumber(3, 8));
        System.out.println(variable.restnumber(12, 9));
        System.out.println(variable.dividenumber(12, 6));
        System.out.println(variable.multiplynumber(3, 4));
		
	}
}

@WebServiceClient
class ExampleService extends Service {
	
	protected ExampleService(URL wsdlDocumentation, QName serviceName) {
		super(wsdlDocumentation, serviceName);
	}
	
	@WebEndpoint(name = "HelloWorld")
	public HelloWorld getinit() {
		return super.getPort(new QName("http://pkg/", "HelloWorldImplPort"), HelloWorld.class);
	}
	 
}

