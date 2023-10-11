/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2Circunferencia.Servicios;

import Ej2Circunferencia.Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ServiciosCircunferencia {
    
    private final Scanner leer = new Scanner(System.in);
    
    /*
    c) crear Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto. 
    */
    
    public Circunferencia crearCircunferencia() {
        
        Circunferencia circ = new Circunferencia();
        
        System.out.println("Ingresa el radio");
        
        circ.setRadio(leer.nextDouble());
        
        return circ;   
        
    }
    
    /*
    d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
    */
    public double calcularArea(double radio) {
        
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double calcularPerimetro(double radio) {
        
        return 2 * Math.PI * radio;
    }
}
