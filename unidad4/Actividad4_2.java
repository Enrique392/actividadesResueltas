package unidad4;

import java.util.Scanner;

public class Actividad4_2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int a,b;

        System.out.println("Ingrese un numero");
        a= sn.nextInt();

        System.out.println("Ingrese otro numero");
        b= sn.nextInt();

        numeros(a,b);

    }

    public static void numeros(int x, int y){
        int mayor=0,menor=0;
        if (y<x){
            mayor=x;
            menor=y;
        }else{
            mayor=y;
            menor=x;
        }
        System.out.println("\n");
        do {
            System.out.print(menor);
            if (menor!=mayor){
                System.out.print("-");
            }
            menor++;
        }while(menor<=mayor);






    }
}
