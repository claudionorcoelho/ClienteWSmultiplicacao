
package ws.org;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSMultiplicacao", targetNamespace = "http://org.ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSMultiplicacao {


    /**
     * 
     * @param segundoNum
     * @param primeiroNum
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Multiplicacao")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Multiplicacao", targetNamespace = "http://org.ws/", className = "ws.org.Multiplicacao")
    @ResponseWrapper(localName = "MultiplicacaoResponse", targetNamespace = "http://org.ws/", className = "ws.org.MultiplicacaoResponse")
    @Action(input = "http://org.ws/WSMultiplicacao/MultiplicacaoRequest", output = "http://org.ws/WSMultiplicacao/MultiplicacaoResponse")
    public double multiplicacao(
        @WebParam(name = "primeiroNum", targetNamespace = "")
        double primeiroNum,
        @WebParam(name = "segundoNum", targetNamespace = "")
        double segundoNum);

}
