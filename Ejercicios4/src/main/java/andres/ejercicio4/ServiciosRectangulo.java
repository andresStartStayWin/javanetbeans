/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andres.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ServiciosRectangulo {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo() {
        
        Rectangulo n = new Rectangulo();
        
        System.out.println("Ingrese la base");
        n.setBase(leer.nextDouble());
        System.out.println("Ingrese altura");
        n.setAltura(leer.nextDouble());

        return n;
    }
    
    public double calcularSuperficie(double base, double altura) {
        
        return base * altura;
        
    }
    
    public double calcularPerimetro(double base, double altura) {
        
        return (base + altura) * 2;
    }
    
    public void dibujarRectangunlo(double base, double altura) {
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {

                if ((i > 1 && i < altura) && (j > 1 && j < base)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
