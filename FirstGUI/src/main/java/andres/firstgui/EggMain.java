/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres.firstgui;

import java.util.Scanner;

/**
 *
 * @author Chaleco
 */
public class EggMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un número positivo");
            num = leer.nextInt();
            if (num > 1000) {
                    System.out.println("Podría tardar. Está seguro?");
                    String confirma = leer.next();
                    if (confirma.equals("s")) {
                            break;
                    }
            }
        } while (num <= 0 || num > 1000);

        
        int j, suma;
        for(int i=1 ; i<=num ; i++){
            if( i%2 != 0)
                continue;
            
            suma=0;
            j=1;
            while(j<=1){
                suma += j;
                j++;
            }
            System.out.println("La suma de " + i + " es " + suma);
    }

}
}
