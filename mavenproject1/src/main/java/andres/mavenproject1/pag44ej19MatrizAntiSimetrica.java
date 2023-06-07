/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author andre
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
 * que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
 * cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
 * una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
 * viceversa).
 */
public class pag44ej19MatrizAntiSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
                    int[][] matriz_A = new int[3][3];

                    llenarMatriz(matriz_A);

                    System.out.println("[ Matriz aleatoria creada. ]");
                    mostrarMatriz(matriz_A);

                    // Mostramos la matriz traspuesta
                    System.out.println("[ Matriz traspuesta. ]");
                    matrizTraspuesta(matriz_A);
          }

          /**
           * Asignara valores ingresados por el usuario a la matriz
           */
          private static void llenarMatriz(int[][] matriz) {

                    Scanner sc = new Scanner(System.in);

                    int num;

                    System.out.println("Ingrese los valores de la matriz");

                    for (int i = 0; i < matriz.length; i++) {
                              for (int j = 0; j < matriz.length; j++) {
                                        num = sc.nextInt();
                                        matriz[i][j] = num;
                              }

                    }

                    sc.close();
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
           * Recibe la matriz, la recorre y asigna sus valores a una nueva matriz que
           * obtendra sus valores originales de forma traspuesta, o invertida. Y al final
           * mostrara el resultado.
           */
          private static void matrizTraspuesta(int[][] matriz) {

                    int[][] matriz_traspuesta = new int[3][3];

                    for (int i = 0; i < matriz.length; i++) {
                              for (int j = 0; j < matriz.length; j++) {
                                        matriz_traspuesta[i][j] = matriz[j][i]; // Invertimos filas y columnas
                              }
                    }

                    // mostramos el resultado de la matriz traspuesta
                    mostrarMatriz(matriz_traspuesta);

                    // llamada al metodo que dira si es Antisimetrica o no
                    esAntisimetrica(matriz, matriz_traspuesta);

          }

          /**
           * Recibe la matriz original y su traspuesta para validar si es antisimetrica o
           * no. matriz es anti simétrica si matriz == - mattriz_traspuesta
           */
          private static void esAntisimetrica(int[][] matriz, int[][] matriz_traspuesta) {

                    int var_count = 0;

                    for (int i = 0; i < matriz_traspuesta.length; i++) {
                              for (int j = 0; j < matriz_traspuesta.length; j++) {

                                        // validamos si es anti simetrica (signos opuestos + / - )
                                        if (matriz[i][j] == (-matriz_traspuesta[i][j])) {
                                                  // de ser verdadero aumentamos el contador
                                                  var_count++;
                                        }
                              }
                    }

                    if (var_count > 0) {
                              System.out.println("[ Es una matriz anti simetrica ]");
                    } else {
                              System.out.println("[ No es una matriz anti simetrica ]");
                    }
          }
}