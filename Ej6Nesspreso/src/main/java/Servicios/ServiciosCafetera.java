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
   
   public void llenarCafetera(Cafetera cafe1) {
       cafe1.setCantidadActual(cafe1.getCapacidadMaxima());
       System.out.println("Se llenó la cafetera");
   }
   
   public void servirTasa(Cafetera cafe1) {
       System.out.println("Ingrese la cantidad a servir");
       int cantidadServir = leer.nextInt();
       
       if (cantidadServir > cafe1.getCantidadActual()) {
           System.out.println("No se pudo llenar la tasa");
           System.out.println("Se ha llenado "+cafe1.getCantidadActual() +" unidades, faltaron "+(cantidadServir - cafe1.getCantidadActual()) );
           
           cafe1.setCantidadActual(0);
      
       } else {
           System.out.println("La taza se llenó");
           
           cafe1.setCantidadActual(cafe1.getCantidadActual() - cantidadServir);
           
           System.out.println("La cantidad restante es " + (cafe1.getCantidadActual() - cantidadServir));
      
       }
   }
       
        public void vaciarCafetera(Cafetera cafe1) {
           cafe1.setCantidadActual(0);
           System.out.println("la cafetera se vació");
       }
       
       public void agregarCafe(Cafetera cafe1) {
           
           System.out.println("ingrese la cantidad a agregar");
           int cantAgregar = leer.nextInt();
                   
           if ((cantAgregar + cafe1.getCantidadActual()) > cafe1.getCapacidadMaxima() ) {
               System.out.println("se superó la capacidad máxima");
               
               llenarCafetera(cafe1);
           } else {
               System.out.println("tiene "+(cafe1.getCantidadActual()+cantAgregar)+" unidades de "+cafe1.getCapacidadMaxima());
             
               cafe1.setCantidadActual(cafe1.getCantidadActual()+cantAgregar);
           }
       }
      
   }
   
    

