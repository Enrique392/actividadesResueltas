package unidad1;

import java.util.Scanner;

public class Actividad1_9 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = sn.nextInt();
        boolean par = (numero % 2) == 0;
        System.out.println("El numero es par" + par);


    }
}
