/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ServiciosCafetera {
    
   private final Scanner leer = new Scanner(System.in);
   
   //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
   public Cafetera crearCafetera() {
       
       Cafetera cafe1 = new Cafetera();
       
       System.out.println("Ingrese la cantaidad máxima");
       cafe1.setCapacidadMaxima(leer.nextInt());
       
       
       System.out.println("Ingrese la cantidad actual");
       cafe1.setCantidadActual(leer.nextInt());
       
       return cafe1;
   }
   
    
}
