public class App {

    // Variables globales de la clase
    static String nombre_estudiante = "Zaray";
    static int edad = 17;
    static float peso = 60.f;
    static boolean estudiante_activo = true;
    static String texto_estudiante_activo = ""; 

    public static void main(String[] args) {
        if (estudiante_activo){
            texto_estudiante_activo = "Sí";
        }else{
            texto_estudiante_activo = "No";
        }
    }
        // Espacio entre las variable
        System.out.println(nombre_estudiante + " " + edad + " " + peso);
        // Salto de línea entre variables
        System.out.println(nombre_estudiante + "\n" + edad + "\n" + peso);
        //Guión intermedio entre las variables
        System.out.println(nombre_estudiante + " - " + edad + " - " + peso);
        //Interpolación de mensajes en java utilizando format
        System.out.println("Me llamo " + nombre_estudiante + ", tengo " + edad + " años y peso " + peso + " kg.");
        System.out.println("Estudiante activo: " + estudiante_activo);
    }
