package unidad1;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

/**
 * Solicita al usuario que ingrese dos numeros enteros y luego la suma de
 * esos dos numeros con un mensaje "El resultado de la suma a + b es"
 */

public class Prueba3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a, b, c;
        System.out.println("Ingrese un numero entero");
        a = sn.nextInt();
        System.out.println("Ingrese otro numero entero");
        b = sn.nextInt();
        c = (a + b);
        System.out.println("El resultado de la suma de ambos numeros enteros es:" + c);

        //se puede ahorrar memoria usando solo la variable c //

        int cc;
        System.out.println("Ingrese un numero entero");
        cc = sn.nextInt();
        System.out.println("Ingrese otro numero entero");
        cc= cc + sn.nextInt();
        System.out.println("El resultado de la suma de ambos numeros enteros es:" + cc);



    }
}
