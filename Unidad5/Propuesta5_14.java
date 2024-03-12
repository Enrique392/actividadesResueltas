package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Propuesta5_14 {
    public static void main(String[] args) {
        double sueldos[]=altaSueldos();
        System.out.println(Arrays.toString(sueldos));
        mostrar(sueldos);
        minMax(sueldos);
        media(sueldos);

    }

    public static double[]altaSueldos(){
        double[]sueldos=new double[0];
        double sueldoAux=0;
        Scanner sn = new Scanner(in);
        //Bucle while hasta que no se escriba -1 no salga del bucle


        do {
            System.out.println("Ingrese el sueldo-> ");
            sueldoAux= sn.nextDouble();
            if (sueldoAux!=-1) {
                sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
                sueldos[sueldos.length - 1] = sueldoAux;
            }
        }while (sueldoAux!=-1);
        //enviamos el resultado
        Arrays.sort(sueldos);
        return sueldos;
    }

    public static void mostrar(double []sueldos){
        for (int i = sueldos.length-1; i>=0; i--) {
            System.out.print(sueldos[i]);
            if (i!=0){
                System.out.print(" - ");
            }
        }
        System.out.println(" ");
    }

    public static void minMax(double sueldos[]){
        System.out.println("sueldo mayor-> "+(sueldos[sueldos.length-1]));
        System.out.println("sueldo menor-> "+sueldos[0]);

    }

    public static void media(double[]sueldos){
        double suma=0;
        for (int i = 0; i < sueldos.length; i++) {
            suma+=sueldos[i];
        }
        double media=suma/ sueldos.length;
        System.out.println("La media de los sueldos es de-> "+media+"€");
    }

}
