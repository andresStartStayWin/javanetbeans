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
public class pag30Return {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 3;
        int num2 = 2;
     
        System.out.println("La suma de ambos es "+sumar(num1, num2));
        
        int retorno = sumar(num1, num2);
        System.out.println("La suma es "+retorno);
        
    }
    public static int sumar (int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }
    
}
