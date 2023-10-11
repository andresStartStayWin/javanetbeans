package Ej1;

public class NewMain {

    /**ISBN, Título, Autor, Número de páginas,
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro l1 = new Libro(123, "Juan", "Como comer", 50);
        Libro l2 = new Libro();
        
        System.out.println(l1.toString());

    }
    
}
