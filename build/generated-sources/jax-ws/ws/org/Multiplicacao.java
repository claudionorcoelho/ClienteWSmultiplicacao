
package ws.org;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Multiplicacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Multiplicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primeiroNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="segundoNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Multiplicacao", propOrder = {
    "primeiroNum",
    "segundoNum"
})
public class Multiplicacao {

    protected double primeiroNum;
    protected double segundoNum;

    /**
     * Obtém o valor da propriedade primeiroNum.
     * 
     */
    public double getPrimeiroNum() {
        return primeiroNum;
    }

    /**
     * Define o valor da propriedade primeiroNum.
     * 
     */
    public void setPrimeiroNum(double value) {
        this.primeiroNum = value;
    }

    /**
     * Obtém o valor da propriedade segundoNum.
     * 
     */
    public double getSegundoNum() {
        return segundoNum;
    }

    /**
     * Define o valor da propriedade segundoNum.
     * 
     */
    public void setSegundoNum(double value) {
        this.segundoNum = value;
    }

}
