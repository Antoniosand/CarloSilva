import java.util.Random;
import java.util.Scanner;

public class AsistenteAritmetico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Asistente Aritmético!");
        System.out.println("Elige el tipo de operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingresa tu elección: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        System.out.println("Elige el nivel de dificultad:");
        System.out.println("1. Fácil");
        System.out.println("2. Medio");
        System.out.println("3. Difícil");
        System.out.print("Ingresa tu elección: ");

        int nivelDificultad = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        int numeroPreguntas = 5;  // Cantidad de preguntas a hacer

        for (int i = 0; i < numeroPreguntas; i++) {
            int num1 = generarNumeroAleatorio(nivelDificultad);
            int num2 = generarNumeroAleatorio(nivelDificultad);

            int respuestaCorrecta = 5;

            switch (opcion) {
                case 1 -> {
                    respuestaCorrecta = num1 + num2;
                }
                case 2 -> {
                    respuestaCorrecta = num1 - num2;
                }
                case 3 -> {
                    respuestaCorrecta = num1 * num2;
                }
                case 4 -> {
                    respuestaCorrecta = num1 / num2;
                }
                default -> {
                    System.out.println("Opción no válida. Saliendo del programa.");
                    return;
                }
            }

            System.out.print("¿Cuánto es " + num1 + " mas " + num2 + "? ");
           // System.out.print("¿Cuánto es " + num1 + " menos " + num2 + "? ");
            //System.out.print("¿Cuánto es " + num1 + " por " + num2 + "? ");
            //System.out.print("¿Cuánto es " + num1 + " dividido " + num2 + "? ");
            int respuestaUsuario = scanner.nextInt();

            if (respuestaUsuario == respuestaCorrecta) {
                System.out.println(obtenerMensajePositivo());
            } else {
                System.out.println(obtenerMensajeNegativo());
            }
        }
    }
    public void PorcentajeRespuestasCorrectas(String obtenerMensajePositivo) {
        System.out.println("Rendimiento del estudiante: " + obtenerMensajePositivo + "% de respuestas correctas.");
    }

    public static int generarNumeroAleatorio(int nivelDificultad) {
        Random random;
        random = new Random();
        int maximo = 10;

        switch (nivelDificultad) {
            case 1 -> maximo = 10;
            case 2 -> maximo = 100;
            case 3 -> maximo = 1000;
        }

        return random.nextInt(maximo + 1);
    }

    public static String obtenerMensajePositivo() {
        String[] mensajesPositivos = {"¡Muy bien!", "¡Excelente!", "¡Buen trabajo!", "¡Sigue así!"};
        Random random = new Random();
        return mensajesPositivos[random.nextInt(mensajesPositivos.length)];
    }
   

    public static String obtenerMensajeNegativo() {
        String[] mensajesNegativos = {"No. Por favor intenta de nuevo.", "Incorrecto. Pide ayuda a tu docente.",
                "¡No te rindas!", "No. Sigue intentando."};
        Random random = new Random();
        return mensajesNegativos[random.nextInt(mensajesNegativos.length)];
    }
}
 
