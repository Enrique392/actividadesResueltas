package unidad1.Ampliacion;

import java.util.Scanner;
// Escribe un programa que tome como entrada un número entero e indique qué cantidad
// hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:
// A 2 hay que sumarle 5 para que el resultado (2 + 5 = 7) sea múltiplo de 7.
// A 13 hay que sumarle 1 para que el resultado (13 + 1 = 14) sea múltiplo de 7.
// Si proporcionas el número 2 o el 13, la salida de la aplicación debe ser 5 o 1,
// respectiva-mente.Pista: El operador módulo puede ser muy útil para solucionar esta activida

public class ampliacion1_12 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("Ingrese un numero entero");
        int n = sn.nextInt();

        double prox = 7-n%7;
        System.out.println("para que" + n + "sea multiplo de 7 le falta " + prox);


        //String multiplo = (n%7) == 0? "Si es multiplo" : "No es multiplo";
       // System.out.println("El numero es par "+ multiplo);

     //   int falta = n<=7 ? 7-n : n-7;
      //  falta = n<= 21 ? 21-n : 28-n;

     //   System.out.println("Al numero le falta " + falta);


    }
}
