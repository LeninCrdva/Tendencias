/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import sw.GuiaSW;
import sw.GuiaSW_Service;

/**
 *
 * @author Usuario
 */
public class TestWS {

    public static void main(String[] args) {
        GuiaSW_Service servicio = new GuiaSW_Service();
        GuiaSW servicios = servicio.getGuiaSWPort();
        boolean ciclo = true;
        boolean succes;
        BufferedReader txt = new BufferedReader(new InputStreamReader(System.in));

        do {
            try {
                System.out.println("Ingrese las credenciales:");
                
                System.out.print("Usuario: ");
                String user = txt.readLine().trim();
                System.out.print("Contrasena: ");
                String contra = txt.readLine().trim();
                succes = servicios.login(user, contra);
                
                if(!succes){
                    System.out.println("Credenciales incorrectas");
                } else {
                    System.out.println("Credenciales correctas");
                }
            } catch (Exception e) {
                succes = false;
            }
        } while (!succes);

        do {
            try {

                if (succes) {
                    System.out.println("-------------------------------");
                    System.out.println("Elija entre lo siguiente:");
                    System.out.print("1.- Operaciones matemáticas\n2.- Operaciones sencillos de física\nEleccion: ");
                    String elec = txt.readLine().trim();
                    if (elec.equals("1")) {
                        System.out.println("Ha elegido operaciones matemáticas");
                        System.out.print("Ingrese el valor de A: ");
                        String a = txt.readLine().trim();
                        System.out.print("Ingrese el valor de B: ");
                        String b = txt.readLine().trim();

                        System.out.println("Los resultados de las operaciones de A: " + a + " y  B: " + b);
                        System.out.println("Suma: " + servicios.operacionSuma(Double.valueOf(a), Double.valueOf(b)));
                        System.out.println("Resta: " + servicios.operacionResta(Double.valueOf(a), Double.valueOf(b)));
                        System.out.println("Multiplicacion: " + servicios.operacionMultiplicacion(Double.valueOf(a), Double.valueOf(b)));
                        Double division = servicios.operacionDivision(Double.valueOf(a), Double.valueOf(b));
                        if (division == -1) {
                            System.out.println("No se puede dividir entre 0");
                        } else {
                            System.out.println("Division: " + division);
                        }

                        System.out.print("Desea continuar con el programa?\nSi o No\nEleccion: ");
                        String el = txt.readLine().trim();

                        if (el.equalsIgnoreCase("si")) {
                            System.out.println("Se continuará con el programa");
                            ciclo = true;
                        } else {
                            ciclo = false;
                            System.out.println("Se cerrará el programa");
                        }
                    } else if (elec.equals("2")) {
                        System.out.print("Ha elegido Operaciones de Fisica\nEn este apartado se tiene 3 ejercicios\n1.Calcular velocidad\n2.- Calcular fuerza\n3.- Calcular energia\nEleccion: ");
                        String el = txt.readLine().trim();
                        String a;
                        String b;

                        switch (el) {
                            case "1":
                                System.out.print("Ingrese el valor de A: ");
                                a = txt.readLine().trim();
                                System.out.print("Ingrese el valor de B: ");
                                b = txt.readLine().trim();
                                System.out.println("Se calculará la velocidad con la formula v=d/t, siendo la distancia: " + a + " y el tiempo: " + b);
                                Double division = servicios.calcularVelocidad(Double.valueOf(a), Double.valueOf(b));
                                if (division == -1) {
                                    System.out.println("No se puede dividir entre 0");
                                } else {
                                    System.out.println("El valor de la velocidad es: " + division + " km/h");
                                }

                                break;
                            case "2":
                                System.out.print("Ingrese el valor de A: ");
                                a = txt.readLine().trim();
                                System.out.print("Ingrese el valor de B: ");
                                b = txt.readLine().trim();
                                System.out.println("Se calculará la fuerza con la formula f = m*a, siendo la masa: " + a + " y la aceleracion: " + b);

                                System.out.println("El valor de la fuerza es: " + servicios.calcularFuerza(Double.valueOf(a), Double.valueOf(b)) + " Newtons");
                                break;
                            case "3":
                                System.out.print("Ingrese el valor de A: ");
                                a = txt.readLine().trim();
                                System.out.print("Ingrese el valor de B: ");
                                b = txt.readLine().trim();
                                System.out.println("Se calculará la energia cinetica con la formula ek=1/2*m*v^2, siendo la masa: " + a + " y la velocidad: " + b);

                                System.out.println("El valor de la energia cinetica es: " + servicios.calcularEnergiaCinetica(Double.valueOf(a), Double.valueOf(b)) + " Julios");
                                break;
                            default:
                                System.out.print("No existe el valor ingresado");
                                break;
                        }
                        System.out.print("Desea continuar con el programa\nSi o No\nEleccion: ");
                        String val = txt.readLine().trim();

                        if (val.equalsIgnoreCase("si")) {
                            System.out.println("Se continuará con el programa");
                            ciclo = true;
                        } else {
                            ciclo = false;
                            System.out.println("Se cerrará el programa");
                        }
                    } else {
                        return;
                    }
                } else {
                    ciclo = false;
                    return;
                }
            } catch (Exception e) {
                ciclo = false;
            }
        } while (ciclo);
    }
}
