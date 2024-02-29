package unidad4;

import java.util.Scanner;

public class Actividad4_1 {
    public static void main(String[] args) {
        int cantidad;
        Scanner sn=new Scanner(System.in);

        System.out.println("Cuantas veces queires que suene el eco ");
        cantidad= sn.nextInt();

        eco(cantidad);


    }

    public static void eco(int veces){
        for (int i=0;i<veces;i++) {
            System.out.println("eco...");
        }

    }
}
