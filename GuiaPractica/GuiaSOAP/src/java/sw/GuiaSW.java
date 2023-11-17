/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package sw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "GuiaSW")
public class GuiaSW {
    /**
     * Web service operation
     * @param usuario
     * @param contrasena
     * @return 
     */
    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "usuario") String usuario, 
            @WebParam(name = "contrasena") String contrasena) throws NullPointerException {
        return usuario.equals("admin") && contrasena.equals("admin");
    }

    /**
     * Web service operation
     * @param a
     * @param b
     * @return 
     */
    @WebMethod(operationName = "operacionSuma")
    public Double operacionSuma(@WebParam(name = "a") double a, @WebParam(name = "b") double b) throws NumberFormatException, NullPointerException {
        double suma = a+b;
        
        return suma;
    }
    
    /**
     * Web service operation
     * @param a
     * @param b
     * @return 
     */
    @WebMethod(operationName = "operacionResta")
    public Double operacionResta(@WebParam(name = "a") double a, @WebParam(name = "b") double b) throws NumberFormatException, NullPointerException {
        double resta = a-b;
        
        return resta;
    }
    
    /**
     * Web service operation
     * @param a
     * @param b
     * @return 
     */
    @WebMethod(operationName = "operacionMultiplicacion")
    public Double operacionMultiplicacion(@WebParam(name = "a") double a, @WebParam(name = "b") double b) throws NumberFormatException, NullPointerException {
        double multi = a*b;
        
        return multi;
    }
    
    /**
     * Web service operation
     * @param a
     * @param b
     * @return 
     */
    @WebMethod(operationName = "operacionDivision")
    public Double operacionDivision(@WebParam(name = "a") double a, @WebParam(name = "b") double b) throws NumberFormatException, NullPointerException {
        double div;
        
        if(b == 0){
            div = -1;
        } else {
            div = a/b;
        }
        return div;
    }

    /**
     * Web service operation
     * @param a
     * @param b
     * @return 
     */
    @WebMethod(operationName = "calcularVelocidad")
    public Double calcularVelocidad(@WebParam(name = "a") double a, @WebParam(name = "b") double b) throws NumberFormatException, NullPointerException {
        double velocidad = a/b;
        
        if(b == 0){
            velocidad = -1;
        } else {
            velocidad = a/b;
        }
        return velocidad;
    }

    /**
     * Web service operation
     * @param a
     * @param b
     * @return 
     */
    @WebMethod(operationName = "calcularFuerza")
    public Double calcularFuerza(@WebParam(name = "a") double a, @WebParam(name = "b") double b) throws NumberFormatException, NullPointerException {
        double fuerza = a * b;
        
        return fuerza;
    }

    /**
     * Web service operation
     * @param a
     * @param b
     * @return 
     */
    @WebMethod(operationName = "calcularEnergiaCinetica")
    public Double calcularEnergiaCinetica(@WebParam(name = "a") double a, @WebParam(name = "b") double b) throws NumberFormatException, NullPointerException {
        double energia = 0.5*a*Math.pow(b, 2);
        
        return energia;
    }
}
