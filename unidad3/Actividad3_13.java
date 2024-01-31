package unidad3;

import java.util.Scanner;

public class Actividad3_13 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        byte nota=0,aprobados=0,condicionados=0,suspensos=0;

        for (byte i=1;i<=6;i++){
            System.out.println("Ingrese la nota del alumno");
            nota= sn.nextByte();
            if (nota<4){
                suspensos++;
            } else if (nota==4) {
                condicionados++;
            } else if (nota>5) {
                aprobados++;
            }
        }
        System.out.println("La cantidad de aprobados son "+ aprobados);
        System.out.println("La cantidad de condicionados son "+ condicionados);
        System.out.println("la cantidad de suspendidos son "+suspensos);




    }
}
