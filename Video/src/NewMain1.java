
import java.util.Scanner;

/**
 * 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 *
 * @author andre
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = suma(10, 10);
        System.out.println(resultado);
        
        saludoPer("Chiquito");
        
        Scanner leer = new Scanner(System.in);
        
        String nombre = leer.next();
        saludoPer(nombre);
        saludoPer(leer.next());
    }
    public static int suma(int a, int b){
        //logica
        int resultado = a + b;
        
        return resultado;
    }
    public static void saludoPer(String nombre) {
        System.out.println("Hola "+nombre+" como estas?");
    }
}