package Ejercicios_logica;

import java.util.Scanner;

public class Ejercicio5 {
    Scanner var_teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numeroOriginal = var_teclado.nextInt();

        
        int aux = numeroOriginal;
        int numeroInvertido = 0;

        while (aux > 0) {
            int ultimoDigito = aux % 10;

            numeroInvertido = (numeroInvertido * 10) + ultimoDigito;

            aux = aux / 10;
        }

        System.out.println("Número invertido: " + numeroInvertido);

        if (numeroOriginal == numeroInvertido) {
            System.out.println("Resultado: El número es un palíndromo.");
        } else {
            System.out.println("Resultado: El número no es un palíndromo.");
        }

        var_teclado.close();
    }


}
