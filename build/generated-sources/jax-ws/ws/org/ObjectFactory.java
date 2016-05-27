
package ws.org;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.org package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Multiplicacao_QNAME = new QName("http://org.ws/", "Multiplicacao");
    private final static QName _MultiplicacaoResponse_QNAME = new QName("http://org.ws/", "MultiplicacaoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.org
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Multiplicacao }
     * 
     */
    public Multiplicacao createMultiplicacao() {
        return new Multiplicacao();
    }

    /**
     * Create an instance of {@link MultiplicacaoResponse }
     * 
     */
    public MultiplicacaoResponse createMultiplicacaoResponse() {
        return new MultiplicacaoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "Multiplicacao")
    public JAXBElement<Multiplicacao> createMultiplicacao(Multiplicacao value) {
        return new JAXBElement<Multiplicacao>(_Multiplicacao_QNAME, Multiplicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "MultiplicacaoResponse")
    public JAXBElement<MultiplicacaoResponse> createMultiplicacaoResponse(MultiplicacaoResponse value) {
        return new JAXBElement<MultiplicacaoResponse>(_MultiplicacaoResponse_QNAME, MultiplicacaoResponse.class, null, value);
    }

}
