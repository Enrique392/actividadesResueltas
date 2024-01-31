package unidad1.Ampliacion;

import java.util.Scanner;

public class Ampliacion1_15 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Dado el polinomio y=ax^2+bx+c, rellene los datos");

        System.out.println("a equivale:");
        int a = sn.nextInt();

        System.out.println("b equivale:");
        int b = sn.nextInt();

        System.out.println("c equivale:");
        int c = sn.nextInt();

        System.out.println("x equivale:");
        int x = sn.nextInt();

        double y = (a*Math.pow(x,2)+b*x+c);
        System.out.println("y equivale a "+ y);
    }
}
