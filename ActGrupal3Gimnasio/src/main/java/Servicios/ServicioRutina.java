/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Rutina;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class ServicioRutina {
    private List<Rutina> rutinas;

    public ServicioRutina() {
        rutinas = new ArrayList<>();
    }

    public void crearRutina(Rutina rutina) {
        rutinas.add(rutina);
    }

    public List<Rutina> obtenerRutinas() {
        return rutinas;
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        for (Rutina rutina : rutinas) {
            if (rutina.getId() == id) {
                rutina.setNombre(nombre);
                rutina.setDuracion(duracion);
                rutina.setNivelDificultad(nivelDificultad);
                rutina.setDescripcion(descripcion);
                break;
            }
        }
    }

    public void eliminarRutina(int id) {
        rutinas.removeIf(rutina -> rutina.getId() == id);
    }
}