/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.Login;
import vista.Operaciones;
import vista.Registro;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal {
    Login vistaLogin;
    
    public ControladorPrincipal(Login vista){
        this.vistaLogin = vista;
        vista.setVisible(true);
    }
    
    public void iniciarControl(){
        vistaLogin.getBtnCambiarRegistro().addActionListener(l -> cambiarPantalla());
        vistaLogin.getBtnIngresar().addActionListener(l -> login());
    }
    
    private void login(){
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones servicios = servicio.getWSOperacionesPort();
        
        String user = vistaLogin.getTxtUsuarioLogin().getText().trim();
        String clave = vistaLogin.getTxtClaveLogin().getText().trim();
        boolean succes = servicios.login(user, clave);
        
        if(succes){
            Operaciones vistaOp = new Operaciones();
            ControlOperaciones control = new ControlOperaciones(vistaOp);
            
            control.iniciarControl();
            this.vistaLogin.dispose();
        } else {
            this.vistaLogin.getLblCredencialesError().setText("Credenciales incorrectas. Por favor reviselas");
            vistaLogin.getTxtClaveLogin().setText("");
            vistaLogin.getTxtUsuarioLogin().setText("");
        }
    }
    
    private void cambiarPantalla(){
        Registro vista = new Registro();
        ControlRegistro control = new ControlRegistro(vista);
        
        this.vistaLogin.dispose();
        control.iniciarControl();
    }
}
