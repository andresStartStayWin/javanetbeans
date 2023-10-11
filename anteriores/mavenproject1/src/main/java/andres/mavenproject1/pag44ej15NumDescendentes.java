/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres.mavenproject1;

/**
 *
 * @author andre
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
 * los muestre por pantalla en orden descendente.
 */
public class pag44ej15NumDescendentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int vector[] = new int[100];
		int num = 1;
		
		// el bucle se va a iterar 100 veces y asignara el valor de i al vector
		for (int i = 0; i <= 99 ; i++) {
			vector[i] = num; 
			num++;
                        
		}
		
		// mostramos los numeros en orden descendente
		for (int i = 99; i >= 0; i--) {
			System.out.println(vector[i]);
		}
	}

}