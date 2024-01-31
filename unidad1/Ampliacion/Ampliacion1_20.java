package unidad1.Ampliacion;

import java.util.Scanner;

/**
 * Solicita al usuario un número real y calcula su raíz cuadrada.
 * Implementa el programa uti-lizando el nombre cualificado de las clases,
 * en lugar de utilizar ninguna importación.
 */
public class Ampliacion1_20 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingresa un numero real");
        double n= sn.nextDouble();

        double raiz=(Math.sqrt(n));

        System.out.println("La raiz cuadrada del numero solicitado es "+raiz);

    }
}
