package unidad1.Ampliacion;

import java.util.Scanner;

/**
 * Una empresa que gestiona un parque acuático te solicita una aplicación
 * que les ayude a calcular el importe que hay que cobrar en la taquilla por la compra
 * de una serie de entra-das (cuyo número será introducido por el usuario). Existen dos tipos
 * de entrada: infanti-les, que cuestan 15,50 €; y de adultos, que cuestan 20 €.En el caso de que el importe
 * total sea igual o superior a 100 €, se aplicará automática-mente un bono descuento del 5 %.
 */

public class Ampliacion1_19 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        final double PRECIOINFANTIL = 15.50;
        final double PRECIOADULTO = 20;

        System.out.println("ingrese la cantidad de entradas infantiles");
        int infantiles= sn.nextInt();

        System.out.println("Ingrese la cantidad de entradas de adultos");
        int adultos= sn.nextInt();

        double precio= (infantiles*PRECIOINFANTIL)+(adultos*PRECIOADULTO);
        double precioF= precio>=100 ? precio-(precio*5/100) : precio;

        System.out.println("El precio final es de "+precioF);
    }
}
