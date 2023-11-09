package controlador;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import vista.Login;
import vista.Operaciones;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author Usuario
 */
public class ControlOperaciones {

    Operaciones vista;

    public ControlOperaciones() {
    }

    public ControlOperaciones(Operaciones vista) {
        this.vista = vista;
        vista.setVisible(true);
    }

    public void iniciarControl() {
        mostrarSaldo();
        saludoUsuario();
        vista.getBtnRegistrarAccion().addActionListener(l -> realizarTransaccion());
        vista.getBtnSalir().addActionListener(l -> cerrarSesion());
    }

    private void mostrarSaldo() {
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones servicios = servicio.getWSOperacionesPort();

        double a = servicios.consultarSaldo();

        vista.getLblSaldoTotal().setText(String.valueOf(a));
    }

    private void realizarTransaccion() {
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones servicios = servicio.getWSOperacionesPort();

        String cantidad = vista.getTxtCantidadIngresada().getText().trim();

        if (vista.getCheckDeposito().isSelected() && !cantidad.isEmpty()) {
            double saldo = servicios.depositarSaldo(Integer.valueOf(cantidad));

            vista.getLblSaldoTotal().setText(String.valueOf(saldo));

            JLabel lblResultado = vista.getLblResultado();

            Color color = Color.BLUE;
            lblResultado.setForeground(color);
            lblResultado.setText("Deposito realizado con exito");

            vista.getTxtCantidadIngresada().setText("");
        } else if (vista.getCheckRetiro().isSelected()) {
            double saldo = servicios.retirarSaldo(Integer.valueOf(cantidad));

            if (saldo == -1) {
                JLabel lblResultado = vista.getLblResultado();

                Color color = Color.RED;
                lblResultado.setForeground(color);
                lblResultado.setText("Saldo insuficiente");
            } else if (saldo != -1) {
                vista.getLblSaldoTotal().setText(String.valueOf(saldo));

                JLabel lblResultado = vista.getLblResultado();

                Color color = Color.BLUE;
                lblResultado.setForeground(color);
                lblResultado.setText("Retiro realizado con exito");

                vista.getTxtCantidadIngresada().setText("");
            }
        } else {
            JLabel lblResultado = vista.getLblResultado();
            Color color = Color.RED;
            lblResultado.setForeground(color);
            lblResultado.setText("Ha ocurrido algo inesperado");
        }
    }
    
    private void saludoUsuario(){
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones servicios = servicio.getWSOperacionesPort();
        
        JLabel lblUser = vista.getLblNombreUsuario();
        
        lblUser.setText(servicios.consultarNombreUsuario());
        lblUser.setFont(new Font("arial", Font.BOLD, 14));
    }
    
    private void cerrarSesion(){
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones servicios = servicio.getWSOperacionesPort();
        
        servicios.cerrarSesion();
        
        Login login = new Login();
        ControladorPrincipal control = new ControladorPrincipal(login);
        control.iniciarControl();
        this.vista.dispose();
        
    }
}
