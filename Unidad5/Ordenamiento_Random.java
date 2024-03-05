package Unidad5;

import java.util.Arrays;

public class Ordenamiento_Random {
    public static void main(String[] args) {
        //ordenamos un Array, se modifica el array
        //se ordena de forma creciente
        //los datos pueden ser primitivos (numericos)
        int[]numeros={5,8,7,1,3,9,15};
        //la funcion para ordenar es Arrats.sort(nombreDelArray)

        Arrays.sort(numeros);//El array se modifica y se ordena
        System.out.println(Arrays.toString(numeros));

        //ordenar tipo no primitivos (String)
        String nombres[]={"Maria","Ana","Xionara","Beatriz","arancha"};
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));

    }

}
