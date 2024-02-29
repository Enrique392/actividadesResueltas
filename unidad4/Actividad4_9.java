package unidad4;

import java.util.Scanner;

public class Actividad4_9 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int a,b,c,valor;

        System.out.println("Ingrese el primero numero");
        a= sn.nextInt();

        System.out.println("Ingrese el segundo numero");
        b= sn.nextInt();

        System.out.println("Ingrese el segundo numero");
        c= sn.nextInt();

        valor=mayor(a,b,c);

        System.out.println("\n El numero mayor es el "+valor);

    }

    public static int mayor(int x,int y,int z){
        int mayor;

        mayor=Math.max(x,y);

        return mayor;

    }



}
