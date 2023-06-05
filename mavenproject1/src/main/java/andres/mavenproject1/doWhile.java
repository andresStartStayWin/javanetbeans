/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Chaleco
 */
public class doWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        
        do { 
            System.out.println("Desea continuar?");
            respuesta = leer.nextLine();
            break;
        } while (respuesta.equalsIgnoreCase("S"));
        
        }
    }
    

