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
public class pag29ej10_4numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int i;
        int multi;
        
        for (i=0; i < 4; i++) {
            System.out.println("\nIngrese un numero"); // \n hace un Enter
            num = leer.nextInt();
            System.out.print(num);
            int j;
                //System.out.print("*");
            for (j=0; j < num; j++) 
                System.out.print("*");
            
            }
            

        }
    }
    

