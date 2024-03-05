package Unidad5;
//rellenar una tabla con un numero aleatorio en el rango de 2 hasta fin,
// retornando la tabla ordenada

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_5 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        mostrarSin("Indica la longitud de la tabla->");
        int longitud= sn.nextInt();

        mostrarSin("Indica el numero fin de los numeros aleatorios->");
        int fin= sn.nextInt();

        int pares[]=new int[longitud];
        for (int i=0;i< pares.length;i++){
            int num=(int) (Math.random()*fin+1);
            if (num%2==0){
                pares[i]=num;
            }else {
                i--;
            }
        }
        System.out.println(Arrays.toString(pares));

    }
    public static void mostrar(String texto){
        System.out.println("\t" +texto );
    }
    public static void mostrarSin(String texto){
        System.out.print("\t"+texto);
    }
}
