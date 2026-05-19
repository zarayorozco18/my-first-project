public class Persona {
     // Declarar Variables
    static String nombre_persona = "Zaray";
    static String apellido_persona = "Orozco Díaz";
    static int edad = 17;
    static char genero = 'F';
    static float promedio_semestre = 4.0f;
    static boolean vive_manizales = true;

    // crear metodos adicionales

    static void imprimirInformacion() {
        System.out.println("Información del estudiante: \nNombre completo: " + nombre_persona + " " + apellido_persona);
    }

    // metodo que imprime la edad de la persona
    static void imprimirEdad() {
        System.out.println("Edad: " + edad);
    }

    // metodo que imprime el promedio_semestre
    static void imprimirPromedio() {
        System.out.println("Promedio: " + promedio_semestre);

    }

    // metodo que verifica si vive en manizales o no
    static void imprimirViveManizales() {
        if (vive_manizales == true) {
            System.out.println("Vive en Manizales");

        } else {
            System.out.println("No vive en Manizales");
        }
    }

    static void imprimirGenero() {
        if (genero == 'F') {
            System.out.println("Genero: Femenino");

        } else if (genero == 'M') {
            System.out.println("Genero: Masculino");

        } else {
            System.out.println("Genero: No binario");

        }
    }

    public static void main(String[] args) {
        // llamar el metodo de imprimir informacion
        imprimirInformacion();
        imprimirEdad();
        imprimirPromedio();
        imprimirViveManizales();
        imprimirGenero();
    }
}
