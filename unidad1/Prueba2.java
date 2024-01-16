package unidad1;

import java.util.Calendar;
import java.util.Scanner;

/**
 * En una tienda, se requiere calcular el porcentaje de descuento de un producto,
 * para lo que debes solicitar el precio del producto y el porcentaje a aplicar, y calcular el precio total
 */

public class Prueba2 {
    //Mio
    public static void main(String[] args) {
        double precio, precioF;
        int descuento;

        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el precio del producto");
        precio = sc.nextInt();
        System.out.println("Indique el descuento");
        descuento = sc.nextInt();
        precioF = precio-(precio*descuento/100);
        System.out.println("El precio con descuento incluido seria de " + precioF);

        //profe
//        Scanner sn=new Scanner(System.in);
//        System.out.println("Indique el precio");
//        double preciO= sn.nextInt();
//        System.out.println("indique el descuento");
//        double precioFinal=precio-(precio*(sn.nextDouble()/100));
//        System.out.println(precioFinal);

    }
}
