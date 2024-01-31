package Unidad2;

import javax.swing.*;
import java.util.Scanner;

public class Actividad2_10 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("ingrese su nota");
        int nota= sn.nextInt();

        switch (nota) {case 1,2,3,4: {
            System.out.println("Insuficiente");
            break;} case 5: {
            System.out.println("Suficiente");
            break;} case 6: {
            System.out.println("Bien");
            break;} case 7,8: {
            System.out.println("Notable");
            break;} case 9,10: {
            System.out.println("Sobresaliente");
            break;}
            default: {
                System.err.println("La nota indicada es erronea");}}
    }
}
