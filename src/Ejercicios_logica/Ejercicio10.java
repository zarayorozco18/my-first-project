package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio10 {
    Scanner var_teclado = new Scanner(System.in);

        System.out.println("Tienes 100 unidades de oxígeno para atravesar 10 salas. ¡Suerte!");

        // Variables de estado del explorador
        int oxigeno = 100;
        int salaActual = 1;
        int dificultadAnterior = 0; // Iniciamos en 0 para que la primera sala no genere agitación falsa

        // El ciclo corre mientras no superemos las 10 salas Y nos quede oxígeno
        // disponible
        while (salaActual <= 10 && oxigeno > 0) {
            System.out.println("\n--- SALA " + salaActual + " / 10 ---");
            System.out.println("Oxígeno disponible: " + oxigeno + " unidades.");
            System.out.print("Ingrese la dificultad de la sala (1 al 5): ");
            int dificultadActual = var_teclado.nextInt();

            // Validar que la dificultad esté dentro del rango permitido
            if (dificultadActual < 1 || dificultadActual > 5) {
                System.out.println(">>> Dificultad inválida. Debe ser un número entre 1 y 5.");
                continue; // Repite el turno en la misma sala sin consumir oxígeno
            }

            // 1. Cálculo del consumo base por dificultad
            int consumoBase = dificultadActual * 3;
            oxigeno = oxigeno - consumoBase;
            System.out.println(">> Consumo base por terreno: -" + consumoBase + " de oxígeno.");

            // 2. Condición de agitación (excepto en la sala 1)
            if (salaActual > 1 && dificultadActual > dificultadAnterior) {
                oxigeno = oxigeno - 5;
                System.out.println(">> ¡Te has agitado! El terreno es más difícil que el anterior: -5 de oxígeno.");
            }

            // Actualizar la memoria del terreno para el siguiente turno
            dificultadAnterior = dificultadActual;

            // Avanzar a la siguiente sala
            salaActual++;
        }

        // Si el oxígeno quedó en 0 o menos, el explorador fracasó
        if (oxigeno <= 0) {
            System.out.println("RESULTADO: ¡FRACASO!");
            System.out.println("Te has quedado sin oxígeno en la sala " + (salaActual - 1) + ".");
            System.out.println("Oxígeno restante: 0 unidades.");
        }
        // Si el ciclo terminó y el oxígeno sigue vivo, significa que pasó las 10 salas
        else {
            System.out.println("RESULTADO: ¡ÉXITO!");
            System.out.println("¡Lograste salir de la cueva y reclamar el tesoro!");
            System.out.println("Oxígeno restante: " + oxigeno + " unidades.");
        }

        var_teclado.close();
    }
}
