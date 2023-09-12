/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;


import Entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public abstract class ElectrodomesticoServicio {

    private String[] consumos = {"A","B","C","D","E","F"};
    private String[] colores = {"Blanco","Negro","Rojo","Azul","Gris"};

    public Electrodomestico crearElectrodomestico(Scanner input, Electrodomestico electrodomestico) {

        System.out.println("Ingrese el precio:");
        electrodomestico.setPrecio(input.nextDouble());
        input.nextLine();

        System.out.println("Ingrese el peso:");
        electrodomestico.setPeso(input.nextDouble());
        input.nextLine();

        System.out.println("Ingrese el color:");
        String color = input.nextLine();

        if (comprobarColor(color)) {
            electrodomestico.setColor(color);
        } else {
            electrodomestico.setColor("Blanco");
        }

        System.out.println("Ingrese categoria de consumo:");
        String consumo = input.nextLine();

        if (comprobarConsumo(consumo)) {
            electrodomestico.setConsumoEnergetico(consumo);
        } else {
            electrodomestico.setConsumoEnergetico("F");
        }

        return electrodomestico;
    }

    public boolean comprobarConsumo(String letra) {

        for (int i = 0; i < consumos.length; i++) {

            if (letra.equalsIgnoreCase(consumos[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean comprobarColor(String color) {

        for (int i = 0; i < colores.length; i++) {

            if (color.equalsIgnoreCase(colores[i])) {
                return true;
            }
        }
        return false;
    }

    public double precioFinal(Electrodomestico electrodomestico) {

        int aux = 0;
        double precioExtra = 0;

        for (int i = 0; i < consumos.length; i++) {

            if (consumos[i].equalsIgnoreCase(electrodomestico.getConsumoEnergetico())) {
                aux = i;
                break;
            }
        }

        switch (aux) {
            case 0:
                precioExtra += 1000;
                break;
            case 1:
                precioExtra += 800;
                break;
            case 2:
                precioExtra += 600;
                break;
            case 3:
                precioExtra += 500;
                break;
            case 4:
                precioExtra += 300;
                break;
            case 5:
            default:
                precioExtra += 100;
                break;
        }

        if (0 <= electrodomestico.getPeso() && electrodomestico.getPeso() < 20) {
            precioExtra += 100;
        } else if (20 <= electrodomestico.getPeso() && electrodomestico.getPeso() < 50) {
            precioExtra += 500;
        } else if (50 <= electrodomestico.getPeso() && electrodomestico.getPeso() < 80) {
            precioExtra += 800;
        } else if (80 <= electrodomestico.getPeso()) {
            precioExtra += 1000;
        }

        return precioExtra;
    }

}