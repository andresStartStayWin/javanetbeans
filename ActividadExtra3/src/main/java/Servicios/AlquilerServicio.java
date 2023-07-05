/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alquiler;
import java.util.Date;

/**
 *
 * @author andre
 */
public class AlquilerServicio {
        Alquiler alquiler = new Alquiler();

    public Alquiler crearAlquiler(PeliculaServicio _pelSer) {

        alquiler.setPelSer(_pelSer);

        Date hoy = new Date();
        alquiler.setInicio(hoy);

        return alquiler;
    }

    public void terminarAlquiler(Date fecha) {
        alquiler.setFin(fecha);
    }

    public PeliculaServicio getPelSer() {
        return alquiler.getPelSer();
    }

    public Date getFechaFin() {
        return alquiler.getFin();
    }

    public Date getFechaInicio() {
        return alquiler.getInicio();
    }

    public int getPrecioAlq() {
        return alquiler.getPrecio();
    }

}