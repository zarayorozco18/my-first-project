package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio3 {
     static boolean esSegura = true;
    static String motivoRechazo = "";

    static int penultimo = -1;
    static int ultimo = -1;
    static int contadorDigitos = 0;
    static Scanner var_teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese los dígitos uno a uno. Introduzca un número negativo para finalizar.");

        while (true) {

            System.out.print("Ingrese dígito: ");
            int digitoActual = var_teclado.nextInt();

            // Condición de parada: número negativo
            if (digitoActual < 0) {
                break;
            }

            // Validar que realmente sea un solo dígito (0-9)
            if (digitoActual > 9) {
                System.out.println("Por favor, ingrese solo un dígito a la vez (0 al 9).");
                continue;
            }

            contadorDigitos++;

            // Si ya encontramos un fallo antes, seguimos leyendo hasta el negativo,
            // pero ya no evaluamos más reglas.
            if (!esSegura) {
                continue;
            }

            // Evaluación de reglas de seguridad (requiere que ya existan al menos dos
            // dígitos previos)
            if (penultimo != -1 && ultimo != -1) {

                // Regla 1: Tres dígitos iguales seguidos (ej. 5, 5, 5)
                if (digitoActual == ultimo && ultimo == penultimo) {
                    esSegura = false;
                    motivoRechazo = "Contiene tres dígitos idénticos consecutivos (" + digitoActual + ", " + ultimo
                            + ", " + penultimo + ").";
                }

                // Regla 2: Tres números consecutivos ascendentes (ej. 2, 3, 4)
                else if (digitoActual == ultimo + 1 && ultimo == penultimo + 1) {
                    esSegura = false;
                    motivoRechazo = "Contiene una secuencia ascendente de tres números (" + penultimo + ", " + ultimo
                            + ", " + digitoActual + ").";
                }
            }

            // Desplazamiento de variables (actualizar el historial para la siguiente
            // iteración)
            penultimo = ultimo;
            ultimo = digitoActual;
        }

        // salida

        if (contadorDigitos == 0) {
            System.out.println("Resultado: No se ingresó ningún dígito.");
        } else if (esSegura) {
            System.out.println("RESULTADO: Contraseña Segura");
            System.out.println("La secuencia cumple con los estándares bancarios.");
        } else {
            System.out.println("RESULTADO: Contraseña Insegura");
            System.out.println("Motivo: " + motivoRechazo);
        }

        var_teclado.close();
    }
}
