package unidad3;

import java.util.Scanner;

public class Actividad3_3 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n;
        int x= (int) (Math.random()*99+1);

        System.out.println("Bienvenido al juego el numero secreto");
        System.out.println("El juego consiste en adivinar el numero del 1 al 99");

        System.out.println("Ingrese su numero");
        n= sn.nextInt();

        while (n != x && n!=-1){
            if (n<x){
            System.out.println("Su numero es el menor");
        }else{if (n>x){
                System.out.println("Su numero es mayor");
            }else
            //{if (n==x){
                System.out.println("Su numero es el correcto");
            }
            System.out.println("ingrese su siguiente intento");
            n = sn.nextInt();
        }
        System.out.println("Su numero es el correcto");

        }


    }

