/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ej8nacho;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ej8Nacho {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        CadenaServicio cadSer = new CadenaServicio();
        Cadena cadena;

        String frase1, frase2, letra1, letra2, letra3;
        int longitud;

        System.out.println("Ingrese una frase:");
        frase1 = input.nextLine();
        longitud = frase1.length();

        cadena = cadSer.crearCadena(frase1,longitud);

        System.out.println("La frase contiene " + cadSer.mostrarVocales(cadena) + " vocales");
        System.out.println("La frase invertida es: '" + cadSer.invertirFrase(cadena) + "'.");

        System.out.println("\nIngrese una letra:");
        letra1 = input.nextLine();

        System.out.println("La letra '" + letra1 + "' se encontro " + cadSer.vecesRepetido(cadena,letra1) + " veces");

        System.out.println("\nIngrese una frase:");
        frase2 = input.nextLine();

        if (cadSer.compararLongitud(cadena,frase2)) {
            System.out.println("Las frases tienen el mismo largo");
        } else {
            System.out.println("Las frases tienen distinto largo");
        }

        System.out.println("El resultado de unir las frases es '" + cadSer.unirFrases(cadena,frase2) + "'.");

        System.out.println("\nIngrese una letra:");
        letra2 = input.nextLine();

        System.out.println("El resultado de remplazar la letra 'A' por '" + letra2 + "' en la frase es '" + cadSer.reemplazar(cadena,letra2) + "'.");

        System.out.println("\nIngrese una letra:");
        letra3 = input.nextLine();

        if (cadSer.contiene(cadena,letra3)) {
            System.out.println("La frase contiene la letra ingresada");
        } else {
            System.out.println("La frase no contiene la letra ingresada");
        }
    }
}
