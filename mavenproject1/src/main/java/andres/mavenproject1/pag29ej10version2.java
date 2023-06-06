/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class pag29ej10version2 {

    /**
     * @param args the command line arguments
     *  * 20. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
 * número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
    * 5 *****
    * 3 ***
    * 11 ***********
    * 2 **
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for (int i=0; i <4 ; i++){
            System.out.println("\nIngrese 4 numeros");
            int num = leer.nextInt();
            System.out.print(num+" ");
            
            for (int j=0; j < num ; j++){
                System.out.print("*");
            }
        }
    }
}