/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "WSOperations")
public class WSOperations {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName= "login")
    public Boolean login(@WebParam(name = "usuario") String usuario,
            @WebParam(name = "contrasena") String contrasena){
        return usuario.equals("lenin") && contrasena.equals("lenin123");
    }
    
    @WebMethod(operationName= "procesarPago")
    public Integer procesarPago(@WebParam(name = "total") int total,
            @WebParam(name = "pago") int pago){
        return pago > total ? pago - total : -1;
    }
}
