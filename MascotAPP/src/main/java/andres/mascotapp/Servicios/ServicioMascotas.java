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
              
        return new Mascota(nombre, apodo, tipo);   
        
    }
    
    public void agregarMascota(Mascota m) {
        mascotas.add(m);
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
            
            agregarMascota(mascotaCreada);
            
            System.out.println(mascotaCreada.toString());
        }
    }
   
    /*
    public void actualizarMascota(int index){
        Mascota m = mascotas.get(index);
        m.setApodo("R");
    
    }
    */
    
    public void actualizarMascota(int index){
        
        if (index<=(mascotas.size()-1)) {
        System.out.println("");
        System.out.println("Actualizar");
        
        Mascota m = crearMascota();
        
        mascotas.set(index, m);
            
        } else {
            System.out.println("No actualizó, Indice erroneo");
        }
    }

    public void eliminarMascota(int index) {
       
         if (index<=(mascotas.size()-1)) {
        mascotas.remove(index);
            
        } else {
            System.out.println("No eliminó, Indice erroneo");
        }
   }
}
