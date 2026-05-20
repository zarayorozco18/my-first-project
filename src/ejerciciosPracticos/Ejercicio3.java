package ejerciciosPracticos;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner datos_teclado = new Scanner(System.in);
    static int contador_digitos = 0;
    //Tipo de ejercicios: comparacion entre numeros de diferentes iteraciones
    //Valor centinela
    static int digito_previo = -1;
    static int digito_anterior_previo = -1;
    static String resultado = "";
    static boolean segura = true;
    public static void main(String[] args) {
        System.out.println("Ingresa digito por digito de la contrasña");
        while(true){
            System.out.println("Digito >");
            int digito = datos_teclado.nextInt();
            if (digito < 0) {
                break;
            }
            contador_digitos++;
            if (contador_digitos >=3){
                if(digito == digito_previo && digito == digito_anterior_previo){
                    resultado = "Ingreso tres veces seguidas el mismo digito";
                    segura = false;
                    break;
                }
                else if (digito == digito_previo + 1 && digito == digito_anterior_previo + 2){
                    resultado = "Ingreso tres digitos consecutivos";
                    segura = false;
                    break;
                }
                 else if (digito == digito_previo - 1 && digito == digito_anterior_previo - 2){
                    resultado = "Ingreso tres digitos consecutivos";
                    segura = false;
                    break;

                }
            
        }
        digito_anterior_previo = digito_previo;
        digito_previo = digito;
        
    }
    System.out.println(resultado);
        if(segura && contador_digitos >= 3){
        System.out.println("La contrasña es segura");

}
 
