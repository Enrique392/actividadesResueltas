package Unidad2;

import java.util.Scanner;

public class Actividad2_12 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int d=0,m=0,a=0;


        System.out.println("Comprobaremos si la fecha indicada existe (solo usar numeros)");
        System.out.println("Indique un dia ->");
        d = sn.nextInt();

        System.out.println("Indique el mes");
        m = sn.nextInt();

        System.out.println("indique el año");
        a = sn.nextInt();

        if (d > 0 && d <= 31 && m > 0 && m <= 12 && a > 0) {
            switch (m) {
                case 1, 3, 5, 7, 8, 10, 12 -> {if (d<=31){
                    System.out.println("La fecha es verdadera");
                }else {
                    System.err.println("La fecha no existe");
                }}
                case 2 -> {if (d<=28){
                    System.out.println("La fecha es verdadera");
                }else {
                    System.err.println("La fecha no existe");
                }}
                case 4, 6, 9, 11 -> {if (d<=30){
                    System.out.println("La fecha es verdadera");
                }else {
                    System.err.println("La fecha no existe");
                }}
            }
            }else{
            System.err.println("La fecha no existe");
        }

    }}
