package Unidad2;

import java.util.Scanner;

public class Actividad2_3 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int x = sn.nextInt();

        System.out.println("Ingrese otro numero");
        int y = sn.nextInt();

        if (x>y) {
            System.out.println("El primer numero es mayor que el segundo");
        }else{
            System.out.println("El segundo numero es mayor");
        }
    }
}
