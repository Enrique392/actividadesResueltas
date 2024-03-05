package Unidad5;

import org.w3c.dom.ranges.Range;

import java.lang.reflect.Array;
import java.util.Arrays;

//Crear una tabla de longitud 10 que se inicializará con números aleatorios comprendidos en-tre 1 y 100.
// Mostrar la suma de todos los números aleatorios que se guardan en la tabla
public class Actividad5_1 {
    public static void main(String[] args) {
        int[] numeros=new int[10];
        int suma=0;
        for (int i=0;i< numeros.length;i++){
            numeros[i]=(int)(Math.random()*100+1);
            suma+=numeros[i];
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("La suma de todos los elementos es-> " + suma);
        //salida interesante-> con foreach

        for (int elemento:numeros){
            System.out.print(elemento+"+");
        }
        System.out.println("="+suma);

        //Este sirve para rellenar un array, se puede dar un solo
        //valor o poner un rango (No se como hacerlo xd)
        double[] puntuacion=new double[10];
        Arrays.fill(puntuacion,10);
        System.out.println(Arrays.toString(puntuacion));

    }
}
