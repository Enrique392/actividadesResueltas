package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Propuesta5_16_2 {
    static Scanner sn=new Scanner(System.in);
    static int [][]tablero=new int[5][5];
    public static void main(String[] args) {
       partida();

        System.out.println("Continuar jugando? 1->Si |2->No");
        int next = sn.nextInt();
        if (next==1){
            partida();
        }

    }
     public static void partida() {

         boolean mapa[][] = {
                 {true, false, true, false, true},
                 {false, true, false, true, false},
                 {true, false, true, false, true},
                 {false, true, false, true, false},
                 {true, false, true, false, true},
         };
         for (int i = 0; i < mapa.length; i++) {
             for (int j = 0; j < mapa[i].length; j++) {
                 System.out.print("y=" + i + " | x=" + j + "\t");
             }
             System.out.println(" ");

         }
         int x, y;
         System.out.println(" ");
         do {
             System.out.println("indique la posicion Y de la tabla: ");
             y = sn.nextInt();

             System.out.println("Indique la posicion X de la tabla: ");
             x = sn.nextInt();

         } while (y > 4 || y < 0 || x > 4 || x < 0);

         int contador = 0, puntos = 0;
         for (int i = 0; i < mapa.length; i++) {
             for (int j = 0; j < mapa[i].length; j++) {
                 contador++;
                 if (i == y && j == x) {
                     System.out.println("El resulado es ->" + mapa[i][j]);
                     System.out.println("ha recorrido " + contador + "casillas");
                     if (mapa[i][j]) {
                         puntos++;
                     }
                     System.out.println("Puntos->" + puntos);
                     //break;

                 }//else System.out.println("Game over, goodbye World");

             }
         }
         if (puntos==0) System.out.println("Game over\nGoodbye World");
     }
    }




