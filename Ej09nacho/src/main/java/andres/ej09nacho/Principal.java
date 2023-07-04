/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ej09nacho;

import Entidades.Matematica;
import Servicios.MatematicaServicio;

/**
 *
 * @author andre
 */
public class Principal {

    public static void main(String[] args) {


        MatematicaServicio matSer = new MatematicaServicio();

        double mayor, potencia, raiz;

        System.out.println("Generando objeto 'Matematica'...\n");

        Matematica matematica = matSer.crearMatematica();

        System.out.println("El objeto creado es: " + matematica.toString() + "\n");

        mayor = matSer.devolverMayor(matematica);

        if (mayor == 0) {
            System.out.println("Ambos numeros son iguales: " + matematica.getNum1() + " = " + matematica.getNum2() + "\n");
        } else {
            System.out.println("El numero mas grande es: " + mayor + "\n");
        }

        potencia = matSer.calcularPotencia(matematica);

        System.out.println("El resultado de elevar el mayor numero por el menor es: " + potencia + "\n");

        raiz = matSer.calcularRaiz(matematica);

        System.out.println("La raiz cuadrada del numero menor es: " + raiz + "\n");
    }
}