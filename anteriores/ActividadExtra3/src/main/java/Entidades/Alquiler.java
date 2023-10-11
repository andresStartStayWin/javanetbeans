/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Servicios.PeliculaServicio;
import java.util.Date;

/**
 *
 * @author andre
 */
public class Alquiler {
    private PeliculaServicio pelSer;
    private Date inicio, fin;
    private static int precio = 10;

    public Alquiler() {
    }

    public Alquiler(PeliculaServicio pelSer, Date inicio, Date fin) {
        this.pelSer = pelSer;
        this.inicio = inicio;
        this.fin = fin;
    }

    public PeliculaServicio getPelSer() {
        return pelSer;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFin() {
        return fin;
    }

    public static int getPrecio() {
        return precio;
    }

    public void setPelSer(PeliculaServicio pelSer) {
        this.pelSer = pelSer;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public static void setPrecio(int precio) {
        Alquiler.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler - " +
                "Titulo: " + pelSer.getTitulo() +
                ", Inicio: " + inicio +
                ", Fin: " + fin;
    }
}