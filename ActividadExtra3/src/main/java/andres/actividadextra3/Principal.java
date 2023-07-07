/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.actividadextra3;

import Servicios.AlquilerServicio;
import Servicios.PeliculaServicio;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Principal {
    private static Scanner input = new Scanner(System.in);
    private static PeliculaServicio[] pelSer = new PeliculaServicio[5];
    private static AlquilerServicio[] alqSer = new AlquilerServicio[5];
    
    public static void main(String[] args) {
               // Tengo que inicializar los array
        for (int i = 0; i < 5; i++) {
            pelSer[i] = new PeliculaServicio();
            alqSer[i] = new AlquilerServicio();
        }

        boolean salir = false;
        int opc = 0, contadorPel = 0, contadorAl = 0;

        while (!salir) {

            mostrarMenu(contadorPel,contadorAl);
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    contadorPel += ingresarPelicula(contadorPel);
                    break;
                case 2:
                    contadorAl += crearAlquiler(contadorAl);
                    break;
                case 3:
                    System.out.println("\nPeliculas disponibles:");
                    verDisponibles();
                    break;
                case 4:
                    System.out.println("\nPeliculas alquiladas:");
                    verAlquiladas();
                    break;
                case 5:
                    buscarPelicula();
                    break;
                case 6:
                    buscarAlquilerFecha();
                    break;
                case 7:
                    terminarAlquiler();
                    break;
                case 8:
                    System.out.println("\nCerrando aplicacion, hasta luego.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                    break;
            }

        }

    }

    public static void mostrarMenu(int _contadorPel, int _contadorAl) {

        System.out.println("\nMenu principal\n");
        System.out.println("1. Ingresar pelicula (" + (_contadorPel) + "/5)");
        System.out.println("2. Alquilar pelicula (" + (_contadorAl) + "/5)");
        System.out.println("3. Mostrar peliculas disponibles");
        System.out.println("4. Mostrar peliculas alquiladas");
        System.out.println("5. Buscar pelicula");
        System.out.println("6. Buscar alquiler por fecha");
        System.out.println("7. Retornar pelicula");
        System.out.println("8. Salir");
        System.out.println("\nIngrese opcion:");

    }

    // Retorna 1 para aumentar el contador de peliculas ingresadas
    public static int ingresarPelicula(int _contadorPel) {

        pelSer[_contadorPel].crearPelicula();
        return 1;

    }

    // Retorna 1 si el alquiler fue creado o 0 si el alquier no se pudo crear
    public static int crearAlquiler(int _contadorAl) {

        String titulo;
        String opc = "";

        input.nextLine();

        System.out.println("\nIngrese el titulo de la pelicula que desea alquilar:");
        titulo = input.nextLine();

        if (buscarPorTitulo(titulo) != null) {

            if (!alquilerActivo(buscarPorTitulo(titulo), new Date())) {

                System.out.println("La pelicula se encuentra disponible, confirma el alquiler? (s/n)");
                opc = input.nextLine();

                if (opc.equalsIgnoreCase("s")) {

                    alqSer[_contadorAl].crearAlquiler(buscarPorTitulo(titulo));
                    System.out.println("Alquiler creado.");
                    return 1;

                } else {
                    System.out.println("Alquiler no creado, intente nuevamente.");
                    return 0;
                }

            } else {
                System.out.println("La pelicula se encuentra alquilada.");
                return 0;
            }

        } else {
            System.out.println("La pelicula no existe.");
            return 0;
        }
    }

    public static void verDisponibles() {

        boolean disponible = true;
        int contador = 0;

        for (int i = 0; i < pelSer.length; i++) {

            for (int j = 0; j < alqSer.length; j++) {

                if (pelSer[i] == alqSer[j].getPelSer() && alquilerActivo(pelSer[i], new Date())) {
                    disponible = false;
                    break;
                }
            }

            if (pelSer[i].getTitulo() != null && disponible) {
                System.out.println("- " + pelSer[i].getTitulo());
                contador++;
            }

            disponible = true;
        }

        if (contador == 0) {
            System.out.println("No hay peliculas disponibles");
        }
    }

    public static void verAlquiladas() {

        boolean disponible = true;
        int contador = 0;

        for (int i = 0; i < pelSer.length; i++) {

            for (int j = 0; j < alqSer.length; j++) {

                if (pelSer[i] == alqSer[j].getPelSer() && alquilerActivo(pelSer[i], new Date())) {
                    disponible = false;
                    break;
                }
            }

            if (pelSer[i].getTitulo() != null && !disponible) {
                System.out.println("- " + pelSer[i].getTitulo());
                contador++;
            }

            disponible = true;
        }

        if (contador == 0) {
            System.out.println("No hay peliculas alquiladas");
        }
    }

    public static void buscarPelicula() {

        int opc = 0;

        System.out.println("\n1. Buscar por titulo");
        System.out.println("2- Buscar por genero");
        System.out.println("\nIngrese opcion:");
        opc = input.nextInt();
        input.nextLine();

        switch (opc) {
            case 1:
                System.out.println("\nIngrese el titulo de la pelicula:");
                String titulo = input.nextLine();

                if (buscarPorTitulo(titulo) != null) {
                    System.out.println("\nPelicula encontrada:");
                    System.out.println(buscarPorTitulo(titulo).getInfo());
                } else {
                    System.out.println("\nPelicula no encontrada.");
                }

                break;
            case 2:
                System.out.println("\nIngrese el genero de la pelicula:");
                String genero = input.nextLine();

                PeliculaServicio[] pelConGenero = buscarPorGenero(genero);

                if (pelConGenero.length > 0) {

                    System.out.println("\nPelicula(s) encontrada(s):");

                    for (int i = 0; i < pelConGenero.length; i++) {
                        System.out.println(pelConGenero[i].getInfo());
                    }

                } else {
                    System.out.println("\nPelicula(s) no encontrada(s):");
                }

                break;
            case 0:
            default:
                System.out.println("Opcion incorrecta, intente nuevamente.\n");
                break;
        }
    }

    // Devuelve el PeliculaServicio para la pelicula con ese titulo (si existe) o null si no existe
    public static PeliculaServicio buscarPorTitulo(String titulo) {

        for (int i = 0; i < pelSer.length; i++) {

            if (pelSer[i].getTitulo() != null && pelSer[i].getTitulo().equalsIgnoreCase(titulo)) {
                return pelSer[i];
            }
        }
        return null;
    }

    // Devuelve un array de peliculas con ese genero o array vacio si no existe
    public static PeliculaServicio[] buscarPorGenero(String genero) {

        int contador = 0, contador2 = 0;

        for (int i = 0; i < pelSer.length; i++) {

            if (pelSer[i].getGenero() != null && pelSer[i].getGenero().equalsIgnoreCase(genero)) {
                contador++;
            }
        }

        PeliculaServicio[] _pelSer = new PeliculaServicio[contador];

        for (int i = 0; i < pelSer.length; i++) {

            if (pelSer[i].getGenero() != null && pelSer[i].getGenero().equalsIgnoreCase(genero)) {
                _pelSer[contador2] = pelSer[i];
                contador2++;
            }
        }

        return _pelSer;
    }

    public static void buscarAlquilerFecha() {

        int anio, mes, dia, contador = 0;

        System.out.println("\nIngrese año:");
        anio = input.nextInt() - 1900;
        System.out.println("Ingrese mes:");
        mes = input.nextInt() - 1;
        System.out.println("Ingrese el dia:");
        dia = input.nextInt();

        Date fecha = new Date(anio,mes,dia);

        System.out.println();

        for (int i = 0; i < alqSer.length; i++) {

            if (alqSer[i].getPelSer() != null) {
                if (alqSer[i].getFechaInicio().before(fecha) && (alqSer[i].getFechaFin() == null || alqSer[i].getFechaFin().after(fecha))) {
                    System.out.println("La pelicula " + alqSer[i].getPelSer().getTitulo() + " se encuentra alquilada en esa fecha");
                    contador++;
                }
            }
        }

        if (contador == 0) {
            System.out.println("No se encontraron peliculas alquiladas para esa fecha");
        }
    }

    // Devuelve verdadero si la pelicula esta alquilada en la fecha indicada
    public static boolean alquilerActivo(PeliculaServicio _pelSer, Date _fecha) {

        for (int i = 0; i < alqSer.length; i++) {

            if (alqSer[i].getPelSer() == _pelSer) {

                if (alqSer[i].getFechaFin() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void terminarAlquiler() {

        int opc = 0;

        System.out.println("\n1. Ingresar fecha");
        System.out.println("2- Retornar ahora");
        System.out.println("\nIngrese opcion:");
        opc = input.nextInt();

        switch (opc) {
            case 1:
                int anio, mes, dia;

                System.out.println("\nIngrese año:");
                anio = input.nextInt() - 1900;
                System.out.println("Ingrese mes:");
                mes = input.nextInt() - 1;
                System.out.println("Ingrese el dia:");
                dia = input.nextInt();

                Date fecha = new Date(anio,mes,dia);

                retornarPelicula(fecha);
                break;
            case 2:
                retornarPelicula(new Date());
                break;
            case 0:
            default:
                System.out.println("Opcion incorrecta, intente nuevamente.\n");
                break;
        }
    }

    public static void retornarPelicula(Date fecha) {

        boolean retornada = false;

        System.out.println("\nQue pelicula desea retornar?");
        input.nextLine();
        verAlquiladas();

        System.out.println("\nIngrese titulo");
        String titulo = input.nextLine();

        for (int i = 0; i < alqSer.length; i++) {

            if (alqSer[i].getPelSer() != null && alqSer[i].getPelSer() == buscarPorTitulo(titulo)) {

                alqSer[i].terminarAlquiler(fecha);

                // Un dia entero equivalen a 86400000 unidades de tiempo
                int dias = (int) ((alqSer[i].getFechaFin().getTime() - alqSer[i].getFechaInicio().getTime())/86400000);
                double costo = (1 + dias) * alqSer[i].getPrecioAlq();

                System.out.println("\nEl costo total del alquiler es de:");

                if (dias <= 2) {
                    System.out.println("$ " + costo);
                } else {
                    System.out.println("$ " + (costo * 1.1));
                }

                retornada = true;
            }
        }

        if (!retornada) {
            System.out.println("Ocurrio un error. Intente nuevamente");
        }

    }

}