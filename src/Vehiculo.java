public class Vehiculo {
    /*
     *Atributos: marca velocidad, encendido
     * Metodos: encender(), apagar(), acelerar(), frenar(), mostrarEstado()
     */
    static String marca = "Lamborghini";
    static int velocidad = 20;
    static boolean encendido = false;

    static void encender() {
        
        //if (encendido == true)
        if (!encendido && velocidad > 0) {
            System.out.println("Vehiculo en movimiento");
        } else {
            System.out.println("Apagado");
        }
    }

    static void apagar() {
        if (!encendido) {
            System.out.println("El vehículo ya esta apagado");
        } else if (velocidad > 0) {
            System.out.println("Vehículo en movimiento");
        } else if (velocidad < 0) {
            System.out.println("Valor invalido");
        } else {
            System.out.println("Vehículo apagado correctamente");
        }
    }

    public static void main(String[] args) {
        encender();
        apagar();
    }
}
