package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio7 {
    // Variables de control del torneo
    static int partidoActual = 1;
    static int puntosTotales = 0;

    // (Ganados o Empatados)
    static int rachaInvictoActual = 0;
    static int rachaInvictoMaxima = 0;

    // Perdidos)
    static int rachaDerrotasActual = 0;
    static int rachaDerrotasMaxima = 0;

    public static void main(String[] args) {
        Scanner var_teclado = new Scanner(System.in);

        System.out.println("Ingrese el resultado de los 20 partidos ('G' = Ganado, 'E' = Empatado, 'P' = Perdido):");

        // Ciclo controlado para exactamente 20 partidos
        while (partidoActual <= 20) {
            System.out.print("Resultado partido " + partidoActual + ": ");
            // Leemos el texto del usuario, tomamos la primera letra y la pasamos a
            // mayúscula
            char resultado = var_teclado.next().toUpperCase().charAt(0);

            // Validar que la entrada sea correcta antes de procesar
            if (resultado != 'G' && resultado != 'E' && resultado != 'P') {
                System.out.println(">>> Entrada inválida. Use únicamente 'G', 'E' o 'P'.");
                continue; // Vuelve a pedir el resultado del mismo partido
            }

            // -puntos y rachas
            if (resultado == 'G') {
                puntosTotales = puntosTotales + 3;

                // Efecto en Rachas:
                rachaInvictoActual++; // Sigue o empieza la racha invicta
                rachaDerrotasActual = 0; // Se rompe la racha de derrotas
            } else if (resultado == 'E') {
                puntosTotales = puntosTotales + 1;

                // Efecto en Rachas:
                rachaInvictoActual++; // Sigue o empieza la racha invicta (empatar cuenta como invicto)
                rachaDerrotasActual = 0; // Se rompe la racha de derrotas
            } else if (resultado == 'P') {
                // No se suman puntos (puntosTotales = puntosTotales + 0)

                // Efecto en Rachas:
                rachaDerrotasActual++; // Sigue o empieza la racha de derrotas
                rachaInvictoActual = 0; // Se rompe la racha invicta
            }

            // Si la racha que está ocurriendo supera al récord histórico, actualizamos el
            // récord
            if (rachaInvictoActual > rachaInvictoMaxima) {
                rachaInvictoMaxima = rachaInvictoActual;
            }

            if (rachaDerrotasActual > rachaDerrotasMaxima) {
                rachaDerrotasMaxima = rachaDerrotasActual;
            }

            // Avanzar al siguiente partido
            partidoActual++;
        }

        // Salida

        System.out.println("Puntos totales obtenidos: " + puntosTotales + " / 60 posibles.");
        System.out.println("Mayor racha invicto:      " + rachaInvictoMaxima + " partidos seguidos.");
        System.out.println("Peor racha de derrotas:   " + rachaDerrotasMaxima + " partidos seguidos.");

        var_teclado.close();
    }
    
}
