/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package andres.mascotapp;

import andres.mascotapp.Servicios.ServicioMascotas;
import java.util.ArrayList;

/**
 *
 * @author andre
 *  Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota("Fernando Chiquito", "Chiquito", "Perro");

        m1.setNombre("Pepe Chiquito");
        
        m1.pasear(100);
        
        System.out.println(m1.toString());
 */
public class MascotAPP {

    public static void main(String[] args) {

        ServicioMascotas servMasc = new ServicioMascotas();
        
      servMasc.fabricaMascota(2);
      
      servMasc.mostrarMascotas();
      
      servMasc.actualizarMascota(0);
      servMasc.mostrarMascotas();
        
      servMasc.eliminarMascota();
      servMasc.mostrarMascotas();
        
        
        
        /*
       String[] nombresArray = new String[5];
       
        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Chiquito "+(i+1);
            
        }
        
        for (String var : nombresArray) {
            System.out.println(var);
            
        }


    ArrayList<String> nombresArrayList = new ArrayList();

    nombresArrayList.add("Chiquito");
    nombresArrayList.add("Chiquito");
    nombresArrayList.add("Chiquito");
    
        System.out.println(nombresArrayList.size());
        
        
        nombresArrayList.remove("Chiquito");
        System.out.println(nombresArrayList.size());
        */
}
    
    
}
