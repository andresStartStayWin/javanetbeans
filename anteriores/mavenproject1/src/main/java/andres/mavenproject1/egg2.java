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
public class egg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("clasi de 1 a 5");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <=5){
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("*2");
                    break;
                case 3:
                    System.out.println("*3");
                    break;
                case 4:
                    System.out.println("*4");
                    break;
                case 5:
                    System.out.println("*5");
                    break;
            }
        } else if (opinion < 0) {
            System.out.println("menos de 0, q mal");
        } else if (opinion == 0) {
            System.out.println("*0");
        } else {
            System.out.println("cualca");
        }
        System.out.println("chau");
    }
    
}
