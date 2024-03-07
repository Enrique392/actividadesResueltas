package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Actividad5_9 {

    static int [] puntuaciones=new int[5];
    static byte c=0;
    static Scanner sn = new Scanner(in);
    public static void main(String[] args) {


enunciado();
ingresar();


    }
    static void enunciado(){
        System.out.println("----------------------------------");
        System.out.println("| CAMPEONATO DE PROGRAMACION     |");
        System.out.println("|--------------------------------|");
        System.out.println("| Competidores "+c+"/5               |");
        System.out.println("|--------------------------------|");
        System.out.println("| Puntuaciones (O=Sin terminar)  |");
        System.out.println("| "+ Arrays.toString(puntuaciones) +"                |");
        System.out.println("|________________________________|");
        ingresar();
    }
    static void ingresar() {
        while (c < 5) {
            System.out.println("Ingrese la puntiacion del jugador Nº" + (c + 1));
            puntuaciones[0] = sn.nextInt();

            c++;
            Arrays.sort(puntuaciones);
            enunciado();
        }
    }

}
