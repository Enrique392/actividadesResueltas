package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

//Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los elementos
//contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo.
public class Propuesta5_12 {
    static Scanner sn=new Scanner(System.in);

    public static void main(String[] args) {

        int[]tabla=crearTabla();
        System.out.println("Tabla original\n"+Arrays.toString(tabla));
        System.out.println("Tabla desordenada\n"+Arrays.toString(desordenar(tabla)));

    }

    public static int[]crearTabla(){
        System.out.println("indique la cantidad de elementos a insertar");
        int l= sn.nextInt(); //le preguntamos y asignamos la longitud de la tabla
        int tabla[]=new int[l];// el array tendra la longuitud indicada, mas personalizable
        for (int i = 0; i < tabla.length; i++) {//recorremos la tabla para añadir los datos
            System.out.println("Indique el elemento "+(i+1)+ "->");
            tabla[i]= sn.nextInt();
        }
        Arrays.sort(tabla);
        return tabla;
    }
    //Metodo que desordena la tabla generada en el metodo anterior.
    //mediante un bucle de recorrido por toda la tabla.
    //valor1/valor2=Random con dos valores multiplicado por la longuitud de la tabla




    public static int[]desordenar(int[] tabla){
        for (int i = 0; i < tabla.length; i++) {
            int valor1=(int)(Math.random()* tabla.length);
            int valor2=(int)(Math.random()* tabla.length);
            int aux=tabla[valor1];
            tabla[valor1]=tabla[valor2];
            tabla[valor2]=aux;

        }
        return tabla;
    }


}
