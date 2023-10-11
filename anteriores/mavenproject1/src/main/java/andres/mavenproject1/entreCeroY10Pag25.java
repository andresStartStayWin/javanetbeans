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
public class entreCeroY10Pag25 {

    /**
     * @param args the command line arguments
     * ejercicio entre 0 y 10 en la pagina 25 de la guia 7
     * https://github.com/FullStackEgg/Programacion-Java/blob/main/introduccion%20Java/Ejercicio_13_fh.java
     */
    public static void main(String[] args) {
       		Scanner entrada = new Scanner(System.in);

		int nota;

		nota = -1;

		// validamod que la nota este entre 0 y 10, sino se repite
		do {

			System.out.println("Ingrese una nota:");
			nota = entrada.nextInt();

			// Validamos la nota
			if (nota >= 0 && nota <= 10) {
				System.out.println("Nota ingresada correctamente!.");
			} else {
				System.out.println("[ Ha ocurrido un error ]");
			}

		} while (nota < 0 || nota > 10);

		entrada.close(); // cerramos entrada de datos
		
	}

}