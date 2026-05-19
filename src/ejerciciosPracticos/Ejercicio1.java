package ejerciciosPracticos;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner var_teclado = new Scanner(System.in);
    static int contador_consecutivo = 0;
    static double temperatura = 0.0;

    public static void main(String[] args) {

        while (true) {
            System.out.println("Ingrese la T");
            temperatura = var_teclado.nextDouble();
            System.out.println("T: " + temperatura + "°C");
            if (temperatura > 100) {
                contador_consecutivo++;

                System.out.println("--------------Alerta: Tempratura alta------------");
                if (contador_consecutivo == 3) {
                    System.out.println("------------Alarma activada---------------");
                    break;
                } else {
                    if (contador_consecutivo > 0) {
                        System.out.println("Reiniciando contador");
                    }
                    contador_consecutivo = 0;
                }
                System.out.println("Alarma Activada");
            }
        }

    }
}
