
package sw;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * Eclipse Metro/2.4.8 (RELEASE-2.4.8-e044505; 2022-01-04T13:29:23+0000) JAXWS-RI/2.3.5 JAXWS-API/2.3.3 JAXB-RI/2.3.5 JAXB-API/2.3.3
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GuiaSW", targetNamespace = "http://sw/", wsdlLocation = "http://localhost:8080/GuiaSOAP/GuiaSW?WSDL")
public class GuiaSW_Service
    extends Service
{

    private final static URL GUIASW_WSDL_LOCATION;
    private final static WebServiceException GUIASW_EXCEPTION;
    private final static QName GUIASW_QNAME = new QName("http://sw/", "GuiaSW");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/GuiaSOAP/GuiaSW?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GUIASW_WSDL_LOCATION = url;
        GUIASW_EXCEPTION = e;
    }

    public GuiaSW_Service() {
        super(__getWsdlLocation(), GUIASW_QNAME);
    }

    public GuiaSW_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GUIASW_QNAME, features);
    }

    public GuiaSW_Service(URL wsdlLocation) {
        super(wsdlLocation, GUIASW_QNAME);
    }

    public GuiaSW_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GUIASW_QNAME, features);
    }

    public GuiaSW_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GuiaSW_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GuiaSW
     */
    @WebEndpoint(name = "GuiaSWPort")
    public GuiaSW getGuiaSWPort() {
        return super.getPort(new QName("http://sw/", "GuiaSWPort"), GuiaSW.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GuiaSW
     */
    @WebEndpoint(name = "GuiaSWPort")
    public GuiaSW getGuiaSWPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sw/", "GuiaSWPort"), GuiaSW.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GUIASW_EXCEPTION!= null) {
            throw GUIASW_EXCEPTION;
        }
        return GUIASW_WSDL_LOCATION;
    }

}