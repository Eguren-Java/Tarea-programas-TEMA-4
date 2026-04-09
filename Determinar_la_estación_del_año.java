import java.util.Scanner;

public class Determinar_la_estación_del_año {

    public static void main(String[] args) {
        // Abrir lector  para los datos
        Scanner lector = new Scanner(System.in);

        // Variable para guardar el numero del mes
        int mes;

        System.out.println("--- Buscador de Estaciones del Año ---");
        
        System.out.print("Escribe el numero de mes (del 1 al 12): ");
        mes = lector.nextInt();

        // Aqui empiezo a usar el switch como pide la tarea
        switch (mes) {
            // Caso 12, 1 y 2 son los meses de frio
            case 12:
            case 1:
            case 2:
                System.out.println("La estacion es: Invierno");
                break; // Este break es para que ya no siga revisando los demas

            // Meses de las flores
            case 3:
            case 4:
            case 5:
                System.out.println("La estacion es: Primavera");
                break;

            // Meses de calor
            case 6:
            case 7:
            case 8:
                System.out.println("La estacion es: Verano");
                break;

            // Meses de viento
            case 9:
            case 10:
            case 11:
                System.out.println("La estacion es: Otoño");
                break;

            // Por si el usuario pone un numero que no existe como el 15
            default:
                System.out.println("Ese mes no existe, pon uno del 1 al 12.");
                break;
        }

        System.out.println("---------------------------------------");
        
        // Cierro el lector al terminar
        lector.close();
    }
}