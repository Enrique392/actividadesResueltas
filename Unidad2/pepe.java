package Unidad2;

import java.util.Scanner;

public class pepe {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int r,o;

        System.out.println("Numero");
        int n= sn.nextInt();

        o=n/100;
        r=n%10;
        if (o==r){
            System.out.println("Si lo es");}else{
            System.out.println("no lo es");
        }
        }
    }
