package Unidad5;

import java.util.Arrays;

//Crear una tabla de 5x5 donde el elemento de la posicion [i][j]=10*i+j
//luego mostrarla de forma ordenada.
public class Actividad5_12 {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(operacion()));
    }

    public static int[][]operacion(){
        int num[][]=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j]=10*i+j;


            }
        }
        mostrarTabla(num);
        return num;
    }

    //recorrer un array bidimensional con foreach
    public static void mostrarTabla(int num[][]){
        for (int fila[]:num){
            for (int col:fila){
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }




}
