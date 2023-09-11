/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author andre
 */
import java.util.ArrayList;

public class Electrodomestico {

    protected double precio, peso;
    protected String color, consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, double peso, String color, String consumoEnergetico) {
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

}