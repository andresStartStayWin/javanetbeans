/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.colecciones;
/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El programa pedirá una raza de
perro en un bucle, el mismo se guardará en la lista y después se le preguntará al usuario si quiere guardar otro perro
o si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Colecciones {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> razas = new ArrayList<>();

        String opc;
        boolean salir = false;

        while (!salir) {

            opc = "";

            System.out.println("Ingrese una raza de perro:");
            razas.add(input.nextLine());

            while (!opc.equalsIgnoreCase("s") && !opc.equalsIgnoreCase("n")) {

                System.out.println("\nDesea agregar otra raza? (s/n)");
                opc = input.nextLine();

                if(opc.equalsIgnoreCase("n")) {
                    salir = true;
                    break;
                } else if (!opc.equalsIgnoreCase("s")) {
                    System.out.println("\nOpcion incorrecta, intente nuevamente.");
                }
            }
        }

        System.out.println("\nLista de razas agregadas:");

        for (String raza : razas) {
            System.out.println(raza);
        }

    }

}
