package unidad3;

import java.util.Scanner;

public class Actividad3_8 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int contador=1,n,media=0,suma=0,cantidad;

        System.out.println("¿Cuantos numeros va a ingresar?");
        cantidad= sn.nextInt();

        while (cantidad >= contador){
            System.out.println("Ingrese una cantidad");
            n= sn.nextInt();
            suma+=n;
            contador++;

        }
        contador--;
        media=suma/contador;
        System.out.println("La media es " + media);
    }
}
