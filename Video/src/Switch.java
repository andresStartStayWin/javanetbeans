
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("Ingrese opcion");
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Opc 1");
                break;
            case 2:
                System.out.println("opc 2");
                break;
            default:
                System.out.println("Ta mal");
        }
    }
    
}
