/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Personas;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ServiciosPersonas {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Personas crearPersona() {
        Personas p1 = new Personas();
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.nextLine());
        
        System.out.println("ingrese su sexo");
        System.out.println("H(Hombre), M(Mujer), O(Otro)");
        System.out.println("S,M,O");
        String sexo = leer.next().toUpperCase();
        
        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("Ingrese una opcion valida");
            sexo = leer.next().toUpperCase();
        }
        
        p1.setSexo(sexo);
        
        System.out.println("ingrese su edad");
        p1.setEdad(leer.nextInt());
        
        System.out.println("ingrese peso");
        p1.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese altura");
        p1.setAltura(leer.nextDouble());
        
        return p1;
    }
    
    public double calcularIMc(Personas p1) {
        double peso = p1.getPeso();
        double altura = p1.getAltura();
    
    
    double imc = peso / (altura * altura);
    
    if (imc < 20) {
        System.out.println("debajo del peso ideal");
        return -1;
        
    } else if (imc >= 20 && imc <= 25) {
        System.out.println("peso ideal");
        return 0;
    } else {
        System.out.println("por arriba de su peso");
        return 1;
    }
    
}
        public boolean esMayorDeEdad(Personas p1) {

        int edad = p1.getEdad();

        if (edad > 18) {

            System.out.println("Es mayo de edad");

            return true;

        } else {

            System.out.println("Es menor de edad");

            return false;

        }
}
}