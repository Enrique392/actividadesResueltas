package Unidad5;

import java.util.Arrays;
import java.util.Scanner;


import static java.lang.System.in;


public class Actividad5_10 {
    static Scanner sn = new Scanner(in);
    static int can,max,per;
    static String []nombre=new String[0];
static int[] errores=new int[0];
    public static void main(String[] args) {
datos();
eliminar(errores,nombre,max);

    }

    public static void datos(){
        System.out.println("Ingrese la cantidad de personas que seran examinadas");
        can=sn.nextInt();

        errores=Arrays.copyOf(errores,errores.length+can);
        nombre=Arrays.copyOf(nombre,nombre.length+can);

        System.out.println("Ingrese el maximo de errores que puede tener cada persona");
        max= sn.nextInt();

        while (per<can){
            System.out.println("Ingrese el nombre de la persona nº "+(per+1));
            nombre[per]=sn.next();sn.nextLine();

        System.out.println("Ingrese los errores hechos por la persona Nº "+(per+1));
        errores[per]=sn.nextInt();
        per++;
        }

       // System.out.println(Arrays.toString(errores));
    }
    static void eliminar(int[] errores,String[] nombre, int max) {
        for (int i = 0; i < errores.length; i++) {
            if (errores[i] > max) {
                errores[i] = errores[errores.length - 1];
                errores = Arrays.copyOf(errores, errores.length - 1);
                nombre[i] = nombre[nombre.length - 1];
                nombre = Arrays.copyOf(nombre, nombre.length - 1);
                i=0;
            }
        }

aprobados(errores,nombre);

    }

    static void aprobados(int[] errores,String[] nombre){
         System.out.println("La lista de aprobados es");
        for (int i = 0; i < errores.length; i++) {
            System.out.println("\n"+nombre[i]+"\t"+errores[i]);
        }
    }


}
