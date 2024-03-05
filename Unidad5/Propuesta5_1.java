package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

//crea cinco elementos
//Enteros, doubles y booleanos
//Mostrarlos-> usa una funcion
public class Propuesta5_1 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int cantidad;

        mostrar("Ingrese la cantidad de alumnos ");
        cantidad= sn.nextInt();

        String[]nombre=new String[cantidad];
        int[] edades=new int[cantidad];
        double[]notas=new double[cantidad];
        boolean[]aprobados=new boolean[cantidad];



        for (int i=0;i<cantidad;i++){

            mostrar("Ingrese el nombre del alumno Nº "+(i+1));
            nombre[i]= sn.next();

            mostrar("Ingrese la edad del alumno Nº "+(i+1));
            edades[i]= sn.nextInt();

            mostrar("Ingrese la nota del alumno Nº "+(i+1));
            notas[i]= sn.nextDouble();

            mostrar("Ingrese si el alumno aprobo\n 1. Si \n 2. No");
            byte x= sn.nextByte();

            if (x==1){
                aprobados[i]=true;
            } else if (x==2) {
                aprobados[i]=false;
            }else System.err.println("opcion no valida no valida");

        }

        System.out.println(Arrays.toString(nombre));
        System.out.println(Arrays.toString(edades));
        System.out.println(Arrays.toString(notas));
        System.out.println(Arrays.toString(aprobados));

    }

    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }
}
