package Unidad2;

import java.util.Scanner;

public class Aplicacion2_11 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        boolean capicua=false;
        int num,u,d,c,um;

        System.out.println("indica un numero entero entre 0 y 9999");
        num= sn.nextInt();

        u=num%10;
        num/=10;
        d=num%10;
        num/=10;
        c=num%10;
        num/=10;
        um=num;

        if (um==u && d==c){
            capicua=true;
        }else if (um==0 && c==u){
            capicua=true;
        }else if (um==0 && c==0 && d==u){
            capicua=true;
        } else if (um==0 && c==0 && d==0){
            capicua=true;}

        if (capicua){
            System.out.println("El numero escrito es capicua");
        }else System.out.println("El numero escrito no es capicua");








    }
}
