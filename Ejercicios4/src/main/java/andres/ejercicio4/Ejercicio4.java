/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio4 {

    public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ServiciosRectangulo rec1 = new ServiciosRectangulo();
        
        Rectangulo op1 = rec1.crearRectangulo();
        
        int opcion;
        
        System.out.println("1. Superficie \n"
                + "2. Perimetro \n"
                + "3. Dibujar rectangulo \n"
                + "4. Salir");
        
        do {
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La superficie es " + rec1.calcularSuperficie(op1.getBase(), op1.getAltura()));
                case 2:
                    System.out.println("El perimetro es " + rec1.calcularPerimetro(op1.getBase(), op1.getAltura()));
                case 3:
                    rec1.dibujarRectangunlo(op1.getAltura(), op1.getBase());
                case 4:
                    System.out.println("Usted salió");
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 4);
        
    }
}
