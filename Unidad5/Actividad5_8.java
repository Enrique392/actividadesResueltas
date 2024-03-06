package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Actividad5_8 {

    static int[] n=new int[0];
    static int[] pares=new int[0];
    static int[] impares=new int[0];


    public static void main(String[] args) {
        Scanner sn = new Scanner(in);
        int cantidad;

        System.out.println("Ingrese la cantidad de numeros positivos como quiera ingresar");
        cantidad= sn.nextInt();
        n=Arrays.copyOf(n,n.length+cantidad);

        System.out.println("Ingrese tantos numeros positivos como quiera");
        for (int i = 0; i < cantidad; i++) {
            n[i]= sn.nextInt();
        }


        System.out.println("Estos son sus numeros\n"+ Arrays.toString(n)+"\nA continuacion se dividiarn lo numeros que ingreso en 2 grupos:\nPares e impares");

    }

//    public static void separar(int[]n){
//        for (int i = 0; i < n.length; i++) {
//            for (int elemento:n){
//                if (n[i]%2==0){
//                    pares=Arrays.copyOf(pares,pares.length+1);
//                    pares+=n[i];
//                }
//        }
//
//        }
//    }




}
