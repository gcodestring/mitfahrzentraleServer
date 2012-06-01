//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.20 at 10:43:40 AM CEST 
//


package de.mfz.jaxb;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.mfz.jaxb package. 
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

    private final static QName _Sitze_QNAME = new QName("", "sitze");
    private final static QName _Kfznamme_QNAME = new QName("", "kfznamme");
    private final static QName _Startpunkt_QNAME = new QName("", "startpunkt");
    private final static QName _Email_QNAME = new QName("", "email");
    private final static QName _Mobil_QNAME = new QName("", "mobil");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Zielpunkt_QNAME = new QName("", "zielpunkt");
    private final static QName _Telefon_QNAME = new QName("", "telefon");
    private final static QName _Startzeitpunkt_QNAME = new QName("", "startzeitpunkt");
    private final static QName _Zwichenstopp_QNAME = new QName("", "zwichenstopp");
    private final static QName _Password_QNAME = new QName("", "password");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.mfz.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mitfahrer }
     * 
     */
    public Mitfahrer createMitfahrer() {
        return new Mitfahrer();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link Fahrer }
     * 
     */
    public Fahrer createFahrer(Person person) {
        Fahrer fahrer = new Fahrer();
        fahrer.setPerson(person);
        return fahrer;
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Fahrten }
     * 
     */
    public Fahrten createFahrten() {
        return new Fahrten();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link Mitfahrzentrale }
     * 
     */
    public Mitfahrzentrale createMitfahrzentrale() {
        return new Mitfahrzentrale();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sitze")
    public JAXBElement<BigInteger> createSitze(BigInteger value) {
        return new JAXBElement<BigInteger>(_Sitze_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kfznamme")
    public JAXBElement<String> createKfznamme(String value) {
        return new JAXBElement<String>(_Kfznamme_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startpunkt")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStartpunkt(String value) {
        return new JAXBElement<String>(_Startpunkt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mobil")
    public JAXBElement<BigInteger> createMobil(BigInteger value) {
        return new JAXBElement<BigInteger>(_Mobil_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zielpunkt")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createZielpunkt(String value) {
        return new JAXBElement<String>(_Zielpunkt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "telefon")
    public JAXBElement<BigInteger> createTelefon(BigInteger value) {
        return new JAXBElement<BigInteger>(_Telefon_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startzeitpunkt")
    public JAXBElement<String> createStartzeitpunkt(String value) {
        return new JAXBElement<String>(_Startzeitpunkt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zwichenstopp")
    public JAXBElement<String> createZwichenstopp(String value) {
        return new JAXBElement<String>(_Zwichenstopp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "password")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

}