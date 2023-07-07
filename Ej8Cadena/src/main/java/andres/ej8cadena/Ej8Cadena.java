/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ej8cadena;

import Entidades.Cadena;
import Servicios.ServiciosCadena;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ej8Cadena {
    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        ServiciosCadena serv1 = new ServiciosCadena();

        Cadena c1 = serv1.crearCadena();

        int opcion;

        serv1.mostrarMenu();

        do {

            System.out.println("Ingrese una opcion");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1 ->
                    serv1.mostrarVocales(c1);
                case 2 ->
                    serv1.invertirFrase(c1);
                case 3 -> {
                    System.out.println("Ingrese un caracter");

                    String letra = leer.next();

                    while (letra.length() > 1) {

                        System.out.println("Ingrese un caracter!!");

                        letra = leer.next();

                    }

                    System.out.println("La cantidad de veces que se repite " + letra + " es " + serv1.vecesRepetido(c1, letra));
                }
                case 4 -> {
                    System.out.println("Ingrese la frase a comparar");

                    String frase = leer.next();

                    serv1.compararLongitud(c1, frase);
                }
                case 5 -> {
                    System.out.println("Ingrese una frase a unir");
                    String frase = leer.next();
                    serv1.unirFrases(c1, frase);
                }
                case 6 -> {
                    System.out.println("Ingrese el reemplazo");
                    String letra = leer.next();
                    serv1.reemplazar(c1, letra);
                }
                case 7 -> {
                    System.out.println("Ingrese la letra a buscar");
                    String letra = leer.next();
                    serv1.contiene(c1, letra);
                }
                case 8 ->
                    serv1.mostrarMenu();
                case 9 ->
                    System.out.println("Usted salió");
                default ->
                    System.out.println("La opcion ingresada es invalida");
            }

        } while (opcion != 9);

    }
}

