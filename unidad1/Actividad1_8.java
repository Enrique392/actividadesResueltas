package unidad1;

import java.util.Scanner;

public class Actividad1_8 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("introduce tu edad: ");
        int edad= sn.nextInt();
        boolean mayorDeEdad = edad >= 18;

        System.out.println("Mayoria de edad " + mayorDeEdad);
    }
}
