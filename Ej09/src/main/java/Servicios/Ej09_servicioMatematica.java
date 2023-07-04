/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Ej09_Matematica;

/**
 *
 * @author andre
 */
public class Ej09_servicioMatematica {
    Ej09_Matematica matematica = new Ej09_Matematica();

    public void crearMatematica(double num1, double num2) {
        this.matematica.setNum1(num1);
        this.matematica.setNum2(num2);
    }

    public double devolverMayor() {
        return Math.max(this.matematica.getNum1(), this.matematica.getNum2());
    }

    public double calcularPotencia() {
        long num1 = Math.round(matematica.getNum1());
        long num2 = Math.round(matematica.getNum2());

        long min = Math.min(num1, num2);
        long max = Math.max(num1, num2);

        return Math.pow(max, min);
    }

    public double calcularRaiz() {
        double min = Math.abs(Math.min(matematica.getNum1(), matematica.getNum2()));
        return Math.sqrt(min);
    }
}