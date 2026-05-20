package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner var_teclado = new Scanner(System.in);
    static boolean tarjetaBloqueada = false;
    static boolean ultimoFueMetro = false;

    // tarifas
    static int saldo = 0;
    static int opcion = 0;
    static int tarifa_metro = 3200;
    static int tarifa_metro_descuento = 1600;
    static int tarifa_autobus = 2500;
    static int tarifa_transbordo = 1000;
    static int limite = -4000;

    public static void main(String[] args) {

        System.out.print("Ingrese el saldo inicial de la tarjeta ($): ");
        saldo = var_teclado.nextInt();

        // Entradas
        while (true) {

            System.out.print("Saldo actual: $" + saldo + "\n Estado: ");
            if (tarjetaBloqueada) {
                System.out.println("BLOQUEADA (Saldo Insuficiente)");
            } else {
                System.out.println("ACTIVA");
            }

            System.out.println("1. Viaje en Autobús ($2,500)");
            System.out.println("2. Viaje en Metro ($3,200 o $1,600 si es seguido)");
            System.out.println("3. Transbordo ($1,000)");
            System.out.println("4. Recargar Tarjeta");
            System.out.println("0. Salir de la simulación");
            System.out.print("Seleccione una opción: ");
            int opcion = var_teclado.nextInt();

            // salida inmediata
            if (opcion == 0) {
                break;
            }

            // Si está bloqueada y no quiere recargar se rompe aquí
            if (tarjetaBloqueada && opcion != 4) {
                System.out.println(">>> ERROR: Tarjeta bloqueada. Debe recargar (Opción 4) antes de viajar.");
                continue;
            }

            if (opcion == 1) {
                // autobus
                if (saldo - tarifa_autobus < limite) {
                    System.out.println(">>> Fondos insuficientes, superaría el límite negativo permitido.");
                } else {
                    saldo = saldo - tarifa_autobus;
                    System.out.println(">> Viaje en Autobús registrado.");
                    ultimoFueMetro = false; // Rompe la racha del metro
                }
            } else if (opcion == 2) {
                // metro
                // Determinar el costo evaluando el viaje anterior
                int costoMetro;
                if (ultimoFueMetro) {
                    costoMetro = tarifa_metro_descuento;
                } else {
                    costoMetro = tarifa_metro;
                }

                // Verificar fondos
                if (saldo - costoMetro < limite) {
                    System.out.println("Fondos insuficientes para abordar el Metro.");
                } else {
                    saldo = saldo - costoMetro;
                    if (ultimoFueMetro) {
                        System.out.println("¡Descuento aplicado! Segundo viaje en Metro seguido.");
                    } else {
                        System.out.println(" Viaje en Metro registrado.");
                    }
                    ultimoFueMetro = true;
                }
            } else if (opcion == 3) {
                // transbordo
                if (saldo - tarifa_transbordo < limite) {
                    System.out.println("Fondos insuficientes para el transbordo.");
                } else {
                    saldo = saldo - tarifa_transbordo;
                    System.out.println("Transbordo registrado.");
                    ultimoFueMetro = false;
                }
            } else if (opcion == 4) {
                // recarga
                System.out.print("Ingrese el valor a recargar ($): ");
                int recarga = var_teclado.nextInt();

                if (recarga > 0) {
                    saldo = saldo + recarga;
                    System.out.println("Recarga exitosa. Nuevo saldo: $" + saldo);

                    // Si al recargar el saldo pasa a ser positivo o cero, se desbloquea
                    if (saldo >= 0) {
                        tarjetaBloqueada = false;
                    }
                } else {
                    System.out.println(" Cantidad de recarga no válida.");
                }
            } else {
                // opcion no valida
                System.out.println("Opción inválida. Intente de nuevo.");
            }

            // Si no recargo
            if (saldo < 0) {
                tarjetaBloqueada = true;
            }
        }

        // Salida
        System.out.println("\nSimulacion Finalizada");
        System.out.println("Saldo final de la tarjeta: $" + saldo);
        var_teclado.close();
    }

}
