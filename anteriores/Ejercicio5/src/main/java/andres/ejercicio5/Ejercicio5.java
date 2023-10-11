/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.ejercicio5;

/**
 *
 * @author andre
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        ServiciosCuenta c = new ServiciosCuenta();
        
        Cuenta cta = c.crearCuenta();
        
        c.ejecutarMenu(c);
        
    }
}
