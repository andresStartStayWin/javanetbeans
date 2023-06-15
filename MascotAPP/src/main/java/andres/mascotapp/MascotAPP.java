/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package andres.mascotapp;


import java.util.Scanner;
import andres.mascotapp.entidades.Mascota;


/**
 *
 * @author andre
 */
public class MascotAPP {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota("Fernando Chiquito", "Chiquito", "Perro");

        m1.setNombre("Pepe Chiquito");
        
        m1.pasear(100);
        
        System.out.println(m1.toString());
    }
    
    
}
