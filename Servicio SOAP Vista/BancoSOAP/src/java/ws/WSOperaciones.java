/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JOptionPane;
import model.ModeloCliente;
import model.ModeloCuenta;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    private static ModeloCliente cl = new ModeloCliente();
    
    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "usuario") String usuario,
            @WebParam(name = "contrasena") String contrasena) {
        ModeloCliente cli = new ModeloCliente();
        cli.setUser(usuario);
        cli.setPassword(contrasena);
        
        cli = cli.buscarCliente();
        
        if (cli != null) {
            cl.setUser(usuario);
            cl.setPassword(contrasena);
            
            return true;
        }
        return cli != null;
        //return usuario.equals("lenin") && contrasena.equals("lenin123");
    }
    
    @WebMethod(operationName = "registrarCliente")
    public Integer registrarCliente(@WebParam(name = "user") String nombre, @WebParam(name = "password") String contra, @WebParam(name = "saldo") double saldo) {
        ModeloCliente cli = new ModeloCliente();
        cli.setUser(nombre);
        cli.setPassword(contra);
        
        ModeloCuenta cuenta = new ModeloCuenta();
        cuenta.setSaldo(saldo);
        
        int succes = cli.insertarCliente(cuenta);
        
        if(succes == 0){
            cl.setUser(nombre);
            cl.setPassword(contra);
        }
        return succes;
    }

    @WebMethod(operationName = "depositarSaldo")
    public Double depositarSaldo(@WebParam(name = "saldo") int saldo){
        ModeloCuenta cuenta = new ModeloCuenta();
        ModeloCliente cliente = new ModeloCliente();
        cliente = cl.buscarCliente();
        
        cuenta.setIdcliente(cliente.getId());
        cuenta.setSaldo(saldo);
        
        double dinero = cuenta.depositarSaldo();
        
        return dinero;
    }
    
    @WebMethod(operationName = "retirarSaldo")
    public Double retirarSaldo(@WebParam(name = "saldo") int saldo){
        ModeloCuenta cuenta = new ModeloCuenta();
        ModeloCliente cliente = new ModeloCliente();
        cliente = cl.buscarCliente();
        
        cuenta.setIdcliente(cliente.getId());
        cuenta.setSaldo(saldo);
        
        double dinero = cuenta.retirarSaldo();
        
        return dinero;
    }
    
    @WebMethod(operationName = "consultarSaldo")
    public Double consultarSaldo(){
        ModeloCuenta cuenta = new ModeloCuenta();
        ModeloCliente cliente = new ModeloCliente();
        cliente = cl.buscarCliente();
        
        cuenta.setIdcliente(cliente.getId());
        double dinero = cuenta.consultarSaldo();
        
        return dinero;
    }
    
    @WebMethod(operationName = "consultarNombreUsuario")
    public String consultarNombre(){
        return cl.getUser();
    }
    
    @WebMethod(operationName = "cerrarSesion")
    public void cerrarSesion(){
        cl.setUser("");
        cl.setPassword("");
    }
}
