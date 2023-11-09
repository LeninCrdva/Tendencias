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
public class ControlRegistro {

    Registro vista;

    public ControlRegistro() {

    }

    public ControlRegistro(Registro vista) {
        this.vista = vista;
        vista.setVisible(true);
    }

    public void iniciarControl() {
        vista.getBtnCambiarInicio().addActionListener(l -> cambiarInicio());
        vista.getBtnRegistrar().addActionListener(l -> registrarUsuario());
    }

    private void cambiarInicio() {
        Login vistal = new Login();
        ControladorPrincipal control = new ControladorPrincipal(vistal);

        this.vista.dispose();
    }

    private void registrarUsuario() {
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones servicios = servicio.getWSOperacionesPort();

        String usuario = vista.getTxtUsuarioRegistro().getText().trim();
        String clave_a = vista.getTxtClaveRegistroA().getText().trim();
        String clave_b = vista.getTxtClaveRegistroB().getText().trim();
        double saldoIn = Double.valueOf(vista.getTxtSaldoInicial().getText().trim());

        if (!usuario.isEmpty() || !clave_a.isEmpty() || !clave_b.isEmpty() || saldoIn <0) {
            if (clave_a.equals(clave_b) && !clave_a.isEmpty() && !clave_b.isEmpty()) {
                int clave = servicios.registrarCliente(usuario, clave_a, saldoIn); //0 valor de exito

                switch (clave) {
                    case 0:
                        Operaciones vistaOp = new Operaciones();
                        ControlOperaciones control = new ControlOperaciones(vistaOp);
                        control.iniciarControl();

                        this.vista.dispose();
                        break;
                    case -1:
                        vista.getLblRegistroError().setText("Algo inesperado ocurrio");
                        break;
                    case -2:
                        vista.getLblRegistroError().setText("El usuario ya ha sido registrado");
                        break;
                    default:
                        vista.getLblRegistroError().setText("Se ha producido un error");
                }
            } else {
                vista.getLblRegistroError().setText("Las claves no coinciden");
            }
        } else {
            vista.getLblRegistroError().setText("No ingresar campos vacios");
        }
    }
}
