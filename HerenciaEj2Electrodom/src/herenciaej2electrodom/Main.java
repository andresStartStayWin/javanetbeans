/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaej2electrodom;

/**
 *
 * @author andre
 */

import Servicios.LavadoraServicio;
import Servicios.TvServicio;
import Servicios.ElectrodomesticoServicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LavadoraServicio lavSer = new LavadoraServicio();
        TvServicio tvSer = new TvServicio();

        System.out.println("Bienvenido");
        System.out.println("\nCreando Lavadora...");

        lavSer.crearLavadora(input);

        System.out.println("\nLavadora creada.");
        System.out.println("\nCreando Televisor");

        tvSer.crearTelevisor(input);

        System.out.println("\nTelevisor creado.");

        System.out.println("\nLavadora en stock:");
        lavSer.mostrarLavadoras();

        System.out.println("\nTelevisor en stock:");
        tvSer.mostrarTelevisores();

    }
}