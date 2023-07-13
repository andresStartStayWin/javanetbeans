/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.actgrupal3gimnasio;

import Entidades.Cliente;
import Entidades.Rutina;
import Servicios.ServicioCliente;
import Servicios.ServicioRutina;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class GimnasioApp {


    public static void main(String[] args) {
        ServicioCliente servicioCliente = new ServicioCliente();
        ServicioRutina servicioRutina = new ServicioRutina();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("======= MENÚ =======");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Obtener lista de clientes");
            System.out.println("3. Actualizar cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Crear rutina");
            System.out.println("6. Obtener lista de rutinas");
            System.out.println("7. Actualizar rutina");
            System.out.println("8. Eliminar rutina");
            System.out.println("0. Salir");
            System.out.println("====================");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea después de leer la opción

            switch (opcion) {
                case 1:
                    System.out.println("=== Registrar Cliente ===");
                    System.out.print("Ingrese el ID del cliente: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del cliente: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la altura del cliente: ");
                    double altura = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el peso del cliente: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el objetivo del cliente: ");
                    String objetivo = scanner.nextLine();

                    Cliente cliente = new Cliente(id, nombre, edad, altura, peso, objetivo);
                    servicioCliente.registrarCliente(cliente);
                    System.out.println("Cliente registrado exitosamente.");
                    break;

                case 2:
                    System.out.println("=== Lista de Clientes ===");
                    List<Cliente> listaClientes = servicioCliente.obtenerClientes();
                    for (Cliente c : listaClientes) {
                        System.out.println(c);
                    }
                    break;

                case 3:
                    System.out.println("=== Actualizar Cliente ===");
                    System.out.print("Ingrese el ID del cliente a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre del cliente: ");
                    String nombreActualizar = scanner.nextLine();
                    System.out.print("Ingrese la nueva edad del cliente: ");
                    int edadActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la nueva altura del cliente: ");
                    double alturaActualizar = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo peso del cliente: ");
                    double pesoActualizar = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo objetivo del cliente: ");
                    String objetivoActualizar = scanner.nextLine();

                    servicioCliente.actualizarCliente(idActualizar, nombreActualizar, edadActualizar,
                            alturaActualizar, pesoActualizar, objetivoActualizar);
                    System.out.println("Cliente actualizado exitosamente.");
                    break;

                case 4:
                    System.out.println("=== Eliminar Cliente ===");
                    System.out.print("Ingrese el ID del cliente a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();

                    servicioCliente.eliminarCliente(idEliminar);
                    System.out.println("Cliente eliminado exitosamente.");
                    break;

                case 5:
                    System.out.println("=== Crear Rutina ===");
                    System.out.print("Ingrese el ID de la rutina: ");
                    int idRutina = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre de la rutina: ");
                    String nombreRutina = scanner.nextLine();
                    System.out.print("Ingrese la duración de la rutina (minutos): ");
                    int duracionRutina = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nivel de dificultad de la rutina: ");
                    String nivelDificultad = scanner.nextLine();
                    System.out.print("Ingrese la descripción de la rutina: ");
                    String descripcionRutina = scanner.nextLine();

                    Rutina rutina = new Rutina(idRutina, nombreRutina, duracionRutina, nivelDificultad, descripcionRutina);
                    servicioRutina.crearRutina(rutina);
                    System.out.println("Rutina creada exitosamente.");
                    break;

                case 6:
                    System.out.println("=== Lista de Rutinas ===");
                    List<Rutina> listaRutinas = servicioRutina.obtenerRutinas();
                    for (Rutina r : listaRutinas) {
                        System.out.println(r);
                    }
                    break;

                case 7:
                    System.out.println("=== Actualizar Rutina ===");
                    System.out.print("Ingrese el ID de la rutina a actualizar: ");
                    int idActualizarRutina = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre de la rutina: ");
                    String nombreActualizarRutina = scanner.nextLine();
                    System.out.print("Ingrese la nueva duración de la rutina (minutos): ");
                    int duracionActualizarRutina = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nivel de dificultad de la rutina: ");
                    String nivelDificultadActualizar = scanner.nextLine();
                    System.out.print("Ingrese la nueva descripción de la rutina: ");
                    String descripcionActualizarRutina = scanner.nextLine();

                    servicioRutina.actualizarRutina(idActualizarRutina, nombreActualizarRutina,
                            duracionActualizarRutina, nivelDificultadActualizar, descripcionActualizarRutina);
                    System.out.println("Rutina actualizada exitosamente.");
                    break;

                case 8:
                    System.out.println("=== Eliminar Rutina ===");
                    System.out.print("Ingrese el ID de la rutina a eliminar: ");
                    int idEliminarRutina = scanner.nextInt();
                    scanner.nextLine();

                    servicioRutina.eliminarRutina(idEliminarRutina);
                    System.out.println("Rutina eliminada exitosamente.");
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println(); // Salto de línea para separar las diferentes ejecuciones del menú
        }
    }
}