package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBidimensional {
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
        solicitarNum();
        System.out.println(Arrays.deepToString(solicitarNum()));


    }


    public static int[][] solicitarNum(){
        int numeros[][]=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("ingrese el numero de la fila "+i+" Y la comuna "+j);
                numeros[i][j]=sn.nextInt();
            }
        }
        return numeros;
    }


}
