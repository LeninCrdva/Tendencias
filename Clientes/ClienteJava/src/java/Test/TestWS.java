/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import ws.WSOperations;
import ws.WSOperations_Service;

/**
 *
 * @author Usuario
 */
public class TestWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WSOperations_Service servicio = new WSOperations_Service();
        WSOperations cliente = servicio.getWSOperationsPort();
        
        if(cliente.login("lenin", "lenin123")){
            System.out.println("Ingreso correcto");
        } else {
            System.out.println("Credenciales incorrectas");
        }
        
        int vuelto = cliente.procesarPago(50, 10);
        if(vuelto != -1){
            System.out.println("Su pago fue realizado exitosamente");
            System.out.println("Su cambio es de: " + vuelto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
}
