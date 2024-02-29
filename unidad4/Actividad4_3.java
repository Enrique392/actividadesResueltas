package unidad4;

import java.util.Scanner;

public class Actividad4_3 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int altura,radio;

        System.out.println("Ingrese la altura");
        altura= sn.nextInt();

        System.out.println("Ingrese el radio");
        radio= sn.nextInt();

        formula(altura,radio);

    }

    public static void formula(int x,int y){
        double volumen=0,area=0;

        area= 2*Math.PI*(x+y);
        volumen=Math.PI*Math.pow(y,2)*x;

        System.out.println("La area es "+area);
        System.out.println("El volumen es "+volumen);
    }
}
