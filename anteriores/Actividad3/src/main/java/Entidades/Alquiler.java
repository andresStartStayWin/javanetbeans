/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Alquiler {
    private Pelicula pelicula;
    private Date fechaInicio;
    private Date fechaFin;
    private static int precio = 10;

    public Alquiler(Pelicula pelicula, Date fechaInicio, Date fechaFin) {
        this.pelicula = pelicula;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Métodos de acceso y modificación

    public static int getPrecio() {
        return precio;
    }

    public static void setPrecio(int precio) {
        Alquiler.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    
    @Override
    public String toString() {
        return "Alquiler - " +
                "Título: " + pelicula.getTitulo() +
                ", Fecha de inicio: " + fechaInicio +
                ", Fecha de fin: " + fechaFin;
    }
}