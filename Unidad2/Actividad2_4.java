package Unidad2;

import java.util.Scanner;

public class Actividad2_4 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese un numero decimal");
        double x = sn.nextDouble();

        if (1>x && x>-1 && x!=0) {
            System.out.println("El numero es un casi-cero");
        }else{
            System.out.println("El numero no es un casi-cero");
        }
    }
}
