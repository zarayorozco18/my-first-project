public class CiclosConBreak {
    // Revisar archivos y salir del ciclo una vez encuentre el archivos
    public static void main(String[] args) {
        System.out.println("------------ Iniciando scaneo de seguridad -------------");
        // for(int archivo = 1; archivo < 11; archivo++){}
        for (int archivo = 1; archivo <= 10; archivo++) {
            // condicion si el archivo es igual a 4
            if (archivo == 4) {
                System.out.println("Alerta.\nEl archivo #" + archivo + " esta corrupto");
                break;
            }
            System.out.println("Archivo #" + archivo + " analizado. ");
        }
        System.out.println("----------- Scaneo finalizado -----------");
    }
}
