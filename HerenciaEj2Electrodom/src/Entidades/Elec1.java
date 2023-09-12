/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author andre
 */
public class Elec1 {
    
    protected double precio, peso;
    protected String color, consumoEnergetico;

    public Elec1() {
    }

    public Elec1(double precio, double peso, String color, String consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    private void comprobarConsumo(String letra) {
        if (letra >= "A" && letra <= "F") {
            consumoEnergetico = letra;
        }
        else {
            consumoEnergetico = "F";
        }
    }
    
    
}
