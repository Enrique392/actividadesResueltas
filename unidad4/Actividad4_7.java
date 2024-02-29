package unidad4;

import java.util.Scanner;

public class Actividad4_7 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int numero;

        System.out.println("Ingrese cualquier numero");
        numero=sn.nextInt();

        System.out.println(" ");

        lista(numero);





    }



    public static void lista(int numero){
        int contador=0;
        for (int x=1;x<=numero;x++){
            if (numero%x==0 && primo(x)){
                if (x!=numero) {
                    contador++;
                    System.out.print(x + "  ");


                }
            }
        }
        System.out.println("\nLa cantidad de numeros primos que lo dividen son "+ contador);
    }
    public static boolean primo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }

        }

        return true;
    }

}
