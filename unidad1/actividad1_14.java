package unidad1;

import java.util.Scanner;

/**
 * Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al entero más próximo.
 */

public class actividad1_14 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        double n = sn.nextDouble();

        int redondeado = (int) Math.round(n);
        System.out.println("El numero redondeado seria: " + redondeado);
    }
}
