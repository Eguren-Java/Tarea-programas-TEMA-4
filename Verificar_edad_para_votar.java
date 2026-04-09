import java.util.Scanner;

public class Verificar_edad_para_votar {

    public static void main(String[] args) {
        // Entrada del teclado
        Scanner lector = new Scanner(System.in);

        // Declaramos variable para edad
        int edad;

        System.out.println("--- Checamos la Elegibilidad para Votar ---");
        
        // Solicitamos dato al usuario
        System.out.print("Ingrese su edad actual: ");
        edad = lector.nextInt();

        // Validamos condicion  edad minima (18 años)
        if (edad >= 18) {
            System.out.println("Resultado: Usted es elegible para votar.");
        } else {
            // esta linea es para los años faltantes ,en caso de no ser mayor de 18 años
            int añosFaltantes = 18 - edad;
            System.out.println("Resultado: Usted no es elegible para votar.");
            System.out.println("Le faltan " + añosFaltantes + " años para cumplir la edad minima.");
        }

        System.out.println("------------------------------------------------");
        
        // Cerramos  lector
        lector.close();
    }
}