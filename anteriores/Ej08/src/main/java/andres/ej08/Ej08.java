/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ej08;

import Servicios.Ej08_servicioCadena;

/**
 *
 * @author andre
 */
public class Ej08 {

    public static void main(String[] args) {
         Ej08_servicioCadena sc = new Ej08_servicioCadena();

        sc.crearCadena();
        sc.mostrarVocales();
        sc.invertirFrase();
        sc.vecesRepetida("e");
        sc.compararLongitud("Hola");
        sc.unirFrases("Adios");
        sc.reemplazar("s");
        sc.contiene("e");
    }
}