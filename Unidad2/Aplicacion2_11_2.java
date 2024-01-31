package Unidad2;

import java.util.Scanner;

public class Aplicacion2_11_2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int r = 1,d=0;

        System.out.println("ingrese un numero entre 0 y 9999");
        int n= sn.nextInt();

        // Un digito
        if (n>=0 && n<10){
           System.out.println("si es capicua");
        }

        // 3 digitos
        if (n>100 && n<1000) {r=n%10;}{d=n/100;}
        if (d==r){System.out.println("Si es capicua");}

        // 2 digitos
        if (n>=10 && n<100){r=n%11;}{
        if (r==0) {
            System.out.println("Si es capicua");
        }else{
            System.out.println("No es capicua");
        }}

        //4 digitos
        if (n>999 && n<10000){r=n%11;}{
        if (r==0) {
            System.out.println("Si es capicua");
        }else{
            System.out.println("No es capicua");
        }}



       // if (n<10) {
          //  System.out.println("si es ");
        //}else{if (n<100){r=n%11;}if (r==0){
          //  System.out.println("si es ");
        //}else{
          //  System.out.println("no es ");
        //}}
            //{ if (n>99 && n<1000){}}
    }
}
