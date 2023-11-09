package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ModeloCliente extends Cliente {

    public ModeloCliente() {
    }

    public ModeloCliente(String nombre, String contrasena) {
        super(nombre, contrasena);
    }

    public List<Cliente> listarClientes() {
        List<Cliente> lista = new ArrayList<Cliente>();
        String sql = "SELECT usuario, contrasena FROM CLIENTE WHERE usuario = '" + getUser() + "' AND contrasena = '" + getPassword() + "'";

        ConnectDB con = new ConnectDB();
        ResultSet rs = con.consulta(sql);
        try {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setUser(rs.getString(1));
                cliente.setPassword(rs.getString(2));

                lista.add(cliente);
            }
            rs.close();
            return lista;
        } catch (SQLException e) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public boolean buscarRepetido() {
        String sql = "SELECT * FROM CLIENTE WHERE usuario = '" + getUser() + "'";
        boolean exists;

        ConnectDB con = new ConnectDB();
        ResultSet rs = con.consulta(sql);
        try {
            exists = rs.next();
            rs.close();
        } catch (SQLException e) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, e);
            exists = false;
        }
        return exists;
    }

    public ModeloCliente buscarCliente() {
        String sql = "SELECT id FROM CLIENTE WHERE usuario = '" + getUser() + "' AND contrasena = '" + getPassword() + "'";
        ModeloCliente cliente = new ModeloCliente();

        ConnectDB con = new ConnectDB();
        ResultSet rs = con.consulta(sql);
        
        try {
            if (rs.next()) {
                cliente.setId(rs.getInt(1));
            } else {
                // No se encontró ningún registro que coincida con las credenciales
                cliente = null;
            }
            rs.close();
            return cliente;
        } catch (SQLException e) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public int insertarCliente(ModeloCuenta cuenta) {
        String sql = "INSERT INTO CLIENTE (usuario, contrasena) VALUES (?, ?)";
        ConnectDB con = new ConnectDB();
        int sucess;

        if (!buscarRepetido()) {
            try ( PreparedStatement stmt = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, getUser());
                stmt.setString(2, getPassword());
                stmt.executeUpdate();

                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    cuenta.setIdcliente(generatedKeys.getInt(1));

                    SQLException ex = cuenta.registraSaldo();

                    if (ex == null) {
                        sucess = 0;
                    } else {
                        sucess = -1;
                    }
                } else {
                    sucess = -1;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                sucess = -1;
            }
        } else {
            sucess = -2;
        }
        return sucess;
    }
}
