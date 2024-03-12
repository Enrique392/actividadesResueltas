package Unidad5;

import javax.management.openmbean.InvalidOpenTypeException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Propuesta5_15 {
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
    //    crearTabla();
        int[][] tabla=crearTabla();
        medias(tabla);
        mostrar(tabla);


    }

    public static int[][] crearTabla(){
        int[][]notas=new int[3][5];
        for (int trimestre=0;trimestre<3;trimestre++){
            System.out.print("Notas del trimestre "+(trimestre+1)+" ->\n");
            leerNOtas(notas,trimestre);

        }
        System.out.println(Arrays.deepToString(notas));
            return notas;
    }

    public static void leerNOtas(int[][]notas,int trimestre){
        for (int i = 0; i < notas[trimestre].length; i++) {
            System.out.print("Alumno ("+(i+1)+")");
            notas[trimestre][i]= sn.nextInt();
        }

    }

    public static void medias(int[][] notas){
        double[]media=new double[3];
        for (int alum=0;alum <5;alum++){
            for (int trim = 0; trim < 3; trim++) {
                media[trim]+=notas[trim][alum];
            }
        }
        System.out.println("la media del primer trimestre = "+(media[0]/5));
        System.out.println("la media del primer trimestre = "+(media[1]/5));
        System.out.println("la media del primer trimestre = "+(media[2]/5));
    }


    public static void mostrar(int[][]notas){
        double suma=0;
        int p;
        System.out.println("indique el numero del alumno del cual desea ver la posicion");
        p= sn.nextInt();

        for (int i = 0; i < 3; i++) {
            suma+=notas[i][p-1];

        }
        System.out.println("El promedio del alumno "+p+" es de ->"+(suma/3));

    }




}
