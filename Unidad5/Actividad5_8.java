package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Actividad5_8 {

    static int[] n=new int[0];
    static int[] pares=new int[0];
    static int[] impares=new int[0];
    static Scanner sn = new Scanner(in);

    public static void main(String[] args) {
        datos();
        separar(n);
        fin(pares,impares);
        }


    public static void datos(){
        int cantidad;
        System.out.println("Ingrese la cantidad de numeros positivos como quiera ingresar");
        cantidad= sn.nextInt();
        n=Arrays.copyOf(n,n.length+cantidad);

        System.out.println("Ingrese tantos numeros positivos como quiera");
        for (int i = 0; i < cantidad; i++) {
          //  System.out.print(" ");
            n[i]= sn.nextInt();
        }
        System.out.println("Estos son sus numeros\n"+ Arrays.toString(n)+"\nA continuacion se dividiarn lo numeros que ingreso en 2 grupos:\nPares e impares");
    }

    public static void separar(int[]n){ //me estaba dando problemas puesto que no sumaba los i y hacia que se repitieran,
        // por eso el i++, mejorarble para Enrique del futuro. Extra irina arreglo el codigo LOL


        for (int i = 0; i < n.length; i++) {
                if (n[i]%2==0){
                    pares=Arrays.copyOf(pares,pares.length+1);
                    pares[pares.length-1]=n[i];
                }else{
                    impares=Arrays.copyOf(impares,impares.length+1);
                    impares[impares.length-1]=n[i];
                }
        }
    }

    static void fin(int []pares, int[]impares) {
        System.out.println("La cantidad de pares son " + pares.length);
        System.out.println("los pares son " + Arrays.toString(pares) + "\n");

        System.out.println("La cantidad de impares son " + impares.length);
        System.out.println("los pares son " + Arrays.toString(impares) + "\n");
    }

}
