package unidad3;

import java.util.Scanner;

public class Actividad3_4 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int altura,alturamax, cantidad=-1, arbolMasAlto=0;

        System.out.println("Ingrese la altura del arbol");
        altura= sn.nextInt();
        alturamax=altura;

        while (altura!=-1){
            cantidad++;

            if (alturamax<altura){arbolMasAlto=cantidad;}
            System.out.println("ingrese la altura del siguiente arbol");
            altura= sn.nextInt();


        }
        System.out.println("La cantidad de arboles es de "+ cantidad);
        System.out.println("El arbol mas alto es "+ arbolMasAlto);
    }
}
