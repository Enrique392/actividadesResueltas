package unidad1.Ampliacion;

import java.util.Scanner;

/**
 * Un biólogo está realizando un estudio de distintas especies de invertebrados
 * y necesita una aplicación que le ayude a contabilizar el número de patas que tienen
 * en total todos los animales capturados durante una jornada de trabajo. Para ello, te ha
 * solicitado que escribas una aplicación a la que hay que proporcionar
 * El numero de hormigas capturadas (6 patas)
 * El numero de arañas capturadas (8 patas)
 * El numero de cochinillas capturadas (14 patas)
 *La aplicacion debe mostrar el numero totañ de patas
 */
public class Ampliacion1_18 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese la cantidad de hormigas capturadas");
        int h=sn.nextInt();

        System.out.println("ingrese la cantidad de arañas capturadas");
        int a= sn.nextInt();

        System.out.println("Ingrese la cantidad de cochinillas capturadas");
        int c= sn.nextInt();

        int patasTotales = (6*h)+(8*a)+(14*c);
        int animales = (h+a+c);

        System.out.println("Capturaste un total de " + animales + " animales"+ " lo cual suma un total de "+patasTotales+" patas");
    }
}
