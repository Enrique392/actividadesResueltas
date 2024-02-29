package unidad4;

import java.util.Scanner;

public class Actividad4_6 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n;
        boolean esPrimo;

        System.out.println("Ingrese un numero para comprobar si es primo");
        n= sn.nextInt();

        esPrimo=primo(n);
        if (esPrimo){
            System.out.println("El numero "+n+" es primo");
        }else System.out.println("El numero "+n+" no es primo");



    }
    public static boolean primo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }

        }

        return true;
    }

}
