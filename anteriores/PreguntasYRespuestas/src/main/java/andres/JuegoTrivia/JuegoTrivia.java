/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package andres.JuegoTrivia;

import java.util.Scanner;

public class JuegoTrivia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] preguntas = {
                "¿Cuál es la capital de Egipto?",
                "¿Cuál es el Robocop?",
                "¿Cuál es el resultado de 4872 + 4873?"
        };

        String[] opciones = {
                "a) El Cairo  b) París  c) Madrid",
                "a) Azul  b) Plateado Azulado  c) Amarillo",
                "a) 3  b) 4  c) 9745"
        };

        String[] respuestas = {"a", "b", "c"};

        int puntaje = 0;

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i]);
            System.out.println(opciones[i]);

            System.out.print("Ingrese su respuesta (a, b o c): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase(respuestas[i])) {
                System.out.println("¡Correcto!\n");
                puntaje++;
            } else {
                System.out.println("Respuesta incorrecta. La respuesta correcta es: " + respuestas[i] + "\n");
            }
        }

        System.out.println("Fin del juego. Tu puntaje es: " + puntaje + " de " + preguntas.length);
    }
}
