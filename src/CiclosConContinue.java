public class CiclosConContinue {
   public static void main(String[] args) {
    System.out.println("---------- Envio material de clase ----------");
    for(int estudiante = 1; estudiante <= 16; estudiante++){
        if(estudiante == 11){
            System.out.println("Estudiante #" + estudiante + " PERDIO ASIGNATURA");
            continue;
        }
        System.out.println("Estudiante #" + estudiante + " Enviando material...");
    }
    System.out.println("Envio finalizado");
    } 
}
