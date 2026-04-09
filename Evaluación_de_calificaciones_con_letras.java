import java.util.Scanner;

public class Evaluación_de_calificaciones_con_letras {

    public static void main(String[] args) {
        // lector para recibir la nota
        Scanner teclado = new Scanner(System.in);

        // Variable de la nota numerica
        int nota;

        System.out.println("--- Evaluacion de Calificaciones por Letra ---");
        
        System.out.print("Ingrese la calificacion obtenida (0-100): ");
        nota = teclado.nextInt();

        // Validamos  la nota sea real
        if (nota < 0 || nota > 100) {
            System.out.println("Error: La nota ingresada no es válida..");
        } 
        else {
            // Evaluamos rangos de mayor a menor
            if (nota >= 90) {
                System.out.println("Su calificacion es: A");
            } 
            else if (nota >= 80) {
                System.out.println("Su calificacion es: B");
            } 
            else if (nota >= 70) {
                System.out.println("Su calificacion es: C");
            } 
            else if (nota >= 60) {
                System.out.println("Su calificacion es: D");
            } 
            else {
                // Si no cumple con ninguno de los criterios anteriores , es menor a 60
                System.out.println("Su calificacion es: F");
            }
        }

        System.out.println("----------------------------------------------");
        
        teclado.close();
    }
}