package Unidad2;

import java.util.Scanner;

public class Aplicacion2_19 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        double grados,radianes;

        System.out.println("Ingrese cuantos grado tiene el angulo");
        grados= sn.nextInt();

        if (grados>=360){grados%=360;}

        radianes=(grados*Math.PI/180);

       System.out.print("Los radianes son ");
        System.out.printf("%.4f%n",radianes);


    }
}
