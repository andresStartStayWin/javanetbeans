/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author andre
 */


public class Electrodomestico {

    protected double precio, peso, consumoEnergetico;
    protected String color;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, double peso, double consumoEnergetico, String color) {
        this.precio = precio;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
        this.color = color;
    }

    
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(double consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", consumoEnergetico=" + consumoEnergetico + ", color=" + color + '}';
    }
 
    
    
}

