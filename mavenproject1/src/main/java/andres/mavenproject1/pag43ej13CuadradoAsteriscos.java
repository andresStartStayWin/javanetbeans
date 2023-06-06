/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author andre
 * * 19. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
 * si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 * 		* * * *
 * 		*     *
 * 		*     *
 * 		* * * *
 */
public class pag43ej13CuadradoAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Ingrese un número: ");
		num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= num; j++) {
				
				if ( (i > 1 && i < num) && (j > 1 && j < num) ) {
					
					System.out.print("  ");
				} else {
					
					System.out.print("* ");
				}
			}
			System.out.println("");
		}

		entrada.close();

	}

}