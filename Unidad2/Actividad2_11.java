package Unidad2;

import java.util.Scanner;

public class Actividad2_11 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("ingrese un numero del 1 al 7 ->");
        int dia= sn.nextInt();

        switch (dia) {case 1: {
            System.out.println("El dia indicado es el lunes");
            break;}
            case 2: {
                System.out.println("El dia indicado es el martes");
                break;}
            case 3: {
                System.out.println("El dia indicado es el miercoles");
                break;}
            case 4: {
                System.out.println("El dia indicado es el jueves");
                break;}
            case 5: {
                System.out.println("El dia indicado es el viernes");
                break;}
            case 6: {
                System.out.println("El dia indicado es el sabado");
                break;}
            case 7: {
                System.out.println("El dia indicado es el domingo");
                break;}
            default: {
                System.err.println("El numero indicado no coincide con lo solicitado");}
    }
    }
}
