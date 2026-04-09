import java.util.Scanner;

public class Conversor_de_monedas {

    public static void main(String[] args) {
        // Lector para los datos
        Scanner entrada = new Scanner(System.in);

        // Variables para el dinero
        double pesosMexicanos, resultado;
        int opcion;

        System.out.println("--- Conversor de Pesos Mexicanos ---");
        
        // Pedir el dinero en pesos
        System.out.print("¿Cuantos pesos mexicanos quieres convertir?: ");
        pesosMexicanos = entrada.nextDouble();

        //  Menu de monedas
        System.out.println("Elige la moneda de destino:");
        System.out.println("1. Dolar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dolar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dolar Canadiense (CAD)");
        System.out.println("9. Bolivar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.print("Opcion seleccionada: ");
        opcion = entrada.nextInt();

        //  Switch para hacer la conversion segun la moneda
        switch (opcion) {
            case 1:
                resultado = pesosMexicanos * 0.059; // Ejemplo USD
                System.out.println("Resultado: " + resultado + " USD");
                break;
            case 2:
                resultado = pesosMexicanos * 0.054; // Ejemplo EUR
                System.out.println("Resultado: " + resultado + " EUR");
                break;
            case 3:
                resultado = pesosMexicanos * 2.14;  // Ejemplo THB
                System.out.println("Resultado: " + resultado + " THB");
                break;
            case 4:
                resultado = pesosMexicanos * 8.92;  // Ejemplo JPY
                System.out.println("Resultado: " + resultado + " JPY");
                break;
            case 5:
                resultado = pesosMexicanos * 79.85; // Ejemplo KRW
                System.out.println("Resultado: " + resultado + " KRW");
                break;
            case 6:
                resultado = pesosMexicanos * 0.090; // Ejemplo AUD
                System.out.println("Resultado: " + resultado + " AUD");
                break;
            case 7:
                resultado = pesosMexicanos * 0.22;  // Ejemplo PEN
                System.out.println("Resultado: " + resultado + " PEN");
                break;
            case 8:
                resultado = pesosMexicanos * 0.080; // Ejemplo CAD
                System.out.println("Resultado: " + resultado + " CAD");
                break;
            case 9:
                resultado = pesosMexicanos * 2.15;  // Ejemplo VES (Simulado)
                System.out.println("Resultado: " + resultado + " VES");
                break;
            case 10:
                resultado = pesosMexicanos * 50.80; // Ejemplo ARS (Simulado)
                System.out.println("Resultado: " + resultado + " ARS");
                break;
            default:
                // Por si eligen un numero fuera del 1-10
                System.out.println("Esa moneda no esta en la lista.");
                break;
        }

        System.out.println("-------------------------------------");
        
        // Cierro el lector
        entrada.close();
    }
}