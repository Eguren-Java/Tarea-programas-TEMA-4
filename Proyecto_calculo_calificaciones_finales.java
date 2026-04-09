import java.util.Scanner; // Leer datos

public class Proyecto_calculo_calificaciones_finales {

    public static void main(String[] args) {
        //  Crear lector
        Scanner lector = new Scanner(System.in);

        // Definimos las variables para decimales
        double parciales, proyecto, examenFinal, promedio;

        System.out.println("--- CALCULADORA DE NOTAS (Tarea 1) ---");

        //  Pedir las tres calificaciones
        System.out.print("Introduce la nota de Parciales: ");
        parciales = lector.nextDouble();

        System.out.print("Introduce la nota del Proyecto: ");
        proyecto = lector.nextDouble();

        System.out.print("Introduce la nota del Examen Final: ");
        examenFinal = lector.nextDouble();

        //  Validar que las notas sean reales (entre 0 y 100)
        if (parciales >= 0 && parciales <= 100 && proyecto >= 0 && proyecto <= 100 && examenFinal >= 0 && examenFinal <= 100) {
            
            // Calcular usando los porcentajes de la hoja (40%, 30%, 30%)
            // Multiplicamos por 0.40 para el 40% y 0.30 para el 30%
            promedio = (parciales * 0.40) + (proyecto * 0.30) + (examenFinal * 0.30);

            System.out.println("---------------------------------------");
            System.out.println("Tu promedio final es de: " + promedio);

            // Condición para saber si pasamos la materia
            if (promedio >= 70) {
                System.out.println("Estado: APROBADO :)");
            } else {
                System.out.println("Estado: REPROBADO (animo hay que mejorar :) )");
            }

        } else {
            // Si el usuario se equivoca y pone una nota mayor a 100
            System.out.println("Error: Ingresaste una nota invalida. Deben ser de 0 a 100 :( ).");
        }

        lector.close(); // 
    }
}