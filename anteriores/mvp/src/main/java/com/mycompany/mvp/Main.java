
package com.mycompany.mvp;

enum TipoFigura {
    CIRCULO("Círculo"),
    CUADRADO("Cuadrado"),
    TRIANGULO("Triángulo");

    private String nombre;

    TipoFigura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Figura {
    private TipoFigura tipo;
    private double area;

    public Figura(TipoFigura tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }

    public TipoFigura getTipo() {
        return tipo;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Figura: " + tipo.getNombre() + ", Área: " + area;
    }
}

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Figura(TipoFigura.CIRCULO, 15.0);
        Figura cuadrado = new Figura(TipoFigura.CUADRADO, 25.0);

        System.out.println(circulo);
        System.out.println(cuadrado);
    }
}