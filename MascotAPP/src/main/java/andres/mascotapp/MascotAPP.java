/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package andres.mascotapp;

import andres.mascotapp.entidades.Mascota;
import andres.mascotapp.entidades.Usuario;
import andres.mascotapp.enumeraciones.RazaGatuna;
import andres.mascotapp.enumeraciones.RazaPerruna;
import andres.mascotapp.enumeraciones.SexoHumano;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MascotAPP {

    /**
     *
     * @param args
     */
    
    public static void main(String[] args) {

        
       Mascota m1 = new Mascota("Fer", "Chiquito", "Perro");
       
       Mascota m2 = new Mascota("Pepa", "Filo", "Perro");
       
       List<Mascota> mascotas = new ArrayList();
       mascotas.add(m1);
       mascotas.add(m2);
       
       Usuario u = new Usuario();
       u.setApellido("Fiorde");
       u.setSexo(SexoHumano.HOMBRE);
       u.setNacimiento(new Date("01/11/1991"));
       
       u.setMascotaFavorita(m1);
       
       u.setMascotas(mascotas);

        System.out.println(u.toString());
    }       
} 