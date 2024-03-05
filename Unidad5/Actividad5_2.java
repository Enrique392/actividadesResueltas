package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_2 {
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


    }
    public static void mostrar(String texto){
        System.out.println("\n"+texto);
    }
}
