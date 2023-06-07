/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres.mavenproject1;

import java.util.Random;

/**
 *
 * @author andre
 *  * 24. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class pag44ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  		int[] vector = new int[40];
		
		// Llenamos el vector
		rellenarVector(vector);
		
		System.out.println("[ CONTABILIZADOR DE DIGITOS ]");
		// Llamada al metodo para contabilizar los digitos
		contabilizarDigitos(vector);
		
		System.out.println("[ VECTOR GENERADO ]");
		// Mostramos los valores del vector
		mostrarVector(vector);
	}
	
	/**
	 * Recorrera el vector, obtendremos el valor int en c/u de sus posiciones.
	 * Convertiremos a String cada valor int y obtendremos su longitud,
	 * con esto sabremos cuantos digitos tiene cada valor entero del vector.
	 * Y almacenaremos el total de numeros que son de 1, 2 o 3 digitos.
	 */
	private static void contabilizarDigitos(int[] vector) {
		
		String numText;
		int unDigito = 0;
		int dosDigitos = 0;
		int tresDigitos = 0;
		
		for (int i = 0; i < vector.length; i++) {
			// convertimos a String los valores del vector
			numText = Integer.toString(vector[i]);
			
			// Validamos la longitud de la cadena
			if (numText.length() == 1) {
				unDigito++;
			} else {
				if (numText.length() == 2) {
					dosDigitos++;
				} else {
					if (numText.length() == 3) {
						tresDigitos++;
					}
				}
			}
		}
		
		// Mostramos los resultados
		System.out.println("El vector tiene un total de: ");
		System.out.println("[" + unDigito + "] valores de un digito.");
		System.out.println("[" + dosDigitos + "] valores de dos digitos.");
		System.out.println("[" + tresDigitos + "] valores de tres digitos.");

	}

	/*
	 * Llena el vector con valores aleatorios, haciendo uso de la clase Random
	 * y su metodo .nextInt() en este caso tendremos un rango de 0 a 300
	 */
	private static void rellenarVector(int[] vector) {

		Random numRandom = new Random(); // Obj de la clase random para usar el metodo nextInt()
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = numRandom.nextInt(300);
		}

		//mostrarVector(vector);
	}
	
	/*
	 * Muestra por consola los valores del vector
	 */
	private static void mostrarVector(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			System.out.print("[" + vector[i] + "]");
		}
		
		System.out.println("");
	}
}