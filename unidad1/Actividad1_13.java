package unidad1;

import java.util.Scanner;

/**
 * Escribir un programa que solicite las notas del primer, segundo y tercer trimestre
 * (notas enteras que se solicitarán al usuario). El programa debe mostrar la nota media
 * del curso como se utiliza en el boletín de calificaciones (solo la parte entera) y como
 * se usa en el expediente académico (con decimales).
 */
public class Actividad1_13 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingresar las notas del primer trimestre");
        double notas1 = sn.nextDouble();

        System.out.println("Ingresar las notas del segundo trimestre");
        double notas2 = sn.nextDouble();

        System.out.println("Ingresar las notas de tercer trimestre");
        double notas3 = sn.nextDouble();

        double expediente = (notas1 + notas2 + notas3) / 3.0;
        int boletin = (int) expediente;

        System.out.println("Nota en el boletín " + boletin);
        System.out.println("NOta en el expediente " + expediente);

        }
    }
