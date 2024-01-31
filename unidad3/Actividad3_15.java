package unidad3;

import javax.swing.*;
import java.util.Scanner;

public class Actividad3_15 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("indica cuantos numeros de * tendra el triangulo");
        int n= sn.nextInt();

        for (int fila=1;fila<=n;fila++){
            for (int col=fila;col<=n;col++){
                System.out.print("*");
            }
           System.out.println("");
        }
    }
}
