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
public class pag42ej9AMayuscula {

    /**
     * @param args the command line arguments
     * * 11. Escriba un programa que pida una frase o palabra y valide si la primera
    * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
    * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se
    * deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y
    * equals() de Java.
     */
    public static void main(String[] args) {
        
		
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Ingrese una frase o palabra:");
		frase = entrada.nextLine();
		
		entrada.close();
		
		// Pasamos a mayusculas
		frase = frase.toUpperCase();
		
		// Validamos el primer caracter de la frase, si es igual a "A"
		if (frase.substring(0,1).equals("A")) {
			System.out.println("CORRECTO, el primer caracter de la frase es una A");
		} else {
			System.out.println("INCORRECTO");
		}

	}

}