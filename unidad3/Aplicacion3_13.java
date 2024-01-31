package unidad3;

import java.util.Scanner;

public class Aplicacion3_13 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese las horas");
        byte horas= sn.nextByte();

        System.out.println("Ingrese los minutos");
        byte minutos= sn.nextByte();

        System.out.println("Ingrese los seguntos");
        byte segundos= sn.nextByte();


        for (horas=horas;horas<=24;horas++){
            if (horas==24){
                horas=0;
            }
            for (minutos=minutos;minutos<=60;minutos++){
                if (minutos==60){
                    minutos=0;
                }
                for (segundos=segundos;segundos<=60;segundos++){
                    if (segundos == 60) {
                        segundos=0;
                    }
                }
            }
        }
        System.out.println("La nueva hora es"+horas+":"+minutos+":"+segundos);
    }
}
