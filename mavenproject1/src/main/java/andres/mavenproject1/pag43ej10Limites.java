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
public class pag43ej10Limites {

    /**
     * @param args the command line arguments
     *  Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
 * solicite números al usuario hasta que la suma de los números introducidos supere
 * el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite");
        int limite = leer.nextInt();
        int sum = 0;
        do{
            System.out.println("Ingrese numeros para sumar");
            int num = leer.nextInt();
            sum = sum + num;
        } while (sum < limite);
    }
}