/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ej6nesspreso;

import Entidades.Cafetera;
import Servicios.ServiciosCafetera;
import java.util.Scanner;

/**
 *Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 * @author andre
 */
public class Ej6Nesspreso {
    
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        ServiciosCafetera ServCaf = new ServiciosCafetera();
        Cafetera cafe = ServCaf.crearCafetera();
        
        int opcion;
        
        System.out.println("1.Servir una taza");
        System.out.println("2.Vaciar cafetera");
        System.out.println("3.Agregar Café");
        System.out.println("4.Salir");
        
    do {
        System.out.println("Ingrese la opción");
        
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                ServCaf.servirTaza(cafe);
                break;
            case 2:
                ServCaf.vaciarCafetera(cafe);
                break;
            case 3:
                ServCaf.agregarCafe(cafe);
                break;
            case 4:
                System.out.println("salió");
                break;
            default:
                System.out.println("la opcion es incorrecta");
                
        }
    } while (opcion != 4);
        
    }
}
