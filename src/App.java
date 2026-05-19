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
    
    }
