package unidad1;

import java.util.Scanner;

/**
 * Un frutero necesita calcular los beneficios amuales que obtiene de la venta de
 * manzanas y peras. Por este motico, es necesario diseñar una aplicación que solicite
 * las ventas (en kilos) de cada semestre para cada fruta. La aplicaci´´on mostrará el
 * importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35 y el kilo de peras en 1,95
 */
public class Actividad1_11 {
    public static void main(String[] args) {
        final double MANZANA = 2.35;
        final double PERAS = 1.95;

        Scanner sn= new Scanner(System.in);
        System.out.println("Idique la cantidad de manzanas vendidas en el primer semestre (Kilos) ");
        double manzanas1 = sn.nextDouble();

        System.out.println("Idique la cantidad de manzanas vendidas en el segundo semestre (Kilos) ");
        double manzanas2 = sn.nextDouble();

        System.out.println("Indique la cantidad de peras vendidas en el primer semestre (kilos)");
        double peras1 = sn.nextDouble();

        System.out.println("Indique la cantidad de peras vendidas en el segundo semestre (kilos)");
        double peras2 = sn.nextDouble();

        double gananciaM = ((manzanas1 + manzanas2) * MANZANA);
        double gananciaP = ((peras1 + peras2) * PERAS);

        System.out.println("Las manzanas dejaron una ganancia de " + gananciaM);

        System.out.println("Las peras dejaron una ganancia de " + gananciaP);

        System.out.println("El importe total de ambas frutas es de "+ (gananciaM + gananciaP));


        //tambien se puede usar += para ahorrar caracteres (es lo mismo decir a=a+1 que decir a+=1)
        // existen diversos tipos como += -= *= /= %=


    }
}
