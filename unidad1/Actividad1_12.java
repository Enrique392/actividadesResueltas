package unidad1;

import java.util.Scanner;

/**
 * Escribir un programa que pida un numero al usuario y muenstre su
 * valor aboluto
 */

public class Actividad1_12 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Ingresa un numero (positivo o negativo):");
        int n = sn.nextInt();
        int valorAbsoluto = n < 0 ? -1 * n : n;
        System.out.println("El valor absoluto de " + n + " " + "es " + valorAbsoluto);

    }
}
