/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ejercicio3;

import andres.Servicios.ServiciosOperacion;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio3 {
    
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        ServiciosOperacion ServOp = new ServiciosOperacion();
        
        Operacion op1 = ServOp.crearOperacion();
        
        int opcion;
        
        System.out.println("1.Suma\n"
        +"2.Resta\n"
        +"3.Multiplicación\n"
        +"4.Division\n"
        +"5.Salir"       
        );
        
        
        do {
            System.out.println("Ingrese una opción");
            
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma es " + ServOp.sumar(op1.getN1(), op1.getN2()));
                case 2:
                    System.out.println("La resta es " + ServOp.restar(op1.getN1(), op1.getN2()));
                case 3:
                    System.out.println("La multiplicacion es " + ServOp.multiplicar(op1.getN1(), op1.getN2()));
                case 4:
                    System.out.println("La division es " + ServOp.dividir(op1.getN1(), op1.getN2()));
                case 5:
                    System.out.println("Usted salió");
                default:
                    System.out.println("Opcion no valida");
           }
            
        } while (opcion != 5);
        
    }
}
