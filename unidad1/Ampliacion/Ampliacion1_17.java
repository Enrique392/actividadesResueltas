package unidad1.Ampliacion;

import java.util.Scanner;

/**
 * Solicita al usuario tres distancias:  La primera, medida en milímetros.
 * La segunda, medida en centímetros.  La última, medida en metros.
 * Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
 */

public class Ampliacion1_17 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese una medida en milimetros");
        int mm = sn.nextInt();

        System.out.println("Ingrese una medida en centimetros");
        int cm = sn.nextInt();

        System.out.println("ingrese una medida en metros");
        int m = sn.nextInt();

        int cm1 = mm/10;
        int cm2 = m*100;
        int cm3 = cm1 + cm2 + cm;

        System.out.println("La longitud total de las 3 medidas equivale a "+ cm3+"cm");
    }
}
