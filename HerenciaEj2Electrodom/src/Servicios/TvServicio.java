/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class TvServicio extends ElectrodomesticoServicio {

    public ArrayList<Televisor> televisores = new ArrayList<>();

    public void crearTelevisor(Scanner input) {

        Televisor televisor = new Televisor();

        super.crearElectrodomestico(input, televisor);

        System.out.println("Ingrese Resolucion:");
        double resolucion = input.nextDouble();
        input.nextLine();

        System.out.println("Posee sintonizador tdt? (s/n)");
        String tdt = input.nextLine();

        televisor.setResolucion(resolucion);

        if (tdt.equalsIgnoreCase("s")) {
            televisor.setTdt(true);
        } else {
            televisor.setTdt(false);
        }

        televisor.setPrecio(_precioFinal(televisor));

        televisores.add(televisor);

    }

    public double _precioFinal(Televisor televisor) {

        double pFinal = televisor.getPrecio() + super.precioFinal(televisor);

        if (televisor.getResolucion() > 40) {
            pFinal = pFinal * 1.3;
        }

        if (televisor.isTdt()) {
            pFinal += 500;
        }

        return pFinal;

    }

    public void mostrarTelevisores() {

        for (Televisor televisor : televisores) {
            System.out.println(televisor.toString());
        }
    }
}