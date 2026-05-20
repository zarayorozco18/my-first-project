package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio10 {
    static Scanner var_teclado = new Scanner(System.in);

        System.out.println("Tienes 100 unidades de oxígeno para atravesar 10 salas. ¡Suerte!");

        static int oxigeno = 100;
        static int salaActual = 1;
        static int dificultadAnterior = 0;

        while (salaActual <= 10 && oxigeno > 0) {
            System.out.println("\n--- SALA " + salaActual + " / 10 ---");
            System.out.println("Oxígeno disponible: " + oxigeno + " unidades.");
            System.out.print("Ingrese la dificultad de la sala (1 al 5): ");
            int dificultadActual = var_teclado.nextInt();

            if (dificultadActual < 1 || dificultadActual > 5) {
                System.out.println(">>> Dificultad inválida. Debe ser un número entre 1 y 5.");
                continue; 
            }

            int consumoBase = dificultadActual * 3;
            oxigeno = oxigeno - consumoBase;
            System.out.println(">> Consumo base por terreno: -" + consumoBase + " de oxígeno.");

            if (salaActual > 1 && dificultadActual > dificultadAnterior) {
                oxigeno = oxigeno - 5;
                System.out.println(">> ¡Te has agitado! El terreno es más difícil que el anterior: -5 de oxígeno.");
            }

            dificultadAnterior = dificultadActual;

            salaActual++;
        }

        if (oxigeno <= 0) {
            System.out.println("RESULTADO: ¡FRACASO!");
            System.out.println("Te has quedado sin oxígeno en la sala " + (salaActual - 1) + ".");
            System.out.println("Oxígeno restante: 0 unidades.");
        }

        else {
            System.out.println("RESULTADO: ¡ÉXITO!");
            System.out.println("¡Lograste salir de la cueva y reclamar el tesoro!");
            System.out.println("Oxígeno restante: " + oxigeno + " unidades.");
        }

        var_teclado.close();
    }
}
