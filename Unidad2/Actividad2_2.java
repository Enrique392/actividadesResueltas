package Unidad2;

import java.util.Scanner;

public class Actividad2_2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int x= sn.nextInt();

        System.out.println("Ingrese otro numero entero");
        int y= sn.nextInt();

        if (x==y){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("Los numeros son diferentes");
        }
    }
}
