
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andre
 */
public class nextint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("lala");
        
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es "+nombre);
        
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        System.out.println("Tu edad es "+edad);
    }
    
}
