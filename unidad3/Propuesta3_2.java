package unidad3;

import java.util.Scanner;

public class Propuesta3_2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("indica las deces que quieres que te salude->");
        int veces= sn.nextInt();
        for (int i=1;i<=veces;i++){
            System.out.println("Eco... Hola");
        }

    }
}
