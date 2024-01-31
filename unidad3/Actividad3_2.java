package unidad3;

import java.util.Scanner;

public class Actividad3_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int edad=0, cantidadTotal=0, suma=0, media=0, mayoresEdad=0;

        System.out.println("Ingrese la edad del alumno");
        edad= s.nextInt();

        while (edad!=0){
            cantidadTotal++;
            suma+=edad;
            media=suma/cantidadTotal;
            if (edad>=18){mayoresEdad++;}
            System.out.println("ingrese la edad del siguiente alumno");
            edad= s.nextInt();
        }
        System.out.println("La suma de las edades es "+suma);
        System.out.println("La media de las edades es "+media);
        System.out.println("El total de alumnos es "+cantidadTotal);
        System.out.println("los mayores de edad son "+mayoresEdad);


    }
}
