package unidad1;

/**
 * Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que
 * influirán en esta decisión: si está lloviendo y si hemos terminado nuestras tareas.
 * Solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas.
 * Exixtse una opción en la que, indistivamente de lo anterior, podremos salir a al calle:
 * el hecho de que tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro, etc.)
 * Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita
 * ir a la biblioteca. El algoritmo debe mostrar mediante un booleano (true o false) si es posible
 * que se le otorgue permiso para ir a la calle
 *
 */

import java.util.Scanner;

public class Actividad1_10 {
    public static void main(String[] args) {
        boolean llueve, tareas, biblioteca;
        Scanner sn=new Scanner(System.in);
        System.out.println("¿Esta lloviendo? (True/false)");
        llueve = sn.nextBoolean();
        System.out.println("Terminaste las tareas (true/false)");
        tareas = sn.nextBoolean();
        System.out.println("Tienes que ir a la biblioteca (true/false");
        biblioteca = sn.nextBoolean();
boolean salir = !llueve && tareas || biblioteca;
        System.out.println("puedes salir: " + salir);
    }
}
