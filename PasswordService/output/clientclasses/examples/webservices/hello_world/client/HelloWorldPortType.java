
package examples.webservices.hello_world.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * Oracle JAX-WS 2.1.5
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HelloWorldPortType", targetNamespace = "http://hello_world.webservices.examples/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldPortType {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorld", targetNamespace = "http://hello_world.webservices.examples/", className = "examples.webservices.hello_world.client.SayHelloWorld")
    @ResponseWrapper(localName = "sayHelloWorldResponse", targetNamespace = "http://hello_world.webservices.examples/", className = "examples.webservices.hello_world.client.SayHelloWorldResponse")
    public String sayHelloWorld(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
