/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author andre
 */
public final class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(double precio, double peso, String color, String consumoEnergetico, double resolucion, boolean tdt) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return  "Resolucion: " + resolucion +
                ", TDT: " + tdt +
                ", Precio: " + precio +
                ", Peso: " + peso +
                ", Color: " + color +
                ", Consumo Energetico: " + consumoEnergetico;
    }
}
