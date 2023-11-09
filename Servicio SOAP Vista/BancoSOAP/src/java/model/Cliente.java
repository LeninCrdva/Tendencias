package model;

public class Cliente {
    private int id;
    private String user;
    private String password;

    public Cliente(){
    }
    
    public Cliente(String nombre, String contrasena){
        this.user = nombre;
        this.password = contrasena;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
