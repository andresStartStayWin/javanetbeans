/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ej09;

import Servicios.Ej09_servicioMatematica;

/**
 *
 * @author andre
 */
public class Ej09 {

    public static void main(String[] args) {
         Ej09_servicioMatematica sm = new Ej09_servicioMatematica();

        double num1 = Math.random() * 100;
        double num2 = Math.random() * 100;

        sm.crearMatematica(num1, num2);

        System.out.println("Mayor: " + sm.devolverMayor());
        System.out.println("Potencia: " + sm.calcularPotencia());
        System.out.println("Raiz: " + sm.calcularRaiz());
    }
}