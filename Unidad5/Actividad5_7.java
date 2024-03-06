package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Actividad5_7 {
    public static void main(String[] args) {

    }

    public static int[] sinRepetir(int t[]){
        int [] apropiada=new int[0];
        for (int elemento:t){
            if (Arrays.binarySearch(t,elemento)==-1){
                apropiada=Arrays.copyOf(apropiada,apropiada.length+1);
                apropiada[apropiada.length-1]=elemento;
            }
        }
        return apropiada;
    }



    public static int[]crearArray(){
        Scanner sn = new Scanner(in);
        System.out.println("Indique la longuitud de la tabla->");
        int longitud= sn.nextInt();
        int tabla[]=new int[longitud];
        for (int i = 0; i < longitud; i++) {
            tabla[i]=(int)(Math.random()*20+1);
        }
        return tabla;
    }


    public static void buscarDuplicados(int tabla[]){
    int duplicados[]=new int[0];
        for (int i = 0; i < tabla.length; i++) {
            if (!buscar(duplicados,tabla[i])){
                duplicados=Arrays.copyOf(duplicados,duplicados.length+1);
                duplicados[duplicados.length-1]=tabla[i];

            }

        }

    }





    public static boolean buscar(int tabla[],int numero){
        boolean existe=false;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i]==numero){
                existe=true;
            }
        }
        return existe;
    }


}
