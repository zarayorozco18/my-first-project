package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio2 {
    
static Scanner var_teclado = new Scanner(System.in);
    static double peso = 0.0;
    static int cantidad_personas = 0;
    static int contador = 1;
    static double peso_total = 0.0;

    public static void main(String[] args) {

        while (true) {

            if (cantidad_personas == 8) {
                System.out.println(" El ascensor ya tiene el cupo máximo de 8 personas. Cerrando puertas...");
                break;
            }

            System.out.println("Ingrese el peso de la persona " + contador + " (o -1 si no hay más fila):");
            peso = var_teclado.nextDouble();

            if (peso == -1) {
                System.out.println(" No hay más personas en la fila. Cerrando puertas...");
                break;
            }
            if (peso_total + peso > 1000) {
                System.out.println(" Esta persona supera el límite de carga (1000 kg).");
                System.out.println(" No se le permite subir. Se ignorara su peso y se cierran las puertas.");
                break;
            }

            peso_total = peso_total + peso;
            cantidad_personas++;
            contador++;
        }

        System.out.println("Cantidad de personas que subieron : " + cantidad_personas);
        System.out.println("Peso total real dentro del ascensor: " + peso_total + " Kg");

    }

}
