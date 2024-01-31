package unidad3;

import java.util.Scanner;

public class Actividad3_1 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        double n=0,cuadrado,par,positivo;

        System.out.println("ingresa un numero");
        n= sn.nextInt();


        while (n!=0){
            cuadrado=Math.sqrt(n);
            par=n%2;
            if (par==0) {System.out.println("El numero es par");}else{
               System.out.println("El numero es impar");
           }
           if (n>0){
               System.out.println("El numero es positivo");
           }else{
               System.out.println("el numero es negativo");
           }
            System.out.println("La raiz cuadrada es-> "+cuadrado);

            System.out.println("Ingrese el siguiente numero");
            n= sn.nextInt();


        }


    }
}
