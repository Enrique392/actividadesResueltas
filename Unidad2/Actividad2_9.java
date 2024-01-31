package Unidad2;

import java.util.Scanner;

public class Actividad2_9 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n;

        System.out.println("Introduzca un digitp menor a 99999 ->");
        n= sn.nextInt();

        if (n<10){
                System.out.println("El numero contiene 1 cifra");
            }else
            {if (n<100){
                System.out.println("El numero contiene 2 cifras");
            }else
            {if (n<1000){
                System.out.println("El numero contiene 3 cifras");
            }else{if (n<10000){
                System.out.println("El numero contiene 4 cifras");
            }else{if (n<100000){
                System.out.println("El numero contiene 5 cifras");}else{if (n>=100000){
            System.err.println("EL numero sobrepasa lo solicitado");}}}}}}


    }
}