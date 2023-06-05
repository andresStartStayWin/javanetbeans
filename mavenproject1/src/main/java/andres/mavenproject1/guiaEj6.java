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
public class guiaEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese num1");
        num1 = leer.nextInt();
        System.out.println("num1 "+num1);
        if (num1 > 25) {
            System.out.println("Es mayor que 25");
        }
           else {
                    System.out.println("es menor");
                    }
        
        System.out.println("Ingrese num2");
        num2 = leer.nextInt();
        System.out.println("num2 "+num2);
         if (num2 > 25) {
            System.out.println("Es mayor que 25");
         }
            else {
                    System.out.println("es menor");
                    }
            
         if ((num1 & num2) > 15) {
             System.out.println("Son mayores");
         }  else if ((num1 | num2) < 25 ) {
             System.out.println("Uno es menor");
         }
             else  {
                    System.out.println("son menores");
                    }
        }
    }
    

