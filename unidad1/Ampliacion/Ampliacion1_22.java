package unidad1.Ampliacion;

import java.util.Scanner;

/**
 * La FILA (Federación Internacional de Lanzamiento de Algoritmo)
 * realiza una competición donde cada participante escribe un algoritmo en un papel y lo lanza,
 * ganando quien con-siga lanzarlo más lejos. La peculiaridad del concurso es que la longitud del
 * lanzamiento se mide en metros (con tantos decimales como se desee), pero para el ranking solo se tiene
 * en cuenta la longitud en centímetros (sin decimales). Por ejemplo, para un lanza-miento de 12,3456 m (que son 1234,56 cm)
 * solo se contabilizarán 1234 cm.Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte
 * entera correspondiente en centímetros.
 */

public class Ampliacion1_22 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese la longitud del lanzamiento (En metros)");
        double m= sn.nextDouble();

        double cm  = (m*100);
        int longitud = (int) cm;
        System.out.println("La longitud del lanzmiento es de "+ longitud+"cm");
    }
}
