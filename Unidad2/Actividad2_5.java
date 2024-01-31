package Unidad2;

import java.util.Scanner;

public class Actividad2_5 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int x = sn.nextInt();

        System.out.println("Ingrese un segundo numero");
        int y= sn.nextInt();

        if (x>y){
            System.out.println(x+","+y);
        }else{System.out.println(y+","+x);}
    }
}
