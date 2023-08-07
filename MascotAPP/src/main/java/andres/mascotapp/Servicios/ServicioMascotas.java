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
    private Scanner leer;
    
    private List<Mascota> mascotas;
     
    public ServicioMascotas() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
            
    public Mascota crearMascota() {
        System.out.println("nombre");
        String nombre = leer.next();
        
        System.out.println("apodo");
        String apodo = leer.next();
        
        System.out.println("tipo");
        String tipo = leer.next();
              
        Mascota m = new Mascota(nombre, apodo, tipo);   
        
        mascotas.add(m);
        
        return m;
    }
            
    
    public void mostrarMascotas(){
        System.out.println("Las mascotas son ");
        for (Mascota aux : mascotas) {
            
            System.out.println(aux.toString());
            
        }
        System.out.println("cantidad = "+mascotas.size());
    }
            
    
    public void fabricaChiquitos(int cantidad) {
        
        for (int i = 0; i < cantidad; i++) {
            
            mascotas.add(new Mascota("Fer", "Chiquito", "Beagle"));
            
        }
    }
    
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota(); 
            
            System.out.println(mascotaCreada.toString());
        }
    }
}
