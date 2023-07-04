/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cadena;

/**
 *
 * @author andre
 */
public class CadenaServicio {
        public Cadena crearCadena (String _frase, int _longitud) {
        return new Cadena(_frase,_longitud);
    }

    public int mostrarVocales (Cadena _cadena) {

        String aux;
        int contador = 0;

        for (int i = 0; i < _cadena.getLongitud(); i++) {

            aux = String.valueOf(_cadena.getFrase().charAt(i));

            if (aux.equalsIgnoreCase("A") || aux.equalsIgnoreCase("E") || aux.equalsIgnoreCase("I") || aux.equalsIgnoreCase("O") || aux.equalsIgnoreCase("U")) {
                contador++;
            }
        }

        return contador;
    }

    public String invertirFrase (Cadena _cadena) {

        String fraseInvertida = "";

        for (int i = _cadena.getLongitud()-1; i >= 0; i--) {
              fraseInvertida = fraseInvertida.concat(String.valueOf(_cadena.getFrase().charAt(i)));
        }

        return fraseInvertida;
    }

    public int vecesRepetido (Cadena _cadena, String _letra) {

        int contador = 0;

        for (int i = 0; i < _cadena.getLongitud(); i++) {

            if (String.valueOf(_cadena.getFrase().charAt(i)).equalsIgnoreCase(_letra)) {
                contador++;
            }
        }

        return contador;
    }

    public boolean compararLongitud (Cadena _cadena, String _frase) {
        return _cadena.getLongitud() == _frase.length();
    }

    public String unirFrases (Cadena _cadena, String _frase) {
        return _cadena.getFrase().concat(_frase);
    }

    public String reemplazar (Cadena _cadena, String _letra) {

        String reemplazo = "";

        for (int i = 0; i < _cadena.getLongitud(); i++) {

            if (String.valueOf(_cadena.getFrase().charAt(i)).equalsIgnoreCase("A")) {
                reemplazo = reemplazo.concat(String.valueOf(_letra.charAt(0)));
            } else {
                reemplazo = reemplazo.concat(String.valueOf(_cadena.getFrase().charAt(i)));
            }
        }

        return reemplazo;
    }

    public boolean contiene (Cadena _cadena, String _letra) {

        for (int i = 0; i < _cadena.getLongitud(); i++) {

            if (String.valueOf(_cadena.getFrase().charAt(i)).equalsIgnoreCase(_letra)) {
                return true;
            }
        }

        return false;
    }
}

