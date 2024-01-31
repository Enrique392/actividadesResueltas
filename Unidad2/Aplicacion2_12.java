package Unidad2;

import java.util.Scanner;

public class Aplicacion2_12 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int resto,n;

        System.out.println("ingrese su DNI/NIE (8 Digitos)");
        n= sn.nextInt();
        resto=n%23;

        switch (resto){
            case 0 -> {System.out.println("Su letra corresponde a T");}
            case 1-> {System.out.println("Su letra corresponde a R");}
            case 2 -> {System.out.println("Su letra corresponde a W");}
            case 3 -> {System.out.println("Su letra corresponde a A");}
            case 4 -> {System.out.println("Su letra corresponde a G");}
            case 5 -> {System.out.println("Su letra corresponde a M");}
            case 6 -> {System.out.println("Su letra corresponde a Y");}
            case 7 -> {System.out.println("Su letra corresponde a F");}
            case 8 -> {System.out.println("Su letra corresponde a P");}
            case 9 -> {System.out.println("Su letra corresponde a D");}
            case 10 -> {System.out.println("Su letra corresponde a X");}
            case 11 -> {System.out.println("Su letra corresponde a B");}
            case 12 -> {System.out.println("Su letra corresponde a N");}
            case 13 -> {System.out.println("Su letra corresponde a J");}
            case 14 -> {System.out.println("Su letra corresponde a Z");}
            case 15 -> {System.out.println("Su letra corresponde a S");}
            case 16 -> {System.out.println("Su letra corresponde a Q");}
            case 17 -> {System.out.println("Su letra corresponde a V");}
            case 18 -> {System.out.println("Su letra corresponde a H");}
            case 19 -> {System.out.println("Su letra corresponde a L");}
            case 20 -> {System.out.println("Su letra corresponde a C");}
            case 21 -> {System.out.println("Su letra corresponde a K");}
            case 22 -> {System.out.println("Su letra corresponde a E");}
            default -> System.err.println("Error");



        }

    }
}
