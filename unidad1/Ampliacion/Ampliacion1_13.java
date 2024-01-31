package unidad1.Ampliacion;

import java.util.Scanner;

public class Ampliacion1_13 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int n = sn.nextInt();

        System.out.println("Ingrese un segudo numero entero");
        int m = sn.nextInt();

        int prox = m - n % m;
        System.out.println(n + " le falta " + prox + " para ser nultiple de " + m);
    }
}
