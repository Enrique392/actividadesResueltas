package unidad1.Ampliacion;

import java.util.Scanner;

//Un economista te ha encargado un programa para realizar cálculos con el IVA.
// La aplica-ción debe solicitar la base imponible y el IVA que se debe aplicar.
// Muestra en pantalla el importe correspondiente al IVA y al total

public class Ampliacion1_11 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese el IVA");
        int iva = sn.nextInt();

        System.out.println("Ingrese el monto");
        double monto = sn.nextDouble();

        double ivaA = (monto * iva / 100);
        System.out.println("El iva equivale a " + ivaA);

        double montoF = monto + ivaA;

        System.out.println("EL monto final es " + montoF);
    }
}
