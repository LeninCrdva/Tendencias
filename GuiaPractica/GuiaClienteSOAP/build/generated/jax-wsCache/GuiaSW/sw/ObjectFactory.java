
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
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

    private final static QName _CalcularEnergiaCinetica_QNAME = new QName("http://sw/", "calcularEnergiaCinetica");
    private final static QName _CalcularEnergiaCineticaResponse_QNAME = new QName("http://sw/", "calcularEnergiaCineticaResponse");
    private final static QName _CalcularFuerza_QNAME = new QName("http://sw/", "calcularFuerza");
    private final static QName _CalcularFuerzaResponse_QNAME = new QName("http://sw/", "calcularFuerzaResponse");
    private final static QName _CalcularVelocidad_QNAME = new QName("http://sw/", "calcularVelocidad");
    private final static QName _CalcularVelocidadResponse_QNAME = new QName("http://sw/", "calcularVelocidadResponse");
    private final static QName _Login_QNAME = new QName("http://sw/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://sw/", "loginResponse");
    private final static QName _OperacionDivision_QNAME = new QName("http://sw/", "operacionDivision");
    private final static QName _OperacionDivisionResponse_QNAME = new QName("http://sw/", "operacionDivisionResponse");
    private final static QName _OperacionMultiplicacion_QNAME = new QName("http://sw/", "operacionMultiplicacion");
    private final static QName _OperacionMultiplicacionResponse_QNAME = new QName("http://sw/", "operacionMultiplicacionResponse");
    private final static QName _OperacionResta_QNAME = new QName("http://sw/", "operacionResta");
    private final static QName _OperacionRestaResponse_QNAME = new QName("http://sw/", "operacionRestaResponse");
    private final static QName _OperacionSuma_QNAME = new QName("http://sw/", "operacionSuma");
    private final static QName _OperacionSumaResponse_QNAME = new QName("http://sw/", "operacionSumaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularEnergiaCinetica }
     * 
     */
    public CalcularEnergiaCinetica createCalcularEnergiaCinetica() {
        return new CalcularEnergiaCinetica();
    }

    /**
     * Create an instance of {@link CalcularEnergiaCineticaResponse }
     * 
     */
    public CalcularEnergiaCineticaResponse createCalcularEnergiaCineticaResponse() {
        return new CalcularEnergiaCineticaResponse();
    }

    /**
     * Create an instance of {@link CalcularFuerza }
     * 
     */
    public CalcularFuerza createCalcularFuerza() {
        return new CalcularFuerza();
    }

    /**
     * Create an instance of {@link CalcularFuerzaResponse }
     * 
     */
    public CalcularFuerzaResponse createCalcularFuerzaResponse() {
        return new CalcularFuerzaResponse();
    }

    /**
     * Create an instance of {@link CalcularVelocidad }
     * 
     */
    public CalcularVelocidad createCalcularVelocidad() {
        return new CalcularVelocidad();
    }

    /**
     * Create an instance of {@link CalcularVelocidadResponse }
     * 
     */
    public CalcularVelocidadResponse createCalcularVelocidadResponse() {
        return new CalcularVelocidadResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link OperacionDivision }
     * 
     */
    public OperacionDivision createOperacionDivision() {
        return new OperacionDivision();
    }

    /**
     * Create an instance of {@link OperacionDivisionResponse }
     * 
     */
    public OperacionDivisionResponse createOperacionDivisionResponse() {
        return new OperacionDivisionResponse();
    }

    /**
     * Create an instance of {@link OperacionMultiplicacion }
     * 
     */
    public OperacionMultiplicacion createOperacionMultiplicacion() {
        return new OperacionMultiplicacion();
    }

    /**
     * Create an instance of {@link OperacionMultiplicacionResponse }
     * 
     */
    public OperacionMultiplicacionResponse createOperacionMultiplicacionResponse() {
        return new OperacionMultiplicacionResponse();
    }

    /**
     * Create an instance of {@link OperacionResta }
     * 
     */
    public OperacionResta createOperacionResta() {
        return new OperacionResta();
    }

    /**
     * Create an instance of {@link OperacionRestaResponse }
     * 
     */
    public OperacionRestaResponse createOperacionRestaResponse() {
        return new OperacionRestaResponse();
    }

    /**
     * Create an instance of {@link OperacionSuma }
     * 
     */
    public OperacionSuma createOperacionSuma() {
        return new OperacionSuma();
    }

    /**
     * Create an instance of {@link OperacionSumaResponse }
     * 
     */
    public OperacionSumaResponse createOperacionSumaResponse() {
        return new OperacionSumaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularEnergiaCinetica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularEnergiaCinetica }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "calcularEnergiaCinetica")
    public JAXBElement<CalcularEnergiaCinetica> createCalcularEnergiaCinetica(CalcularEnergiaCinetica value) {
        return new JAXBElement<CalcularEnergiaCinetica>(_CalcularEnergiaCinetica_QNAME, CalcularEnergiaCinetica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularEnergiaCineticaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularEnergiaCineticaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "calcularEnergiaCineticaResponse")
    public JAXBElement<CalcularEnergiaCineticaResponse> createCalcularEnergiaCineticaResponse(CalcularEnergiaCineticaResponse value) {
        return new JAXBElement<CalcularEnergiaCineticaResponse>(_CalcularEnergiaCineticaResponse_QNAME, CalcularEnergiaCineticaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularFuerza }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularFuerza }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "calcularFuerza")
    public JAXBElement<CalcularFuerza> createCalcularFuerza(CalcularFuerza value) {
        return new JAXBElement<CalcularFuerza>(_CalcularFuerza_QNAME, CalcularFuerza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularFuerzaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularFuerzaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "calcularFuerzaResponse")
    public JAXBElement<CalcularFuerzaResponse> createCalcularFuerzaResponse(CalcularFuerzaResponse value) {
        return new JAXBElement<CalcularFuerzaResponse>(_CalcularFuerzaResponse_QNAME, CalcularFuerzaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularVelocidad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularVelocidad }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "calcularVelocidad")
    public JAXBElement<CalcularVelocidad> createCalcularVelocidad(CalcularVelocidad value) {
        return new JAXBElement<CalcularVelocidad>(_CalcularVelocidad_QNAME, CalcularVelocidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularVelocidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularVelocidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "calcularVelocidadResponse")
    public JAXBElement<CalcularVelocidadResponse> createCalcularVelocidadResponse(CalcularVelocidadResponse value) {
        return new JAXBElement<CalcularVelocidadResponse>(_CalcularVelocidadResponse_QNAME, CalcularVelocidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionDivision }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionDivision }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "operacionDivision")
    public JAXBElement<OperacionDivision> createOperacionDivision(OperacionDivision value) {
        return new JAXBElement<OperacionDivision>(_OperacionDivision_QNAME, OperacionDivision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionDivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionDivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "operacionDivisionResponse")
    public JAXBElement<OperacionDivisionResponse> createOperacionDivisionResponse(OperacionDivisionResponse value) {
        return new JAXBElement<OperacionDivisionResponse>(_OperacionDivisionResponse_QNAME, OperacionDivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionMultiplicacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionMultiplicacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "operacionMultiplicacion")
    public JAXBElement<OperacionMultiplicacion> createOperacionMultiplicacion(OperacionMultiplicacion value) {
        return new JAXBElement<OperacionMultiplicacion>(_OperacionMultiplicacion_QNAME, OperacionMultiplicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionMultiplicacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionMultiplicacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "operacionMultiplicacionResponse")
    public JAXBElement<OperacionMultiplicacionResponse> createOperacionMultiplicacionResponse(OperacionMultiplicacionResponse value) {
        return new JAXBElement<OperacionMultiplicacionResponse>(_OperacionMultiplicacionResponse_QNAME, OperacionMultiplicacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionResta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionResta }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "operacionResta")
    public JAXBElement<OperacionResta> createOperacionResta(OperacionResta value) {
        return new JAXBElement<OperacionResta>(_OperacionResta_QNAME, OperacionResta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionRestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionRestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "operacionRestaResponse")
    public JAXBElement<OperacionRestaResponse> createOperacionRestaResponse(OperacionRestaResponse value) {
        return new JAXBElement<OperacionRestaResponse>(_OperacionRestaResponse_QNAME, OperacionRestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionSuma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionSuma }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "operacionSuma")
    public JAXBElement<OperacionSuma> createOperacionSuma(OperacionSuma value) {
        return new JAXBElement<OperacionSuma>(_OperacionSuma_QNAME, OperacionSuma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionSumaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionSumaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "operacionSumaResponse")
    public JAXBElement<OperacionSumaResponse> createOperacionSumaResponse(OperacionSumaResponse value) {
        return new JAXBElement<OperacionSumaResponse>(_OperacionSumaResponse_QNAME, OperacionSumaResponse.class, null, value);
    }

}
