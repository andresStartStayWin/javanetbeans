/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andres.Servicios;

import andres.ejercicio3.Operacion;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ServiciosOperacion {
    
    private final Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion() {
        
        Operacion numeros = new Operacion();
        
        System.out.println("Ingrese el primer numero");
        numeros.setN1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        numeros.setN2(leer.nextInt());
        
        return numeros;
    }
    
    public int sumar(int n1, int n2) {
        
        return n1 + n2;
    }
    
    public int restar(int n1, int n2) {
        
        return n1 - n2;
    }
            
    public int multiplicar(int n1, int n2) {
        
        if (n1 == 0 || n2 == 0) {
            System.out.println("No pueden ser cero");
        }
        return n1 * n2;
    }
    
    public float dividir(int n1, int n2) {
        
        if (n2 == 0) {
            System.out.println("No ponga cero");
        }
        
        return n1 / n2;
    }
    
    
}
