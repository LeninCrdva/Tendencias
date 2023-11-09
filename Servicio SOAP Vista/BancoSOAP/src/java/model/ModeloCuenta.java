package model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ModeloCuenta extends Cuenta {

    public ModeloCuenta() {

    }

    public ModeloCuenta(int idCliente, double saldo) {
        super(idCliente, saldo);
    }

    public double consultarSaldo() {
        String sql = "SELECT SALDO FROM CUENTA WHERE idcliente = " + getIdcliente();
        double valor = 0;

        ConnectDB con = new ConnectDB();
        ResultSet rs = con.consulta(sql);

        try {
            while (rs.next()) {
                Cuenta cuenta = new Cuenta();
                valor = rs.getDouble(1);
            }

            return valor;
        } catch (SQLException e) {

            return -1;
        }
    }

    public SQLException registraSaldo() {
        String sql = "INSERT INTO CUENTA (idcliente, saldo) VALUES (" + getIdcliente() + "," + getSaldo() + ")";

        ConnectDB con = new ConnectDB();
        SQLException ex = con.accion(sql);
        return ex;
    }

    public double depositarSaldo() {
        double valor = consultarSaldo();

        ConnectDB con = new ConnectDB();

        ModeloCuenta cuenta = new ModeloCuenta();

        if (valor >= 0) {
            cuenta.setSaldo(valor + getSaldo());
            String sql = "UPDATE CUENTA SET SALDO = " + cuenta.getSaldo() + "WHERE idcliente = " + getIdcliente();
            
            System.out.println(getIdcliente());
            
            SQLException ex = con.accion(sql);

            if (ex == null) {
                valor = cuenta.getSaldo();
            } else {
                valor = -1;
            }
        } else {
            valor = -1;
        }

        return valor;
    }

    public double retirarSaldo() {
        double valor = consultarSaldo();

        ConnectDB con = new ConnectDB();

        ModeloCuenta cuenta = new ModeloCuenta();

        if (valor >= 0 && getSaldo() < valor) {
            cuenta.setSaldo(valor - getSaldo());
            String sql = "UPDATE CUENTA SET SALDO = " + cuenta.getSaldo() + "WHERE idcliente = " + getIdcliente();

            SQLException ex = con.accion(sql);

            if (ex == null) {
                valor = cuenta.getSaldo();
            } else {
                valor = -1;
            }
        } else if (getSaldo() > valor) {
            valor = -1;
        } else {
            valor = -2;
        }

        return valor;
    }
}
