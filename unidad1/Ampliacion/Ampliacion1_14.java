package unidad1.Ampliacion;

import java.util.Scanner;

/**
 * Crea un programa que pida la base y la altura de un
 * triangulo y muestre su área.
 */

public class Ampliacion1_14 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo");
        int base = sn.nextInt();

        System.out.println("ingrese la altura deñ triangulo");
        int altura = sn.nextInt();

        int area= base*altura/2;

        System.out.println("El area del triangulo es " + area);




    }
}
