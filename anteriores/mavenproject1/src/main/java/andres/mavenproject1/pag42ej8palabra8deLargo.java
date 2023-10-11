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
public class pag42ej8palabra8deLargo {

    /**
     * @param args the command line arguments
     *  * 10. Realizar un programa que solo permita introducir frases o palabras
        * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
        * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
        * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
        * Lenght() en Java.
     */
    public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		String frase;
		
		// Entrada de Datos
		System.out.println("Ingrese una frase de 8 caracteres: ");
		frase = entrada.nextLine();
		
		//entrada.close(); // cerramos entrada de datos
		
		// Validamos la longitud de la frase
		if (frase.length() == 8) {
			System.out.println("CORRECTO!!");
		} else {
			System.out.println("INCORRECTO!!");
		}
	}

}