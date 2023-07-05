/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andres.ejercicio12;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PersonaServicio perSer = new PersonaServicio();

        Persona persona = perSer.crearPersona();

        int edad;

        if (perSer.calcularEdad(persona) == -1) {
            System.out.println("\nLa persona ingresada todavia no ha nacido. Fin de la ejecucion.");
            return;
        } else {
            System.out.println("\n" + perSer.mostrarNombre(persona) + " tiene " + perSer.calcularEdad(persona) + " años.");
        }

        System.out.println("\nIngrese una edad para ver si " + perSer.mostrarNombre(persona) + " es mayor o menor:");
        edad = input.nextInt();

        if (perSer.menorQue(persona,edad)) {
            System.out.println("\n" + perSer.mostrarNombre(persona) + " tiene menos de " + edad + " años.");
        } else {
            System.out.println("\n" + perSer.mostrarNombre(persona) + " tiene mas de " + edad + " años.");
        }

        System.out.println("\nLa informacion completa de la persona ingresada es:");
        System.out.println(perSer.mostrarPersona(persona));
    }
}
