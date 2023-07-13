/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class ServicioCliente {
    private List<Cliente> clientes;

    public ServicioCliente() {
        clientes = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
                break;
            }
        }
    }

    public void eliminarCliente(int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);
    }
}