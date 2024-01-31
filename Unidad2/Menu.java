package Unidad2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n, a=0,b=1;
        double resultado=0;

        System.out.println("BUenvenido, indique cual opcion le interesa");
        System.out.println("1. Suma           ");
        System.out.println("2. Resta          ");
        System.out.println("3. Multiplicacion ");
        System.out.println("4. Division       ");
        System.out.println("5. Salir          ");
        System.out.println("introduce un numero");
        n= sn.nextInt();

        if (n>=1 && n<=4) {
            System.out.println("Ingrese el valoir de a");
            a= sn.nextInt();

            System.out.println("Ingrese el valoir de b");
            b= sn.nextInt();}



            switch (n) {
                case 1: {resultado = a+b;
                    break;
                }
                case 2: {resultado = a-b;
                    break;
                }
                case 3: {resultado = a*b;
                    break;
                }
                case 4: {resultado = a/b;
                    break;
                }
                case 5: {
                    System.out.println("Hasta la vista");
                    break;
                }
                default: {
                    System.err.println("Debe escoger una opcion entre 1-5");}

                }
        if (n>=1 && n<=4) {
            System.out.println("El resultado de la es: " + resultado);}
            }
        }