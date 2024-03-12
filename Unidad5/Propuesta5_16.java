package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Propuesta5_16 {
    static Scanner sn=new Scanner(System.in);
    static int [][]tablero=new int[10][10];
    public static void main(String[] args) {

        crearTablero();
        System.out.println(Arrays.deepToString(tablero));
    }


    public static void crearTablero(){
        int n=0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                n++;
                tablero[i][j]+=n;
            }
        }


    }

    public static void datos(){
        System.out.println("El tablero cuenta con 100 casillas");

        System.out.println("indique el primer lugar (x)");
        byte x= sn.nextByte();

        System.out.println("indique el segundo lugar (y)");
        byte y= sn.nextByte();





    }


}


