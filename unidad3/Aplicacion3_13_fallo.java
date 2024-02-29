package unidad3;

import java.util.Scanner;

public class Aplicacion3_13_fallo {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int horas, minutos, segundos, tiempoAgragado;

        System.out.println("Ingrese las horas");
        horas= sn.nextInt();

        System.out.println("Ingrese los minutos");
        minutos= sn.nextInt();

        System.out.println("Ingrese los segundos");
        segundos= sn.nextInt();

   //     System.out.println("Ingrese la cantidad de segundos que desea sumarle a su hora");
  //      tiempoAgragado= sn.nextInt();

        System.out.println("hora antigua es-> "+horas+":"+minutos+":"+segundos);

        for (horas=horas;24<=horas;horas++){
            if (horas==24){
                horas=0;
            }
       //     horas++;
            for (minutos=minutos;60<=minutos;minutos++){
                if (minutos==60){
                    minutos=0;
                }
         //       minutos++;
                for (segundos=segundos;60<=segundos;segundos++){
                    if (segundos==60){
                        segundos=0;
                    }
                }
            }
        }

        System.out.println("hora nueva es -> "+horas+":"+minutos+":"+segundos);
    }
}
