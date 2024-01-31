package Unidad2;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Aplicacion2_17 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int respuestaCorrecta, respuestaUsuario;

        System.out.println("Suma los siguientes digitos para ganar");


        int x= (int) (Math.random()*100+1);

        int y= (int) (Math.random()*100+1);

        System.out.println(x +"+" +y);
        respuestaCorrecta=(x+y);

        System.out.println("Ingerse su respues ");
        respuestaUsuario= sn.nextInt();

        if (respuestaCorrecta==respuestaUsuario){
            System.out.println("respuesta correcta");
        }else{
            System.out.println("respuesta incorrecta, la respues correcta era "+ respuestaCorrecta);
        }








    }
}
