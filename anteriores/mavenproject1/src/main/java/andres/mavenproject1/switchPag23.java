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
public class switchPag23 {

    /**
     * pagina 23
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        
        System.out.println("Ingrese una opcion");
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Es agua");
                break;
            case 2:
                System.out.println("Nafta");
                break;
            case 3:
                System.out.println("Hormigón");
                break;
            case 4:
                System.out.println("Alimentos");
                break;
            default:
                System.out.println("no valido");
   
        }
    }
    
}
