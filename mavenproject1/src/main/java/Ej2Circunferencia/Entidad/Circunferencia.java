/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2Circunferencia.Entidad;

/**
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real.
 */
public class Circunferencia {
    
    private double  radio;
    
    public Circunferencia() {
    }
    
    /*
    a) Método constructor que inicialice el radio pasado como parámetro. 
    */
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    /*
    b) Métodos get y set para el atributo radio de la clase Circunferencia. 
    */
    
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;        
    }
    
}
