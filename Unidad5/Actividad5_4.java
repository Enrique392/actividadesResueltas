package Unidad5;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_4 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        mostrar("Indique la cantidad de numeros que quiere ingresar");
        int cantidad= sn.nextInt();

        int[] numeros=new int[cantidad];

        for (int i=0;i<cantidad;i++){
            mostrar("Indique el valor Nº"+(i+1));
            numeros[i]= sn.nextInt();
        }

        System.out.println(Arrays.toString(numeros));
        mostrar("El valor maximo insertado es ->"+maximo(numeros));




    }
    public static void mostrar(String texto){
        System.out.println("\n"+texto);
    }

    public static int maximo(int t[]){//podemos pasar de arrays por parametros a una funcion
        int max=t[0]; //asumimos que al menos hay un elemento
        for (int elemento:t){//recoremos el array pasadp por el parametrp
            if (elemento>max){//validamos cada elemento y comparamos con el maximo
                max=elemento;
            }
        }
        return max;
    }



}



