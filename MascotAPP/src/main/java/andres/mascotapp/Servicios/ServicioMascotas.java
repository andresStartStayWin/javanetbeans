/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andres.mascotapp.Servicios;

import andres.mascotapp.entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ServicioMascotas {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private List<String> mascotas;
     
    public ServicioMascotas() {
        this.mascotas = new ArrayList();
    }
            
    public void crearMascota() {
        System.out.println("nombre");
        String nombre = leer.next();
        
        System.out.println("apodo");
        String apodo = leer.next();
        
        System.out.println("tipo");
        String tipo = leer.next();
        
        String mascota = nombre+" "+apodo+" "+tipo;
        mascotas.add(mascota);
    }
            
    
    public void mostrarMascotas(){
        System.out.println("Las mascotas son ");
        for (String aux : mascotas) {
            
            System.out.println(aux);
            
        }
        System.out.println("cantidad = "+mascotas.size());
    }
            
}
