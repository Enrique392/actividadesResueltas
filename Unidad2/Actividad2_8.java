package Unidad2;

import java.util.Scanner;

public class Actividad2_8 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Inserte los valores para resolver la siguiente ecuacion ax2 + bx + c = 0");

        System.out.println("Ingrese el valor de a ");
        double a= sn.nextDouble();

        System.out.println("Ingrese el valor de b ");
        double b= sn.nextDouble();

        System.out.println("Ingrese el valor de c ");
        double c= sn.nextDouble();

        System.out.println("Ingrese el valor de x ");
        double x= sn.nextDouble();

        double d,x1=0,x2=0;
        d=(Math.pow(b,2)-4*a*c);
if (d>0){
        x1 = (-b + Math.sqrt(d)/(2*a));
        x2 = (-b - Math.sqrt(d)/(2*a));}else{
    System.err.println("Sint error");}

        System.out.println("La respuesta es "+ x1);
        System.out.println("La respuesta es "+ x2);

    }
}
