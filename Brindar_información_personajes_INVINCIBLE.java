import java.util.Scanner;

public class Brindar_información_personajes_INVINCIBLE {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Imprimo el menu para que el usuario no adivine
        System.out.println("=== INFO DE PERSONAJES INVINCIBLE ===");
        System.out.println("Opciones: Mark, Nolan, Eve, Allen, Robot");
        System.out.print("¿De quien quieres saber?: ");
        
        // Lo paso a minusculas para no tener problemas con las mayusculas
        String nombre = sc.nextLine().toLowerCase();

        System.out.println("---");

        switch (nombre) {
            case "mark":
            case "invincible":
                System.out.println("Es el hijo de Omni-Man. Se da cuenta que ser un heroe ");
                System.out.println("no es tan facil como en los comics y siempre acaba herido.");
                break;

            case "nolan":
            case "omni-man":
                System.out.println("Viene del planeta Viltrum. Al principio crees que es ");
                System.out.println("como Superman, pero en realidad es un conquistador.");
                break;

            case "eve":
                System.out.println("Atom Eve. Puede cambiar la estructura de las cosas.");
                System.out.println("Es super poderosa pero prefiere usar su poder para el bien.");
                break;

            case "allen":
                System.out.println("Un alienigena que viaja por el espacio. Es el primer amigo");
                System.out.println("espacial de Mark y es bastante gracioso.");
                break;

            case "robot":
                System.out.println("Es el lider de los Guardianes .");
                System.out.println("Es super inteligente pero esconde muchos secretos tras su armadura.");
                break;

            default:
                System.out.println("Ese no lo tengo, intenta con uno de la lista de arriba.");
                break;
        }

        System.out.println("---");
        sc.close(); // Cerrar el scanner
    }
}