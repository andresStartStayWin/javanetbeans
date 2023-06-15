/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1;

/**
 *
 * @author andre
 */
public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int numPaginas;

    public Libro (int ISBN, String Titulo, String Autor, int numPaginas) {
    this.ISBN = 123;
    this.Titulo = "DJDJ";
    this.Autor = "sdfl";
    this.numPaginas = 50;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", numPaginas=" + numPaginas + '}';
    }
    
    
    
}
