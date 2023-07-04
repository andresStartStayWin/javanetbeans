/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Ej08_Cadena;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ej08_servicioCadena {
     Ej08_Cadena cadena = new Ej08_Cadena();

    public void crearCadena() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese una frase");
        String frase = sc.nextLine();

        this.cadena.setFrase(frase);
        this.cadena.setLongitud(frase.length());
    }

    public void mostrarVocales() {
        int vocales = 0;

        int longitud = this.cadena.getLongitud();
        String frase = this.cadena.getFrase();

        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i+1).equalsIgnoreCase("a") ||
                    frase.substring(i, i+1).equalsIgnoreCase("e") ||
                    frase.substring(i, i+1).equalsIgnoreCase("i") ||
                    frase.substring(i, i+1).equalsIgnoreCase("o") ||
                    frase.substring(i, i+1).equalsIgnoreCase("u")) {
                vocales++;
            }
        }
        System.out.println("La frase '" + frase + "' tiene " + vocales + " vocales");
    }

    public void invertirFrase() {
        StringBuilder invertida = new StringBuilder();
        int longitud = this.cadena.getLongitud();
        String frase = this.cadena.getFrase();

        for (int i = longitud - 1; i >= 0; i--) {
            invertida.append(frase.charAt(i));
        }
        System.out.println(invertida);
    }

    public void vecesRepetida(String letra) {
        char charLetra = letra.charAt(0);
        int longitud = this.cadena.getLongitud();
        String frase = this.cadena.getFrase();
        int vecesRepetida = 0;

        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == charLetra) {
                vecesRepetida++;
            }
        }
        System.out.println("La letra '" + letra + "' se repite " + vecesRepetida + " veces en la frase '" + frase + "'.");
    }

    public void compararLongitud(String otraFrase) {
        int longitud = this.cadena.getLongitud();
        int otraLongitud = otraFrase.length();
        String frase = this.cadena.getFrase();

        if (longitud > otraLongitud) {
            System.out.println("La frase '" + frase + "' es mas larga que '" + otraFrase + "'.");
        } else if (longitud < otraLongitud) {
            System.out.println("La frase '" + otraFrase + "' es mas larga que '" + frase + "'.");
        } else {
            System.out.println("La frase '" + frase + "' y la frase '" + otraFrase + "' tienen la misma longitud.");
        }
    }

    public void unirFrases(String otraFrase) {
        String frasesUnidas = this.cadena.getFrase().concat(otraFrase);

        System.out.println("Las frases unidas dan como resultado '" + frasesUnidas + "'.");
    }

    public void reemplazar(String letra) {
        StringBuilder nuevaFrase = new StringBuilder();
        int longitud = this.cadena.getLongitud();
        String frase = this.cadena.getFrase();

        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i+1).equalsIgnoreCase("a")) {
                nuevaFrase.append(letra);
            } else {
                nuevaFrase.append(frase.charAt(i));
            }
        }
        System.out.println("Al reemplazar todas las letras 'a' de la frase original por '" + letra + "' queda '" + nuevaFrase + "'.");
    }

    public boolean contiene(String letra) {
        int longitud = this.cadena.getLongitud();
        String frase = this.cadena.getFrase();
        boolean tieneLetra = false;

        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                tieneLetra = true;
                break;
            }
        }
        return tieneLetra;
    }
}