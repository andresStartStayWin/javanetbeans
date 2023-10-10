/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.simuladorclima;
 import java.util.Random;
/**
 *
 * @author andre
 */
public class SimuladorClima {

    public static void main(String[] args) {
        // Simulamos diferentes condiciones climáticas
        String[] condicionesClimaticas = {"Soleado", "Nublado", "Lluvioso", "Tormentoso"};

        // Generamos un índice aleatorio para elegir la condición climática
        Random rand = new Random();
        int indice = rand.nextInt(condicionesClimaticas.length);

        // Mostramos la condición climática
        String condicionActual = condicionesClimaticas[indice];
        System.out.println("El clima actual es: " + condicionActual);
    }
}