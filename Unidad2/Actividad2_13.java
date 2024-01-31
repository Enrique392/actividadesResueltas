package Unidad2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Actividad2_13 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int h=0,m=0,s=0;

        System.out.println("Ingrese las hora");
        h=sn.nextInt();

        System.out.println("Ingrese los minutos");
        m=sn.nextInt();

        System.out.println("Ingrese los segundos");
        s=sn.nextInt();
        int horaNueva= s+1;

        if (horaNueva>=60) {horaNueva-=60;m=m+1;}
        if (m>=60) {m-=60;h=h+1;}
        if (h>=24) {h-=24;}

        System.out.println("la hora actual son las "+h+":"+m+":"+horaNueva);


    }
}
