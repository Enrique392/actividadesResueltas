package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        //La declaracion de un array debe contenet 3 elementos
        //tipo de datos
        //nombre de la variable
        //la longitud
        int[] edad=new int[5]; //esta es la manera de declarar un array, en este caso cuenta con 5 espacios
        edad[0]=23;
        edad[1]=52;
        edad[2]=18;
        edad[3]=32;
        edad[4]=45;

        System.out.println(Arrays.toString(edad));
        //Ejemplo, solicitar con Scanner las edades...
        //Solicitamos primero cuantas edades voy a insertar

        mostrar("Indique el numero de edades a insertar");
        int longitud= sn.nextInt();//Aqui guardaremos la longuitud que tendra el array

        byte[] edades=new byte[longitud];//creamos el array con la longuitud leida
        //necesitamos preguntar las edades, para ello vamos a crear un bicle "for" sencillo para que
        //recorra las posiciones del array e inseerte los valores
        //Utilizamos la variable longitud para saber donde debe parar nuestro bucle
        for (int i=0;i<longitud;i++){
            mostrar("Indique la Edad N "+(i+1));
            edades[i]= sn.nextByte();
        }

        System.out.println(Arrays.toString(edades));
        //bucle foreach:bucle para recorrer tablas
        for (int ed:edades){//se declara una variable llamada elememto y que recorra el array
            mostrar("Edad insertada-> "+ed);

        }
        //Metodos de la API de Java sobre los arrays

        //Conocer la loguitud
        System.out.println("longitud del array edad-> "+edad.length);
        System.out.println("longitud del array edades-> "+edades.length);
        for (int i=0;i< edad.length;i++){
            mostrar("La edad insertada en la posicion" +(i+1)+ " es->"+edad[i]);
        }
        //Referencia en los arrays, variables, etc
        mostrar("****************REFERENCIA DE MEMORIAS*****************************");
        System.out.println(edad);
        System.out.println(edades);

    }
    public static void mostrar(String texto){
        System.out.println("\t"+texto);

    }
}
