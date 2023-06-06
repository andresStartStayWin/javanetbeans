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
public class pag27ej920numsConFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        		Scanner entrada = new Scanner(System.in);
		
		int num, suma;
		
		suma = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Ingrese un número");
			num = entrada.nextInt();
			
			// Validamos que el numero sea mayor a cero para sumar
			if (num > 0) {
				suma = suma + num;
			} else if (num == 0) {
				// de ser igual a cero se interrumpe la iteracion
				System.out.println("Se capturó el número cero.");
				break;
			}
		}
		
		System.out.println("\nLa suma total de los números ingresados es: " + suma);
		
		entrada.close();
	}

}