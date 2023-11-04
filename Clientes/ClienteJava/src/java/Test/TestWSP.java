/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import phpsoap.ServicePhp;
import phpsoap.ServicePhpPortType;

/**
 *
 * @author Usuario
 */
public class TestWSP {
    public static void main(String []args){
        ServicePhp service = new ServicePhp();
        ServicePhpPortType cliente = service.getServicePhpPort();
        
        String palabra = "anita lava la tina";
        System.out.println(cliente.comprobarPalindroma(palabra));
    }
}
