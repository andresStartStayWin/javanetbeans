/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ejercicio10;

import java.util.Arrays;

/**
 *
 * @author andre
 */
public class Ejercicio10 {

    public static void main(String[] args) {
      
        int[] array1, array2;

        array1 = new int[50];
        array2 = new int[20];

        inicializarArray(array1);

        System.out.println("El Array1 generado es:");
        mostrarArray(array1);

        System.out.println("\nEl Array1 ordenado es:");
        Arrays.sort(array1);
        mostrarArray(array1);

        System.out.println("\nEl Array2 generado es:");
        copiarElementos(array1,array2,10);
        Arrays.fill(array2,10,20,1);
        mostrarArray(array2);

    }

    public static int[] inicializarArray(int[] _array) {

        for (int i = 0; i < _array.length; i++) {
            _array[i] = (int) (Math.random() * 100 + 1);
        }

        return _array;
    }

    public static int[] copiarElementos(int[] _array1, int[] _array2, int _n) {

        for (int i = 0; i < _n; i++) {
            _array2[i] = _array1[i];
        }

        return _array2;
    }

    public static void mostrarArray (int[] _array) {

        System.out.print("[");

        for (int i = 0; i < _array.length; i++) {

            if (i == _array.length-1) {
                System.out.println(_array[i] + "]");
            } else {
                System.out.print(_array[i] + ",");
            }
        }
    }
}