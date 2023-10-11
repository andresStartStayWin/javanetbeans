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
     * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
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
                System.out.println("Aparecio un cero");
                break; }
        } while (cont < 20);
        System.out.println(suma);
    }
    
}
