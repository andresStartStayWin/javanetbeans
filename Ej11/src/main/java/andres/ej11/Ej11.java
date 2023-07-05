/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ej11 {

    public static void main(String[] args) {
     int anio, mes, dia;
        Date fecha, hoy;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el año:");
        anio = input.nextInt() - 1900;

        System.out.println("Ingrese el mes:");
        mes = input.nextInt() - 1;

        System.out.println("Ingrese el dia:");
        dia = input.nextInt();

        fecha = new Date(anio,mes,dia);
        hoy = new Date();

        System.out.println("\nLa fecha ingresada corresponde a: " + fecha);
        System.out.println("La fecha de hoy corresponde a: " + hoy);

        if (hoy.compareTo(fecha) > 0) {
            System.out.println("\nPasaron " + (hoy.getYear()-fecha.getYear()) + " años desde la fecha ingresada");
        } else {
            System.out.println("\nFaltan " + (fecha.getYear()-hoy.getYear()) + " años para la fecha ingresada");
        }
    }
}