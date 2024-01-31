package Unidad2;

import java.util.Scanner;

public class Propuesta2_4 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int multiplo = sn.nextInt();

        System.out.println("Ingrese un segundo numero");
        int n = sn.nextInt();

        boolean cierto = multiplo%n==0;

        System.out.println(multiplo +" es multiplo de "+ n +" "+ cierto);

    }
}
