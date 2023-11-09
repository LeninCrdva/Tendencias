
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _CerrarSesion_QNAME = new QName("http://ws/", "cerrarSesion");
    private final static QName _CerrarSesionResponse_QNAME = new QName("http://ws/", "cerrarSesionResponse");
    private final static QName _ConsultarNombreUsuario_QNAME = new QName("http://ws/", "consultarNombreUsuario");
    private final static QName _ConsultarNombreUsuarioResponse_QNAME = new QName("http://ws/", "consultarNombreUsuarioResponse");
    private final static QName _ConsultarSaldo_QNAME = new QName("http://ws/", "consultarSaldo");
    private final static QName _ConsultarSaldoResponse_QNAME = new QName("http://ws/", "consultarSaldoResponse");
    private final static QName _DepositarSaldo_QNAME = new QName("http://ws/", "depositarSaldo");
    private final static QName _DepositarSaldoResponse_QNAME = new QName("http://ws/", "depositarSaldoResponse");
    private final static QName _Login_QNAME = new QName("http://ws/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "loginResponse");
    private final static QName _RegistrarCliente_QNAME = new QName("http://ws/", "registrarCliente");
    private final static QName _RegistrarClienteResponse_QNAME = new QName("http://ws/", "registrarClienteResponse");
    private final static QName _RetirarSaldo_QNAME = new QName("http://ws/", "retirarSaldo");
    private final static QName _RetirarSaldoResponse_QNAME = new QName("http://ws/", "retirarSaldoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CerrarSesion }
     * 
     */
    public CerrarSesion createCerrarSesion() {
        return new CerrarSesion();
    }

    /**
     * Create an instance of {@link CerrarSesionResponse }
     * 
     */
    public CerrarSesionResponse createCerrarSesionResponse() {
        return new CerrarSesionResponse();
    }

    /**
     * Create an instance of {@link ConsultarNombreUsuario }
     * 
     */
    public ConsultarNombreUsuario createConsultarNombreUsuario() {
        return new ConsultarNombreUsuario();
    }

    /**
     * Create an instance of {@link ConsultarNombreUsuarioResponse }
     * 
     */
    public ConsultarNombreUsuarioResponse createConsultarNombreUsuarioResponse() {
        return new ConsultarNombreUsuarioResponse();
    }

    /**
     * Create an instance of {@link ConsultarSaldo }
     * 
     */
    public ConsultarSaldo createConsultarSaldo() {
        return new ConsultarSaldo();
    }

    /**
     * Create an instance of {@link ConsultarSaldoResponse }
     * 
     */
    public ConsultarSaldoResponse createConsultarSaldoResponse() {
        return new ConsultarSaldoResponse();
    }

    /**
     * Create an instance of {@link DepositarSaldo }
     * 
     */
    public DepositarSaldo createDepositarSaldo() {
        return new DepositarSaldo();
    }

    /**
     * Create an instance of {@link DepositarSaldoResponse }
     * 
     */
    public DepositarSaldoResponse createDepositarSaldoResponse() {
        return new DepositarSaldoResponse();
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
     * Create an instance of {@link RegistrarCliente }
     * 
     */
    public RegistrarCliente createRegistrarCliente() {
        return new RegistrarCliente();
    }

    /**
     * Create an instance of {@link RegistrarClienteResponse }
     * 
     */
    public RegistrarClienteResponse createRegistrarClienteResponse() {
        return new RegistrarClienteResponse();
    }

    /**
     * Create an instance of {@link RetirarSaldo }
     * 
     */
    public RetirarSaldo createRetirarSaldo() {
        return new RetirarSaldo();
    }

    /**
     * Create an instance of {@link RetirarSaldoResponse }
     * 
     */
    public RetirarSaldoResponse createRetirarSaldoResponse() {
        return new RetirarSaldoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CerrarSesion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CerrarSesion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "cerrarSesion")
    public JAXBElement<CerrarSesion> createCerrarSesion(CerrarSesion value) {
        return new JAXBElement<CerrarSesion>(_CerrarSesion_QNAME, CerrarSesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CerrarSesionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CerrarSesionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "cerrarSesionResponse")
    public JAXBElement<CerrarSesionResponse> createCerrarSesionResponse(CerrarSesionResponse value) {
        return new JAXBElement<CerrarSesionResponse>(_CerrarSesionResponse_QNAME, CerrarSesionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNombreUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarNombreUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consultarNombreUsuario")
    public JAXBElement<ConsultarNombreUsuario> createConsultarNombreUsuario(ConsultarNombreUsuario value) {
        return new JAXBElement<ConsultarNombreUsuario>(_ConsultarNombreUsuario_QNAME, ConsultarNombreUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNombreUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarNombreUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consultarNombreUsuarioResponse")
    public JAXBElement<ConsultarNombreUsuarioResponse> createConsultarNombreUsuarioResponse(ConsultarNombreUsuarioResponse value) {
        return new JAXBElement<ConsultarNombreUsuarioResponse>(_ConsultarNombreUsuarioResponse_QNAME, ConsultarNombreUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consultarSaldo")
    public JAXBElement<ConsultarSaldo> createConsultarSaldo(ConsultarSaldo value) {
        return new JAXBElement<ConsultarSaldo>(_ConsultarSaldo_QNAME, ConsultarSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consultarSaldoResponse")
    public JAXBElement<ConsultarSaldoResponse> createConsultarSaldoResponse(ConsultarSaldoResponse value) {
        return new JAXBElement<ConsultarSaldoResponse>(_ConsultarSaldoResponse_QNAME, ConsultarSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositarSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DepositarSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "depositarSaldo")
    public JAXBElement<DepositarSaldo> createDepositarSaldo(DepositarSaldo value) {
        return new JAXBElement<DepositarSaldo>(_DepositarSaldo_QNAME, DepositarSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositarSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DepositarSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "depositarSaldoResponse")
    public JAXBElement<DepositarSaldoResponse> createDepositarSaldoResponse(DepositarSaldoResponse value) {
        return new JAXBElement<DepositarSaldoResponse>(_DepositarSaldoResponse_QNAME, DepositarSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "login")
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
    @XmlElementDecl(namespace = "http://ws/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarCliente")
    public JAXBElement<RegistrarCliente> createRegistrarCliente(RegistrarCliente value) {
        return new JAXBElement<RegistrarCliente>(_RegistrarCliente_QNAME, RegistrarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarClienteResponse")
    public JAXBElement<RegistrarClienteResponse> createRegistrarClienteResponse(RegistrarClienteResponse value) {
        return new JAXBElement<RegistrarClienteResponse>(_RegistrarClienteResponse_QNAME, RegistrarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirarSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetirarSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "retirarSaldo")
    public JAXBElement<RetirarSaldo> createRetirarSaldo(RetirarSaldo value) {
        return new JAXBElement<RetirarSaldo>(_RetirarSaldo_QNAME, RetirarSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirarSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetirarSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "retirarSaldoResponse")
    public JAXBElement<RetirarSaldoResponse> createRetirarSaldoResponse(RetirarSaldoResponse value) {
        return new JAXBElement<RetirarSaldoResponse>(_RetirarSaldoResponse_QNAME, RetirarSaldoResponse.class, null, value);
    }

}
