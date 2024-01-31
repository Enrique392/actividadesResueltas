package Unidad2;

import java.util.Scanner;

public class Aplicacion2_14 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        byte n;

        System.out.println("ingrese un numero del 1 al 99");
        n= sn.nextByte();
        String salida="nada";

        switch (n) {
            case 11 -> salida = "once";
            case 12 -> salida = "doce";
            case 13 -> salida = "trece";
            case 14 -> salida = "catorece";
            case 15 -> salida = "quince";
            case 16 -> salida = "diesiseis";
            case 17 -> salida = "diecisiete";
            case 18 -> salida = "diesiocho";
            case 19 -> salida = "diesinueve";
            case 21 -> salida = "veintiuno";
            case 22 -> salida = "veintidos";
            case 23 -> salida = "veintitres";
            case 24 -> salida = "veinticuatro";
            case 25 -> salida = "veinticinco";
            case 26 -> salida = "veintiseis";
            case 27 -> salida = "veintisiete";
            case 28 -> salida = "veintiocho";
            case 29 -> salida = "veintenueve";
            default -> {
                byte u = (byte) (n % 10);
                int d = n / 10;
                switch (d) {
                    case 1 -> salida = "Diez";
                    case 2 -> salida = "veinte";
                    case 3 -> salida = "treinte";
                    case 4 -> salida = "Cuarenta";
                    case 5 -> salida = "Cincuenta";
                    case 6 -> salida = "Sesenta";
                    case 7 -> salida = "Setenta";
                    case 8 -> salida = "Ochenta";
                    case 9 -> salida = "Noventa";
                }

                if (d >= 3 && u != 0) {
                    salida += " y ";
                }
                switch (u) {
                    case 1 -> salida += "uno";
                    case 2 -> salida += "dos";
                    case 3 -> salida += "tres";
                    case 4 -> salida += "cuatro";
                    case 5 -> salida += "cinco";
                    case 6 -> salida += "seis";
                    case 7 -> salida += "siete";
                    case 8 -> salida += "ocho";
                    case 9 -> salida += "nueve";
                }


            }


        }
        System.out.println("El numero escrito es "+salida);
    }
}
