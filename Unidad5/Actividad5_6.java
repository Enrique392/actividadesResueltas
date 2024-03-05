package Unidad5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Actividad5_6 {
    public static void main(String[] args) {
        int numero;
        int combinacionGanadora[]=new int[6];
        for (int i=0;i<6;i++){
            numero=(int)(Math.random()*49+1);
                int indice=0;
                while (indice<combinacionGanadora.length && combinacionGanadora[indice]!=numero){
                    indice++;
                }
                if (indice>=combinacionGanadora.length){
                    combinacionGanadora[i]=numero;
                }else{
                    i--;
                }
        }



        Scanner sn=new Scanner(System.in);

        System.out.println("- indica tu apuesta -");
        int apuesta[]=new int[6];
        for (int i=0;i< apuesta.length;i++){
            System.out.print("Numero "+(i+1)+"->");
            apuesta[i]=sn.nextInt();
        }
        System.out.println("\nTu apuesta ->"+Arrays.toString(apuesta)+"\n");

        System.out.println("Los numeros ganadores ->"+Arrays.toString(combinacionGanadora)+"\n");

        System.out.println("Numero de Aciertos en tu Apuesta ->"+primitiva(apuesta,combinacionGanadora)+"\n");
    }
    public static int primitiva(int apuesta[],int ganadora[]){
    int aciertos=0;
    Arrays.sort(apuesta);
    Arrays.sort(ganadora);
    for (int ele:apuesta){
        if (Arrays.binarySearch(ganadora,ele)>=0){
        aciertos++;
        }
    }
        return aciertos;
   }


}
