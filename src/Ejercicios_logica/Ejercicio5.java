package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio5 {
    Scanner var_teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numeroOriginal = var_teclado.nextInt();

        // Guardamos el número original en una variable auxiliar
        // porque la vamos a ir dividiendo
        int aux = numeroOriginal;
        int numeroInvertido = 0;

        // Proceso de Inversión
        while (aux > 0) {
            // 1. Extraer el último dígito del número con el residuo de 10
            int ultimoDigito = aux % 10;

            // 2. Desplazar los dígitos del resultado a la izquierda y sumar el nuevo
            numeroInvertido = (numeroInvertido * 10) + ultimoDigito;

            // 3. Eliminar el último dígito del número auxiliar con división entera
            aux = aux / 10;
        }

        // salida
        System.out.println("Número invertido: " + numeroInvertido);

        // Validar si es palíndromo comparando el original con el invertido
        if (numeroOriginal == numeroInvertido) {
            System.out.println("Resultado: El número es un palíndromo.");
        } else {
            System.out.println("Resultado: El número no es un palíndromo.");
        }

        var_teclado.close();
    }


}
