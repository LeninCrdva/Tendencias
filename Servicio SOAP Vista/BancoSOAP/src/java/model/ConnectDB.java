package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDB {

    private String user = "root";
    private String password = "";
    private String nameDb = "bancosoap";
    private String url = "jdbc:mysql://localhost:3306/" + nameDb;

    Connection conn = null;

    public ConnectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Conexión exitosa a la BD: " + nameDb);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Ocurre una excepcion con: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("");
        }
    }

    public ResultSet consulta(String sql) {
        try {
            Statement st = conn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public SQLException accion(String sql) {
        try {
            try ( Statement st = conn.createStatement()) {
                st.execute(sql);
            }
            return null;
        } catch (SQLException e) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, e);
            return e;
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
