/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Pelicula;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class AlquilerService {
    private static Scanner input = new Scanner(System.in);
    private Pelicula[] peliculas;
    private Alquiler[] alquileres;
    private int contadorPeliculas;
    private int contadorAlquileres;

    public AlquilerService() {
        peliculas = new Pelicula[5];
        alquileres = new Alquiler[5];
        contadorPeliculas = 0;
        contadorAlquileres = 0;
    }

    public void ejecutar() {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    ingresarPelicula();
                    break;
                case 2:
                    crearAlquiler();
                    break;
                case 3:
                    listarPeliculasDisponibles();
                    break;
                case 4:
                    listarPeliculasAlquiladas();
                    break;
                case 5:
                    buscarPeliculaPorTitulo();
                    break;
                case 6:
                    buscarPeliculaPorGenero();
                    break;
                case 7:
                    buscarAlquilerPorFecha();
                    break;
                case 8:
                    calcularIngresoTotal();
                    break;
                case 9:
                    System.out.println("Cerrando la aplicación...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente nuevamente.");
                    break;
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n=== Menú Principal ===");
        System.out.println("1. Ingresar película");
        System.out.println("2. Crear alquiler");
        System.out.println("3. Listar películas disponibles");
        System.out.println("4. Listar películas alquiladas");
        System.out.println("5. Buscar película por título");
        System.out.println("6. Buscar película por género");
        System.out.println("7. Buscar alquiler por fecha");
        System.out.println("8. Calcular ingreso total del servicio");
        System.out.println("9. Salir");
        System.out.println("=======================");
        System.out.print("Ingrese una opción: ");
    }

    private void ingresarPelicula() {
        input.nextLine(); // Limpiar el buffer del scanner
        System.out.println("\n=== Ingresar Película ===");
        System.out.print("Ingrese el título: ");
        String titulo = input.nextLine();
        System.out.print("Ingrese el género: ");
        String genero = input.nextLine();
        System.out.print("Ingrese el año: ");
        int anio = input.nextInt();
        System.out.print("Ingrese la duración en minutos: ");
        int duracion = input.nextInt();

        Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion);
        peliculas[contadorPeliculas] = pelicula;
        contadorPeliculas++;

        System.out.println("Pelicula ingresada exitosamente.");
    }

    private void crearAlquiler() {
        input.nextLine(); // Limpiar el buffer del scanner
        System.out.println("\n=== Crear Alquiler ===");
        System.out.print("Ingrese el título de la película que desea alquilar: ");
        String titulo = input.nextLine();

        Pelicula pelicula = buscarPeliculaPorTitulo(titulo);

        if (pelicula != null) {
            if (!peliculaAlquilada(pelicula)) {
                System.out.print("Ingrese la fecha de inicio del alquiler (dd/mm/yyyy): ");
                String fechaInicioStr = input.nextLine();
                System.out.print("Ingrese la fecha de fin del alquiler (dd/mm/yyyy): ");
                String fechaFinStr = input.nextLine();

                Date fechaInicio = parseFecha(fechaInicioStr);
                Date fechaFin = parseFecha(fechaFinStr);

                if (fechaInicio != null && fechaFin != null) {
                    Alquiler alquiler = new Alquiler(pelicula, fechaInicio, fechaFin);
                    alquileres[contadorAlquileres] = alquiler;
                    contadorAlquileres++;

                    System.out.println("Alquiler creado exitosamente.");
                } else {
                    System.out.println("Fecha inválida. Formato: dd/mm/yyyy");
                }
            } else {
                System.out.println("La película ya está alquilada.");
            }
        } else {
            System.out.println("La película no existe.");
        }
    }

    private void listarPeliculasDisponibles() {
        System.out.println("\n=== Películas Disponibles ===");

        boolean encontrada = false;

        for (Pelicula pelicula : peliculas) {
            if (pelicula != null && !peliculaAlquilada(pelicula)) {
                System.out.println(pelicula.getInfo());
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No hay películas disponibles.");
        }
    }

    private void listarPeliculasAlquiladas() {
        System.out.println("\n=== Películas Alquiladas ===");

        boolean encontrada = false;

        for (Pelicula pelicula : peliculas) {
            if (pelicula != null && peliculaAlquilada(pelicula)) {
                System.out.println(pelicula.getInfo());
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No hay películas alquiladas.");
        }
    }

    private void buscarPeliculaPorTitulo() {
        input.nextLine(); // Limpiar el buffer del scanner
        System.out.println("\n=== Buscar Película por Título ===");
        System.out.print("Ingrese el título de la película: ");
        String titulo = input.nextLine();

        Pelicula pelicula = buscarPeliculaPorTitulo(titulo);

        if (pelicula != null) {
            System.out.println("Pelicula encontrada: " + pelicula.getInfo());
        } else {
            System.out.println("Pelicula no encontrada.");
        }
    }

    private void buscarPeliculaPorGenero() {
        input.nextLine(); // Limpiar el buffer del scanner
        System.out.println("\n=== Buscar Película por Género ===");
        System.out.print("Ingrese el género de la película: ");
        String genero = input.nextLine();

        boolean encontrada = false;

        for (Pelicula pelicula : peliculas) {
            if (pelicula != null && pelicula.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(pelicula.getInfo());
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontraron películas con ese género.");
        }
    }

    private void buscarAlquilerPorFecha() {
        input.nextLine(); // Limpiar el buffer del scanner
        System.out.println("\n=== Buscar Alquiler por Fecha ===");
        System.out.print("Ingrese la fecha a buscar (dd/mm/yyyy): ");
        String fechaStr = input.nextLine();

        Date fecha = parseFecha(fechaStr);

        if (fecha != null) {
            boolean encontrado = false;

            for (Alquiler alquiler : alquileres) {
                if (alquiler != null && alquiler.getFechaInicio().equals(fecha)) {
                    System.out.println(alquiler.toString());
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontraron alquileres para esa fecha.");
            }
        } else {
            System.out.println("Fecha inválida. Formato: dd/mm/yyyy");
        }
    }

    private void calcularIngresoTotal() {
        double ingresoTotal = 0;

        for (Alquiler alquiler : alquileres) {
            if (alquiler != null) {
                int dias = calcularDiasAlquiler(alquiler.getFechaInicio(), alquiler.getFechaFin());
                double costoAlquiler = Alquiler.getPrecio() * dias;
                ingresoTotal += costoAlquiler;

                if (dias > 3) {
                    double interes = costoAlquiler * 0.1;
                    ingresoTotal += interes;
                }
            }
        }

        System.out.println("Ingreso total del servicio: $" + ingresoTotal);
    }

    private boolean peliculaAlquilada(Pelicula pelicula) {
        for (Alquiler alquiler : alquileres) {
            if (alquiler != null && alquiler.getPelicula().equals(pelicula)) {
                return true;
            }
        }
        return false;
    }

    private Pelicula buscarPeliculaPorTitulo(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null && pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return pelicula;
            }
        }
        return null;
    }

    private Date parseFecha(String fechaStr) {
        try {
            String[] partes = fechaStr.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]) - 1; // Meses en Date empiezan desde 0
            int anio = Integer.parseInt(partes[2]) - 1900; // Restar 1900 al año en Date

            return new Date(anio, mes, dia);
        } catch (Exception e) {
            return null;
        }
    }

    private int calcularDiasAlquiler(Date fechaInicio, Date fechaFin) {
        long diferencia = fechaFin.getTime() - fechaInicio.getTime();
        return (int) (diferencia / (24 * 60 * 60 * 1000)) + 1; // Convertir milisegundos a días y sumar 1
    }
}

