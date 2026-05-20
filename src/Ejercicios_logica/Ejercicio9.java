package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio9 {
    static int ofertaMaxima;
    static int contadorOfertasValidas = 0;
    static int precioBase;
    static int ofertaActual;

    public static void main(String[] args) {
        Scanner var_teclado = new Scanner(System.in);

        System.out.println("=== BIENVENIDO AL JUEGO DE LA SUBASTA CIEGA ===");
        System.out.print("Ingrese el precio base del artículo ($): ");
        int precioBase = var_teclado.nextInt();

        // El precio máximo actual inicia siendo el precio base de la subasta

        System.out.println("\nLa subasta ha comenzado con un precio inicial de: $" + precioBase);
        System.out.println("Los compradores pueden ingresar sus ofertas. Ingrese 0 para CERRAR la subasta.");

        // Bucle indefinido para recibir ofertas de los compradores
        while (true) {
            System.out.print("\nIngrese monto de la oferta ($): ");
            int ofertaActual = var_teclado.nextInt();

            // 1. Condición de parada: si se digita 0, se cierra la subasta inmediatamente
            if (ofertaActual == 0) {
                System.out.println(" Registrando el cierre de la subasta...");
                break;
            }

            // 2. Condición de rechazo: la oferta debe ser ESTRICTAMENTE MAYOR que la máxima
            // actual
            if (ofertaActual <= ofertaMaxima) {
                System.out.println(" Oferta insuficiente. Debe superar los $" + ofertaMaxima);
            }
            // 3. Condición de aceptación
            else {
                ofertaMaxima = ofertaActual; // La nueva oferta se convierte en el rival a vencer
                contadorOfertasValidas++; // Contabilizamos el éxito
                System.out.println(" ¡Oferta aceptada! El precio actual del artículo es: $" + ofertaMaxima);
            }
        }

        // Si nunca hubo ofertas válidas, el artículo no se vendió por encima de su
        // valor inicial
        if (contadorOfertasValidas == 0) {
            System.out.println("El artículo no recibió ofertas válidas.");
            System.out.println("Precio final (Precio Base): $" + precioBase);
        } else {
            System.out.println("¡Artículo vendido con éxito!");
            System.out.println("Precio final de venta: $" + ofertaMaxima);
            System.out.println("Total de ofertas válidas recibidas: " + contadorOfertasValidas);
        }

        var_teclado.close();
    }
        
}


