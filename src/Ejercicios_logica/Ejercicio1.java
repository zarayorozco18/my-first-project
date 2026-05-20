package Ejercicios_logica;

    import java.util.Scanner;

public class Ejercicio1 {
    
    static Scanner var_teclado = new Scanner(System.in);
    static int peso = 0;
    static int dulcesAprobados = 0;
    static int dulcesDefectuosos = 0;
    static int contador_consecutivo = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ingrese el peso del dulce en gramos (0 para salir):");
            peso = var_teclado.nextInt();
            System.out.println("Peso: " + peso);
            if (peso == 0) {
                System.out.println("\nProceso finalizado.");
                break;
            }

            
            if (peso < 8 || peso > 12) {
                System.out.println("Dulce defectuoso");
                dulcesDefectuosos++;
                contador_consecutivo++;

                System.out.println("-----------------Alerta-----------------");
                if (contador_consecutivo == 3) {
                    System.out.println("---------Detencion de Emergencia---------");
                    break;
                }
            }
            
            else {
                System.out.println("Dulce Aprobado");
                dulcesAprobados++;

                if (contador_consecutivo > 0) {
                    System.out.println("Reiniciando Contador");
                }
                contador_consecutivo = 0;
            }
        }


        int totalProcesados = dulcesAprobados + dulcesDefectuosos;
        double porcentajeDefectuosos = 0.0;

        if (totalProcesados > 0) {
            porcentajeDefectuosos = ((double) dulcesDefectuosos / totalProcesados) * 100;
        }

        System.out.println("Total de dulces aprobados: " + dulcesAprobados);
        System.out.println("Total de dulces defectuosos: " + dulcesDefectuosos);
        System.out.printf("Porcentaje de dulces defectuosos: " + porcentajeDefectuosos);

    }
}
