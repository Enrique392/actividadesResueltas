package unidad3;

import java.util.Scanner;

public class Actividad3_6 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("indica hasta que numero quieres contar ");
        int veces= sn.nextInt();
        for (int i=1;i<=veces;i++){
            System.out.println("El numero es "+i);
        }

    }
}
