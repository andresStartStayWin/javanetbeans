/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres.mavenproject1;

import java.util.Random;

/**
 *
 * @author andre
 *  Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre traspuesta.
 */
public class pag44ej18MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 		int[][] matrizNum = new int[4][4];

		// Llamada al metodo para rellenar la matriz
		llenarMatriz(matrizNum);

		System.out.println("[ Matriz aleatoria creada. ]");

		// Mostramos la matriz generada
		System.out.println("---------------------------------------");
		mostrarMatriz(matrizNum);
		System.out.println("---------------------------------------");

		// Mostramos la matriz traspuesta
		System.out.println("[ Matriz traspuesta. ]");
		System.out.println("---------------------------------------");
		matrizTraspuesta(matrizNum);
		System.out.println("---------------------------------------");
	}

	/**
	 * Asignara valores aleatorios entre 0 y 20, Con el uso de la clase Random y su
	 * metodo nextInt().
	 */
	private static void llenarMatriz(int[][] matriz) {

		Random numRandom = new Random(); // Obj de la clase random para generar los valores aleatorios

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = numRandom.nextInt(20);
			}
		}

	}

	/**
	 * Recorre la matriz e imprime sus valores
	 */
	private static void mostrarMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println(" ");
		}
	}

	/**
	 * Recibe la matriz, la recorre y asigna sus valores a una nueva matriz
	 * que obtendra sus valores originales de forma traspuesta, o invertida.
	 * Y al final mostrara el resultado.
	 */
	private static void matrizTraspuesta(int[][] matriz) {

		int[][] matriz_traspuesta = new int[4][4];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz_traspuesta[i][j] = matriz[j][i]; // Invertimos filas y columnas
			}	
		}
		
		// mostramos el resultado de la matriz traspuesta
		mostrarMatriz(matriz_traspuesta);
			
	}
}