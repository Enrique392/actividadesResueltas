package unidad3;

import java.util.Scanner;

public class Actividad3_11 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("A que numero desea sacar el factorial");
        long n= sn.nextInt();
        long resultado=1;
        for (n=n;n>=1;n--){
            resultado*=n;
        }
        System.out.println("El factorial de "+ n+ " es igual a "+resultado);


    }
}
