
package com.company1c.orgregister.corporation;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.company1c.orgregister.corporation package. 
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

    private final static QName _АдресСостав_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u0421\u043e\u0441\u0442\u0430\u0432");
    private final static QName _АдресРФСвРайМОСвМО_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u0421\u0432\u041c\u041e");
    private final static QName _АдресРФСвРайМОРайон_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u0420\u0430\u0439\u043e\u043d");
    private final static QName _АдресРФОКТМО_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u041e\u041a\u0422\u041c\u041e");
    private final static QName _АдресРФСубъектРФ_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u0420\u0424");
    private final static QName _АдресРФМестоположение_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u041c\u0435\u0441\u0442\u043e\u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435");
    private final static QName _АдресРФГород_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u0413\u043e\u0440\u043e\u0434");
    private final static QName _АдресРФНаселПункт_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442");
    private final static QName _АдресРФУлица_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u0423\u043b\u0438\u0446\u0430");
    private final static QName _АдресРФСвРайМО_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u0421\u0432\u0420\u0430\u0439\u041c\u041e");
    private final static QName _АдресРФВнутригРайон_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u0412\u043d\u0443\u0442\u0440\u0438\u0433\u0420\u0430\u0439\u043e\u043d");
    private final static QName _АдресРФАдресПоДокументу_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u0410\u0434\u0440\u0435\u0441_\u043f\u043e_\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0443");
    private final static QName _АдресРФОКАТО_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u041e\u041a\u0410\u0422\u041e");
    private final static QName _АдресРФОкруг_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u041e\u043a\u0440\u0443\u0433");
    private final static QName _АдресРФДопАдрЭлНомер_QNAME = new QName("http://company1c.com/orgregister/corporation", "\u041d\u043e\u043c\u0435\u0440");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.company1c.orgregister.corporation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица }
     * 
     */
    public РеквизитыЮрЛица createРеквизитыЮрЛица() {
        return new РеквизитыЮрЛица();
    }

    /**
     * Create an instance of {@link АдресРФ }
     * 
     */
    public АдресРФ createАдресРФ() {
        return new АдресРФ();
    }

    /**
     * Create an instance of {@link АдресРФ.ДопАдрЭл }
     * 
     */
    public АдресРФ.ДопАдрЭл createАдресРФДопАдрЭл() {
        return new АдресРФ.ДопАдрЭл();
    }

    /**
     * Create an instance of {@link АдресРФ.СвРайМО }
     * 
     */
    public АдресРФ.СвРайМО createАдресРФСвРайМО() {
        return new АдресРФ.СвРайМО();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвРегФСС }
     * 
     */
    public РеквизитыЮрЛица.СвРегФСС createРеквизитыЮрЛицаСвРегФСС() {
        return new РеквизитыЮрЛица.СвРегФСС();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвРегПФ }
     * 
     */
    public РеквизитыЮрЛица.СвРегПФ createРеквизитыЮрЛицаСвРегПФ() {
        return new РеквизитыЮрЛица.СвРегПФ();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвСтатусРО }
     * 
     */
    public РеквизитыЮрЛица.СвСтатусРО createРеквизитыЮрЛицаСвСтатусРО() {
        return new РеквизитыЮрЛица.СвСтатусРО();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвУчетНО }
     * 
     */
    public РеквизитыЮрЛица.СвУчетНО createРеквизитыЮрЛицаСвУчетНО() {
        return new РеквизитыЮрЛица.СвУчетНО();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвУправлДеят }
     * 
     */
    public РеквизитыЮрЛица.СвУправлДеят createРеквизитыЮрЛицаСвУправлДеят() {
        return new РеквизитыЮрЛица.СвУправлДеят();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвУправлДеят.УпрОргИн }
     * 
     */
    public РеквизитыЮрЛица.СвУправлДеят.УпрОргИн createРеквизитыЮрЛицаСвУправлДеятУпрОргИн() {
        return new РеквизитыЮрЛица.СвУправлДеят.УпрОргИн();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ }
     * 
     */
    public РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ createРеквизитыЮрЛицаСвУправлДеятСведДолжнФЛ() {
        return new РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвНаимЮЛ }
     * 
     */
    public РеквизитыЮрЛица.СвНаимЮЛ createРеквизитыЮрЛицаСвНаимЮЛ() {
        return new РеквизитыЮрЛица.СвНаимЮЛ();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвАдрес }
     * 
     */
    public РеквизитыЮрЛица.СвАдрес createРеквизитыЮрЛицаСвАдрес() {
        return new РеквизитыЮрЛица.СвАдрес();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвОКВЭД }
     * 
     */
    public РеквизитыЮрЛица.СвОКВЭД createРеквизитыЮрЛицаСвОКВЭД() {
        return new РеквизитыЮрЛица.СвОКВЭД();
    }

    /**
     * Create an instance of {@link CorporationSearchResult }
     * 
     */
    public CorporationSearchResult createCorporationSearchResult() {
        return new CorporationSearchResult();
    }

    /**
     * Create an instance of {@link СвРегИнТип }
     * 
     */
    public СвРегИнТип createСвРегИнТип() {
        return new СвРегИнТип();
    }

    /**
     * Create an instance of {@link ФИОТип }
     * 
     */
    public ФИОТип createФИОТип() {
        return new ФИОТип();
    }

    /**
     * Create an instance of {@link Адрес }
     * 
     */
    public Адрес createАдрес() {
        return new Адрес();
    }

    /**
     * Create an instance of {@link ОПФВыпТип }
     * 
     */
    public ОПФВыпТип createОПФВыпТип() {
        return new ОПФВыпТип();
    }

    /**
     * Create an instance of {@link СвРегОргТип }
     * 
     */
    public СвРегОргТип createСвРегОргТип() {
        return new СвРегОргТип();
    }

    /**
     * Create an instance of {@link АдресРФ.ДопАдрЭл.Номер }
     * 
     */
    public АдресРФ.ДопАдрЭл.Номер createАдресРФДопАдрЭлНомер() {
        return new АдресРФ.ДопАдрЭл.Номер();
    }

    /**
     * Create an instance of {@link АдресРФ.СвРайМО.СвМО }
     * 
     */
    public АдресРФ.СвРайМО.СвМО createАдресРФСвРайМОСвМО() {
        return new АдресРФ.СвРайМО.СвМО();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвРегФСС.СвОргФСС }
     * 
     */
    public РеквизитыЮрЛица.СвРегФСС.СвОргФСС createРеквизитыЮрЛицаСвРегФСССвОргФСС() {
        return new РеквизитыЮрЛица.СвРегФСС.СвОргФСС();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвРегПФ.СвОргПФ }
     * 
     */
    public РеквизитыЮрЛица.СвРегПФ.СвОргПФ createРеквизитыЮрЛицаСвРегПФСвОргПФ() {
        return new РеквизитыЮрЛица.СвРегПФ.СвОргПФ();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвСтатусРО.СвСтатус }
     * 
     */
    public РеквизитыЮрЛица.СвСтатусРО.СвСтатус createРеквизитыЮрЛицаСвСтатусРОСвСтатус() {
        return new РеквизитыЮрЛица.СвСтатусРО.СвСтатус();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвУчетНО.СвНО }
     * 
     */
    public РеквизитыЮрЛица.СвУчетНО.СвНО createРеквизитыЮрЛицаСвУчетНОСвНО() {
        return new РеквизитыЮрЛица.СвУчетНО.СвНО();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвУправлДеят.УпрОргРос }
     * 
     */
    public РеквизитыЮрЛица.СвУправлДеят.УпрОргРос createРеквизитыЮрЛицаСвУправлДеятУпрОргРос() {
        return new РеквизитыЮрЛица.СвУправлДеят.УпрОргРос();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвУправлДеят.УпрОргИн.ПредИнЮЛ }
     * 
     */
    public РеквизитыЮрЛица.СвУправлДеят.УпрОргИн.ПредИнЮЛ createРеквизитыЮрЛицаСвУправлДеятУпрОргИнПредИнЮЛ() {
        return new РеквизитыЮрЛица.СвУправлДеят.УпрОргИн.ПредИнЮЛ();
    }

    /**
     * Create an instance of {@link РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ.СвДискв }
     * 
     */
    public РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ.СвДискв createРеквизитыЮрЛицаСвУправлДеятСведДолжнФЛСвДискв() {
        return new РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ.СвДискв();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u0421\u043e\u0441\u0442\u0430\u0432", scope = Адрес.class)
    public JAXBElement<Object> createАдресСостав(Object value) {
        return new JAXBElement<Object>(_АдресСостав_QNAME, Object.class, Адрес.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link АдресРФ.СвРайМО.СвМО }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u0421\u0432\u041c\u041e", scope = АдресРФ.СвРайМО.class)
    public JAXBElement<АдресРФ.СвРайМО.СвМО> createАдресРФСвРайМОСвМО(АдресРФ.СвРайМО.СвМО value) {
        return new JAXBElement<АдресРФ.СвРайМО.СвМО>(_АдресРФСвРайМОСвМО_QNAME, АдресРФ.СвРайМО.СвМО.class, АдресРФ.СвРайМО.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u0420\u0430\u0439\u043e\u043d", scope = АдресРФ.СвРайМО.class)
    public JAXBElement<String> createАдресРФСвРайМОРайон(String value) {
        return new JAXBElement<String>(_АдресРФСвРайМОРайон_QNAME, String.class, АдресРФ.СвРайМО.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u041e\u041a\u0422\u041c\u041e", scope = АдресРФ.class)
    public JAXBElement<BigInteger> createАдресРФОКТМО(BigInteger value) {
        return new JAXBElement<BigInteger>(_АдресРФОКТМО_QNAME, BigInteger.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u0420\u0424", scope = АдресРФ.class)
    public JAXBElement<String> createАдресРФСубъектРФ(String value) {
        return new JAXBElement<String>(_АдресРФСубъектРФ_QNAME, String.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u041c\u0435\u0441\u0442\u043e\u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435", scope = АдресРФ.class)
    public JAXBElement<String> createАдресРФМестоположение(String value) {
        return new JAXBElement<String>(_АдресРФМестоположение_QNAME, String.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u0413\u043e\u0440\u043e\u0434", scope = АдресРФ.class)
    public JAXBElement<String> createАдресРФГород(String value) {
        return new JAXBElement<String>(_АдресРФГород_QNAME, String.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442", scope = АдресРФ.class)
    public JAXBElement<String> createАдресРФНаселПункт(String value) {
        return new JAXBElement<String>(_АдресРФНаселПункт_QNAME, String.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u0423\u043b\u0438\u0446\u0430", scope = АдресРФ.class)
    public JAXBElement<String> createАдресРФУлица(String value) {
        return new JAXBElement<String>(_АдресРФУлица_QNAME, String.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link АдресРФ.СвРайМО }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u0421\u0432\u0420\u0430\u0439\u041c\u041e", scope = АдресРФ.class)
    public JAXBElement<АдресРФ.СвРайМО> createАдресРФСвРайМО(АдресРФ.СвРайМО value) {
        return new JAXBElement<АдресРФ.СвРайМО>(_АдресРФСвРайМО_QNAME, АдресРФ.СвРайМО.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u0412\u043d\u0443\u0442\u0440\u0438\u0433\u0420\u0430\u0439\u043e\u043d", scope = АдресРФ.class)
    public JAXBElement<String> createАдресРФВнутригРайон(String value) {
        return new JAXBElement<String>(_АдресРФВнутригРайон_QNAME, String.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u0410\u0434\u0440\u0435\u0441_\u043f\u043e_\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0443", scope = АдресРФ.class)
    public JAXBElement<String> createАдресРФАдресПоДокументу(String value) {
        return new JAXBElement<String>(_АдресРФАдресПоДокументу_QNAME, String.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u041e\u041a\u0410\u0422\u041e", scope = АдресРФ.class)
    public JAXBElement<BigInteger> createАдресРФОКАТО(BigInteger value) {
        return new JAXBElement<BigInteger>(_АдресРФОКАТО_QNAME, BigInteger.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u041e\u043a\u0440\u0443\u0433", scope = АдресРФ.class)
    public JAXBElement<String> createАдресРФОкруг(String value) {
        return new JAXBElement<String>(_АдресРФОкруг_QNAME, String.class, АдресРФ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link АдресРФ.ДопАдрЭл.Номер }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://company1c.com/orgregister/corporation", name = "\u041d\u043e\u043c\u0435\u0440", scope = АдресРФ.ДопАдрЭл.class)
    public JAXBElement<АдресРФ.ДопАдрЭл.Номер> createАдресРФДопАдрЭлНомер(АдресРФ.ДопАдрЭл.Номер value) {
        return new JAXBElement<АдресРФ.ДопАдрЭл.Номер>(_АдресРФДопАдрЭлНомер_QNAME, АдресРФ.ДопАдрЭл.Номер.class, АдресРФ.ДопАдрЭл.class, value);
    }

}
