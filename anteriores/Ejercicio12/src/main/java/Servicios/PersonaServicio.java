/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class PersonaServicio {
        private Scanner input = new Scanner(System.in);

    public Persona crearPersona () {

        String nombre;
        Date fechaNac;
        int anio, mes, dia;

        System.out.println("Ingrese el nombre de la persona:");
        nombre = input.nextLine();

        System.out.println("Ingrese el año de nacimiento de " + nombre + ":");
        anio = input.nextInt() - 1900;

        System.out.println("Ingrese el mes de nacimiento de " + nombre + ":");
        mes = input.nextInt() - 1;

        System.out.println("Ingrese el dia de nacimiento de " + nombre + ":");
        dia = input.nextInt();

        fechaNac = new Date(anio,mes,dia);

        return new Persona(nombre,fechaNac);
    }

    public int calcularEdad (Persona _persona) {

        Date fechaActual = new Date();

        if (_persona.getFechaNac().before(fechaActual)) {

            double anios = fechaActual.getYear() - _persona.getFechaNac().getYear();
            double meses = fechaActual.getMonth() - _persona.getFechaNac().getMonth();
            double dias = fechaActual.getDay() - _persona.getFechaNac().getDay();

            meses += dias/30;
            anios += meses/12;

            return (int) Math.floor(anios);

        } else {
            return -1;
        }
    }

    public boolean menorQue (Persona _persona, int edad) {

        if (calcularEdad(_persona) < edad) {
            return true;
        } else {
            return false;
        }
    }

    public String mostrarNombre (Persona _persona) {
        return _persona.getNombre();
    }
    public String mostrarPersona (Persona _persona) {
        return _persona.toString();
    }
}