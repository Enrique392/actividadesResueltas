package unidad3;

import java.util.Scanner;

public class Actividad3_9 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n,m;

        System.out.println("¿Que tabla de multiplicar quiere saber?");
        n= sn.nextInt();
        m=n;

        do {n+=m;
            System.out.println(n);
        }while (100>n && n>0);

    }
}
