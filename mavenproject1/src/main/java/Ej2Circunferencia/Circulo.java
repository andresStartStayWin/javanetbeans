/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej2Circunferencia;

import Ej2Circunferencia.Entidad.Circunferencia;
import Ej2Circunferencia.Servicios.ServiciosCircunferencia;

/**
 *
 * @author andre
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiciosCircunferencia Serv = new ServiciosCircunferencia();
        
        Circunferencia circ = Serv.crearCircunferencia();
        
        System.out.println("El area es: " + Serv.calcularArea(circ.getRadio()));
        
        System.out.println("El perimetro es: " + Serv.calcularPerimetro(circ.getRadio()));
    }
    
}
