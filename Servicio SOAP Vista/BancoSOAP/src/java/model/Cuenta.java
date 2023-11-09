package model;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private int id;
    private int idcliente;
    private double saldo;

    public Cuenta(){
        
    }
    
    public Cuenta(int idCliente, double saldo){
        this.idcliente = idCliente;
        this.saldo = saldo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
