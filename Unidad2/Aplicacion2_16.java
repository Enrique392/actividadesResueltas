package Unidad2;

import java.util.Scanner;

public class Aplicacion2_16 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese un numero (Puede ser negativo o positivo");
        int n= sn.nextInt();

        if (n<0) {n*=-1;
            System.out.println("El valor absoluto es "+ n);}else{
            System.out.println("El valor absoluto es "+n);
        }
    }
}
