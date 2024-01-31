package Unidad2;

import java.util.Scanner;

public class Propuesta2_2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese un numero tipo (int)");
        int n= sn.nextInt();

        boolean positivo = n>=0;
       // (n>=0)
         //   System.out.println("El numero es positivo");}
        // {System.out.println("El numero es negativo");}

       System.out.println("El numero es positivo " + positivo);

    }
}
