package ejerciciosPracticos;

import java.util.Scanner;

public class Ejercicio2 {
    static int aprobados = 0;
    static int defectuosos = 0;
    static int procesados = 0;
    static int contadorDefectuososseguidos = 0;
    static boolean alarma;
    static int porcentaje = 0;
    static Scanner entrada_teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("--------- Control de calidad de dulces ---------");
        while(true){
            System.out.println("Ingresa el peso del dulce");
                double peso_dulce = entrada_teclado.nextDouble();
                if (peso_dulce == 0) {
                    break;
                }
                procesados++;
                if ((peso_dulce < 0) || (peso_dulce > 12)) {
                    defectuosos++;
                    contadorDefectuososseguidos++;
                    System.out.println("Dulce defectuoso.");
                    if(contadorDefectuososseguidos == 3){
                        alarma = true;
                        System.out.println("ALERTA: 3 dulces defectuosos seguidos.");
                        break;
                    }
                } else {
                    aprobados++;
                    contadorDefectuososseguidos = 0; //reiniciar los defectuosos
                }

        }
        
        if(procesados > 0) {
        System.out.println("Resultados");
        System.out.println("Dulces bien: " + aprobados);
        porcentaje = (defectuosos * 100) / procesados;
        System.out.println("Dulces defectuosos: " + defectuosos);
        System.out.println("Porcentaje de dulces defectuosos: " + porcentaje + "%" );
        }else{
            if(procesados <= 0 || alarma == true){
                
            }
        }

    }
}
