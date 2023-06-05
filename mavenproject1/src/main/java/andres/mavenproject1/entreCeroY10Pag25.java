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
public class entreCeroY10Pag25 {

    /**
     * @param args the command line arguments
     * ejercicio entre 0 y 10 en la pagina 25 de la guia 7
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;
        nota = 11;
           
        
         
        
        
        while (nota <= 0 & nota >= 10 ) {
            System.out.println("Ingrese nota");
            nota = leer.nextInt();
        }
        
    }
    
}
