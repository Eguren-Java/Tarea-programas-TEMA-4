import java.util.Scanner;

public class Cálculo_de_precio_con_descuento {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        // Uso "double" por si el precio tiene centavos
        double precioOriginal, descuento, precioFinal;

        System.out.println("--- Calculadora de Descuentos ---");
        
        System.out.print("¿Cuanto cuesta el producto?: ");
        precioOriginal = lector.nextDouble();

        // Aqui empiezo a revisar que descuento le toca segun el precio
        if (precioOriginal <= 100) {
            // Si cuesta 100 o menos, no le bajan nada
            descuento = 0;
        } 
        else if (precioOriginal > 100 && precioOriginal <= 200) {
            // Entre 100 y 200 le quitan el 10%
            descuento = precioOriginal * 0.10;
        } 
        else if (precioOriginal > 200 && precioOriginal <= 500) {
            // De 200 a 500 le toca el 20%
            descuento = precioOriginal * 0.20;
        } 
        else {
            // Si es mas caro de 500, le dan el descuento mas alto (25%)
            descuento = precioOriginal * 0.25;
        }

        // Ya que se cuanto es el descuento, se lo resto al precio normal
        precioFinal = precioOriginal - descuento;

        // Imprimo todo el desglose en la pantalla
        System.out.println("----------------------------------------");
        System.out.println("Precio normal: " + precioOriginal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + precioFinal);
        System.out.println("----------------------------------------");

        // Ya termine, cierro el lector
        lector.close();
    }
}