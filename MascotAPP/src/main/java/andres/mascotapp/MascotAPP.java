/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package andres.mascotapp;

import andres.mascotapp.Servicios.ServicioMascotas;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    List<String> nombres = new ArrayList();
    nombres.add("Lola");
    nombres.add("Rodman");
    nombres.add("Chiquito");
    
        for (String aux : nombres) {
            if (aux.equals("Lola")) {
                nombres.remove(aux);
            }
            
        }

//        for (int i = 0; i < nombres.size(); i++) {
//            System.out.println(nombres.get(i));
//            
//        }


}
} 