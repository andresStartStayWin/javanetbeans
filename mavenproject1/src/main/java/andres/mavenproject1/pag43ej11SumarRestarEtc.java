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
public class pag43ej11SumarRestarEtc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcionMenu, num1, num2;
		String opcionSalida;
		
		opcionSalida = "";
		
		// Entrada de Datos
		System.out.println("Ingrese el primer número: ");
		num1 = entrada.nextInt();

		System.out.println("Ingrese el segundo número: ");
		num2 = entrada.nextInt();

		opcionMenu = 0; // Inicializamos en 0 para que se ejecute el do/while

		do {
			System.out.println(" MENU ");
			System.out.println("1- Sumar.");
			System.out.println("2- Restar.");
			System.out.println("3- Multiplicar.");
			System.out.println("4- Dividir.");
			System.out.println("5- Salir.");
			System.out.println(" Elija una Opción: ");

			opcionMenu = entrada.nextInt();

			// validamos opcion ingresada
			switch (opcionMenu) {
			case 1:
				System.out.println("La Suma de: " + num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case 2:
				System.out.println("La Resta de: " + num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case 3:
				System.out.println("La Multiplicación de: " + num1 + " * " + num2 + " = " + (num1*num2));
				break;
			case 4:
				System.out.println("La División de: " + num1 + " / " + num2 + " = " + (num1/num2));
				break;
			case 5:
				System.out.println("¿Está seguro que desea salir del programa (S/N)?");
				opcionSalida = entrada.next();
				
				opcionSalida = opcionSalida.toUpperCase();
				// Validamos la opcon
				if (opcionSalida.equals("S")) {
					System.out.println("[ PROGRAMA FINALIZADO ]");
				} else {
				opcionMenu = 0;
				}
				break;
			default:
				System.out.println("Opcion Incorrecta");
			}
		} while (opcionMenu != 5);
		
		entrada.close();
	}

}