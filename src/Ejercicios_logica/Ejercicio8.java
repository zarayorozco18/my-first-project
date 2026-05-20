package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio8 {
     static int ofertaMaxima;
    static int contadorOfertasValidas = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BIENVENIDO AL JUEGO DE LA SUBASTA CIEGA ===");
        System.out.print("Ingrese el precio base del artículo ($): ");
        int precioBase = scanner.nextInt();


        System.out.println("\nLa subasta ha comenzado con un precio inicial de: $" + precioBase);
        System.out.println("Los compradores pueden ingresar sus ofertas. Ingrese 0 para CERRAR la subasta.");

        while (true) {
            System.out.print("\nIngrese monto de la oferta ($): ");
            int ofertaActual = scanner.nextInt();

            if (ofertaActual == 0) {
                System.out.println(">> Registrando el cierre de la subasta...");
                break;
            }

            if (ofertaActual <= ofertaMaxima) {
                System.out.println(">>> Oferta insuficiente. Debe superar los $" + ofertaMaxima);
            }

            else {
                ofertaMaxima = ofertaActual; 
                contadorOfertasValidas++; 
                System.out.println(">> ¡Oferta aceptada! El precio actual del artículo es: $" + ofertaMaxima);
            }
        }

    
       

        if (contadorOfertasValidas == 0) {
            System.out.println("El artículo no recibió ofertas válidas.");
            System.out.println("Precio final (Precio Base): $" + precioBase);
        } else {
            System.out.println("¡Artículo vendido con éxito!");
            System.out.println("Precio final de venta: $" + ofertaMaxima);
            System.out.println("Total de ofertas válidas recibidas: " + contadorOfertasValidas);
        }
        scanner.close();
    }

}
