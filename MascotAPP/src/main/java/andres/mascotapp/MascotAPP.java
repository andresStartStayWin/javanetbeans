/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package andres.mascotapp;

import andres.mascotapp.entidades.Mascota;

/**
 *
 * @author andre
 */
public class MascotAPP {

    public static void main(String[] args) {

        Mascota m1 = new Mascota();

        m1.apodo = "Chiquito";
        m1.nombre = "Fernando Chiquito";
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Beagle";
        m1.cola = true;
        m1.color = "Tricolor";

        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo);
    }
}
