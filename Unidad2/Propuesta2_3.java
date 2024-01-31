package Unidad2;

import java.util.Scanner;

public class Propuesta2_3 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese el primer numero enterp");
        int x= sn.nextInt();

        System.out.println("Ingrese el segundo numero entero");
        int y= sn.nextInt();

        boolean cierto= x==y || x==0 || y==0;
        System.out.println(cierto);
    }
}
