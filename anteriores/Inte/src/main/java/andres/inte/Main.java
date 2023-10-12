/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.inte;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Empleado[] empleados = new Empleado[6];
        
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("ingrese nombre empleado");
            String nombre = leer.next();
            
            System.out.println("Ingrese el salario");
            double salario = leer.nextDouble();
            empleados[i] = new Empleado(nombre, salario);
        }
        
        double sumaSalarios = 0;
        for (int i = 0; i < empleados.length; i++) {
            sumaSalarios += empleados[i].getSalario();
            
        }
        double promedioSalarios = sumaSalarios / empleados.length;
        System.out.println("El promedio de todos los salarios es "+ promedioSalarios);
        int contador = 0;        
        
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario()> promedioSalarios){
                contador++;
            }
        }
        
        String nombresEmpleados[] = new String[contador];
        contador = 0;
          for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario()> promedioSalarios){
                nombresEmpleados[contador] = empleados[i].getNombre();
                contador++;
    }
}
          for (int i = 0; i < nombresEmpleados.length; i++) {
              System.out.println("El emplado "+ nombresEmpleados[i]+" supera el promedio");
            
        }
}
}