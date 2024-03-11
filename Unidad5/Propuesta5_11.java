package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

//Realiza la función: int[] buscarTodos(int t[], int clave), que crea y devuelve una tabla con
// todos los índices de los elementos donde se encuentra la clave de búsqueda.
// En el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
public class Propuesta5_11 {
    static Scanner sn=new Scanner(System.in);

    public static void main(String[] args) {
        crearTabla();

    }

    public static int[]crearTabla(){
        System.out.println("indique la cantidad de elementos a insertar");
        int l= sn.nextInt(); //le preguntamos y asignamos la longitud de la tabla
        int tabla[]=new int[l];// el array tendra la longuitud indicada, mas personalizable
        for (int i = 0; i < tabla.length; i++) {//recorremos la tabla para añadir los datos
            System.out.println("Indique el elemento "+(i+1)+ "->");
            tabla[i]= sn.nextInt();
        }
        buscarIndice(tabla);
        return tabla;

    }
//Metodo que busca en la tabla el valor que se solicita y guarda el resultado en otra tabla
    public static int[]buscarIndice(int[] tabla){
        int aux[]=new int[0];
        System.out.println("Indique el numero a buscar");
        int buscar= sn.nextInt();
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i]==buscar){
                aux= Arrays.copyOf(aux,aux.length+1);
                aux[aux.length-1]=i;
            }

        }
        if (aux.length!=0){
            System.out.println("Numero repetido se encontro en el indide ->");
            System.out.print(Arrays.toString(aux));
        }else {
            System.out.println("El numero no se repite\nHello world");
        }
        return aux;
    }

}
