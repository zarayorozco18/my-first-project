package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio7 {
    static int partidoActual = 1;
    static int puntosTotales = 0;

    static int rachaInvictoActual = 0;
    static int rachaInvictoMaxima = 0;

    static int rachaDerrotasActual = 0;
    static int rachaDerrotasMaxima = 0;

    public static void main(String[] args) {
        Scanner var_teclado = new Scanner(System.in);

        System.out.println("Ingrese el resultado de los 20 partidos ('G' = Ganado, 'E' = Empatado, 'P' = Perdido):");

        while (partidoActual <= 20) {
            System.out.print("Resultado partido " + partidoActual + ": ");
            char resultado = var_teclado.next().toUpperCase().charAt(0);

            if (resultado != 'G' && resultado != 'E' && resultado != 'P') {
                System.out.println(">>> Entrada inválida. Use únicamente 'G', 'E' o 'P'.");
                continue; 
            }

            if (resultado == 'G') {
                puntosTotales = puntosTotales + 3;

                rachaInvictoActual++; 
                rachaDerrotasActual = 0; 
            } else if (resultado == 'E') {
                puntosTotales = puntosTotales + 1;

                rachaInvictoActual++; 
                rachaDerrotasActual = 0; 
            } else if (resultado == 'P') {
               

                rachaDerrotasActual++; 
                rachaInvictoActual = 0; 
            }

            if (rachaInvictoActual > rachaInvictoMaxima) {
                rachaInvictoMaxima = rachaInvictoActual;
            }

            if (rachaDerrotasActual > rachaDerrotasMaxima) {
                rachaDerrotasMaxima = rachaDerrotasActual;
            }

            partidoActual++;
        }

        // Salida

        System.out.println("Puntos totales obtenidos: " + puntosTotales + " / 60 posibles.");
        System.out.println("Mayor racha invicto:      " + rachaInvictoMaxima + " partidos seguidos.");
        System.out.println("Peor racha de derrotas:   " + rachaDerrotasMaxima + " partidos seguidos.");

        var_teclado.close();
    }
    
}
