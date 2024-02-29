package unidad4;

import java.util.Scanner;

public class Actividad4_4 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int a,b,valor;

        System.out.println("Ingrese el primero numero");
        a= sn.nextInt();

        System.out.println("Ingrese el segundo numero");
        b= sn.nextInt();

        valor=mayor(a,b);

        System.out.println("\n El numero mayor es el "+valor);


    }

    public static int mayor(int x,int y){
        int mayor;

        mayor=Math.max(x,y);

        return mayor;

    }



}
