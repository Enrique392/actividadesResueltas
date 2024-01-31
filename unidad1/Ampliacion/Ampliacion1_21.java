package unidad1.Ampliacion;

import java.util.Scanner;

/**
 * Pide dos números al usuario: a y b.
 * Deberá mostrarse true si ambos números son igua-les y false en caso contrario.
 */

public class Ampliacion1_21 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese el primero numero");
        double x= sn.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double y= sn.nextDouble();

        boolean iguales= x==y;
        System.out.println("Ambos numeros son iguales "+iguales);

    }
}
