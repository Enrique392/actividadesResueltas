package unidad1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Actividad1_3 {
    //Salida en consola System.out.println, abreviada sout y tab
    // Para hacer un programa, debemos utilizar una funcion (solo hacerlo, luego lo entereas) que sea la principal
    // y la forma automatica es psvm y tab.

    public static void main(String[] args) { //funcion principal
        //Solicitar la edad y decir cuanto tendra el proximo año
        // para crear salidas
        System.out.println();
        //para solicitar entradas Scanner sn=new Scanner(System.in)
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica tu edad->");
        byte edad=sn.nextByte();
        ++edad; //incrementamos la edad que ha introducido el usuario en 1
        System.out.println("El proximo año tendras " + edad + " años");
        //para ejecutar nuestra pequeña aplicacion, pulsamons shift o mayuscula y f10


    }
}

