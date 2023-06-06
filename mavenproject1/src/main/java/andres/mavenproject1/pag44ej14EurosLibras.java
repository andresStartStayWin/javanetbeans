/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author andre
 *  * 21. Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
 * libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
 * converir que será una cadena, este no devolverá ningún valor y mostrará un
 * mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * - 0.86 libras es un 1 €
 * - 1.28611 $ es un 1 €
 * - 129.852 yenes es un 1 €
 */
public class pag44ej14EurosLibras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
		double euro;
		String monedaCambio;

		// Pedimos datos al usuario
		System.out.println("[ Convertidor de Moneda ]");
		System.out.println("Ingrese la cantidad de Euros: ");

		euro = entrada.nextDouble();
		entrada.nextLine(); // Limpiamos el buffer de entrada para poder leer el String
		
		System.out.println("Ingrese el nombre de la moneda a la que desea convertir: ");
		System.out.println("1- Pesos.");
		System.out.println("2- Libras.");
		System.out.println("3- Yenes.");
		
		monedaCambio = entrada.nextLine();
		// Llamada al metodo para el cambio de moneda
		convertirMoneda(euro, monedaCambio);
		
		entrada.close();
	}

// ==============================================================================	
	public static void convertirMoneda(double euro, String monedaCambio) {

		double peso, libra, yen;

		// Damos valores a peso, libra, yen.. el equivalente de 1 euro
		peso = 1.28611;
		libra = 0.86;
		yen = 129.852;

		switch (monedaCambio.toUpperCase()) {
		case "PESOS":
			System.out.println("El cambio de: €" + euro + " euros a pesos es: $" + (euro * peso));
			break;

		case "LIBRAS":
			System.out.println("El cambio de: €" + euro + " euros a Libras es: £" + (euro * libra));
			break;

		case "YENES":
			System.out.println("El cambio de: €" + euro + " euros a Yenes es: ¥" + (euro * yen));
			break;

		default:
			System.out.println("[ ERROR ] Nombre ingresado no encontrado en el sistema.");
			break;
		}

	}
}