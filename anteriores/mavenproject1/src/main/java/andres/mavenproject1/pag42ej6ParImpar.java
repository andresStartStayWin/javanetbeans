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
public class pag42ej6ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

          int num1;

          // Entrada de datos
          System.out.println("Ingrese el primer número:");
          num1 = entrada.nextInt();

         // entrada.close(); // cerramos la entrada de datos

          // Determinamos si el número es par o impar
          if (num1 % 2 == 0) {
               System.out.println("El número " + num1 + " es Par.");
          } else {
               System.out.println("El número " + num1 + " es Impar.");
          }

     }

}
