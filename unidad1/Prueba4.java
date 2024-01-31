package unidad1;

import java.util.Scanner;

/**
 * pedir la edad al usuario, si es mayor o igual a 18 puede entrar a la discoteca
 * si es menor de 18 ir a dormir
 */
public class Prueba4 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("ingrese su edad");
        int edad= sn.nextInt();

        String entrar = edad >= 18 ? "Puedes pasar" : "A casa";

        System.out.println(entrar);


    }
}
