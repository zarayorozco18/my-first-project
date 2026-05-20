package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio6 {
    
static int minuto = 1;
    static int minutosRiegoEncendido = 0;
    static int humedad = 0;
    static int contadorEstresSeguido = 0;
    static boolean huboEstresCritico = false;

    static boolean riegoActivo = false;

    public static void main(String[] args) {
        Scanner var_teclado = new Scanner(System.in);

        System.out.println("=== SISTEMA DE RIEGO AUTOMATIZADO ===");
        System.out.print("Ingrese la humedad inicial del suelo (0-100%): ");
        int humedad = var_teclado.nextInt();

        while (minuto <= 24) {
            // 1. Evaluar y ajustar el estado del riego según los límites del suelo
            if (humedad < 40) {
                riegoActivo = true;
            } else if (humedad > 60) {
                riegoActivo = false;
            }
            // Nota: Si está entre 40 y 60, el riego conserva el estado que traía.

            // 2. Si el riego está encendido, acumular el tiempo
            if (riegoActivo) {
                minutosRiegoEncendido++;
            }

            // 3. Evaluar condición de estrés hídrico crítico (< 15%)
            if (humedad < 15) {
                contadorEstresSeguido++;
                if (contadorEstresSeguido > 2) {
                    huboEstresCritico = true;
                }
            } else {
                contadorEstresSeguido = 0; // Se rompió la racha de sequía
            }

            // Imprimir el reporte del minuto actual
            System.out.println("Minuto " + minuto + " -> Humedad: " + humedad + "% | Riego: "
                    + (riegoActivo ? "ENCENDIDO" : "APAGADO"));

            // 4. Calcular la humedad del SIGUIENTE minuto
            if (riegoActivo) {
                humedad = humedad + 5;
                if (humedad > 100) { // Validar que no supere el 100%
                    humedad = 100;
                }
            } else {
                humedad = humedad - 3;
                if (humedad < 0) { // Validar que no baje del 0%
                    humedad = 0;
                }
            }

            // Avanzar el tiempo
            minuto++;
        }

        // Salida

        System.out.println("Tiempo total de riego activo: " + minutosRiegoEncendido + " minutos.");

        if (huboEstresCritico) {
            System.out.println("ALERTA: Se detectó ESTRÉS HÍDRICO CRÍTICO.");
            System.out.println("El suelo estuvo a menos del 15% de humedad por más de 2 minutos seguidos.");
        } else {
            System.out.println("Estado del cultivo: Saludable. No hubo estrés hídrico crítico.");
        }

        var_teclado.close();
    }
}

