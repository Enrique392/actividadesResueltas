package Unidad2;

import java.util.Scanner;

public class Actividad2_6 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("ingrese un numero entero");
        int x= sn.nextInt();

        System.out.println("Ingrese un segundo numero");
        int y= sn.nextInt();

        if (x>y){
            System.out.println(x+" Es mayor que "+ y);
        }else{if (x<y){
            System.out.println(y+" Es mayor que "+x);

        }else{if (x==y)
            System.out.println(x+" es igual a "+y);
        }}


    }
}
