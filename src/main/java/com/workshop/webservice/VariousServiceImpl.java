package main.java.com.workshop.webservice;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(name = "VariousServiceImpl",
        serviceName = "VariousServiceImpl",
        portName = "VariousServicePort",
        targetNamespace = "http://www.mjtoolbox.com/workshop"
)

@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
        use = SOAPBinding.Use.LITERAL,
        parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
/**
 * This is jax-ws
 */
public class VariousServiceImpl {


    @WebMethod(operationName = "testWebService")
    @WebResult(name = "testWebServiceResult")
    public String testWebService(@WebParam(name = "name")String param){
        return "Hello " + param;
    }


}