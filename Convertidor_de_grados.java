import java.util.Scanner;

public class Convertidor_de_grados {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        // Uso "double" porque la temperatura casi siempre lleva decimales
        double celsius, resultado;
        int opcion;

        System.out.println("--- Convertidor de Temperatura ---");
        
        // Pedir los grados Celsius
        System.out.print("Ingresa los grados Celsius: ");
        celsius = lector.nextDouble();

        // Mostrar el menu de opciones
        System.out.println("¿A que unidad los quieres convertir?");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.print("Elige una opcion (1 o 2): ");
        opcion = lector.nextInt();

        // utilizo el switch para hacer la conversion que eligio el usuario
        switch (opcion) {
            case 1:
                // Formula de Celsius a Fahrenheit: (C * 9/5) + 32
                resultado = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " grados Celsius son " + resultado + " Fahrenheit.");
                break; // Para que no se pase al siguiente caso

            case 2:
                // Formula de Celsius a Kelvin: C + 273.15
                resultado = celsius + 273.15;
                System.out.println(celsius + " grados Celsius son " + resultado + " Kelvin.");
                break;

            default:
                // Por si el usuario no presiona ni 1 ni 2
                System.out.println("Esa opcion no existe. Intenta de nuevo.");
                break;
        }

        System.out.println("-----------------------------------");
        
        // Cerramos el lector
        lector.close();
    }
}