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
public class pag27ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont;
        cont = 0;
        int suma;
        suma = 0;
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            cont = cont + 1;
            
            if (num > 0) {
            suma = num + suma; }
            
            
            if (num == 0) {
                System.out.println("Aprecio un cero");
                break; }
        } while (cont < 20);
        System.out.println(suma);
    }
    
}
