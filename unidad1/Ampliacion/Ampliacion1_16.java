package unidad1.Ampliacion;

import java.util.Scanner;

/**
 * Diseña una aplicación que solicite al usuario que introduzca
 * una cantidad de segundos. La aplicación debe mostrar cuántas horas,
 * minutos y segundos hay en el número de segundos introducidos por el
 * usuario
 */

public class Ampliacion1_16 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese una cantidad de segundos");
        int s = sn.nextInt();

        int m=s/60;
        int h = m>=60 ? m/60 : m*0;
        int se = s%60;
        int mS = m>=60 ? m-60*h : m*1;

        System.out.println("En la cantidad dada hay un total de "+h+" horas y "+mS+" minutos con "+se+ " segundos");

    }
}
