package Unidad2;

import java.util.Scanner;

public class Aplicacion2_15 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        double b,a,base;

        System.out.println("ingrese la base del triangulo ");
        b= sn.nextDouble();

        System.out.println("Ingrese la altura del triangulo");
        a= sn.nextDouble();
        base=b*a/2;

        if (b*a<=0) {
            System.out.println("Alguno de los valores introducidos es invalido");
        }else {
            System.out.println("El area del triangulo es de "+ base);
        }



    }
}
