package Ejercicios-logica;

import java.util.Scanner;
Scanner teclado = new Scanner(System.in);

        int contadorPersonas = 0;
        double pesoTotal = 0;
        double peso;

        System.out.println("=== ASCENSOR INTELIGENTE ===");

        while (contadorPersonas <  pesoTotal < 1000) {

            System.out.print("Ingrese el peso de la persona (-1 para salir): ");
            peso = teclado.nextDouble();

            // Finalizar ingreso
            if (peso == -1) {
                break;
            }

            // Verificar exceso de peso
            if ((pesoTotal + peso) > 1000) {

                System.out.println("La persona no puede subir.");
                System.out.println("Peso máximo excedido.");
                break;
            }

            // Acumular peso
            pesoTotal = pesoTotal + peso;

            // Contador de personas
            contadorPersonas++;
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Cantidad de personas: " + contadorPersonas);
        System.out.println("Peso total: " + pesoTotal + " kg");

        teclado.close();
}
