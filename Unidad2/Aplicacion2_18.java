package Unidad2;

import java.util.Scanner;

public class Aplicacion2_18 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int respuestaCorrecta=0, respuestaUsuario;


        System.out.println("Suma los siguientes digitos para ganar");


        int x= (int) (Math.random()*100+1);
        int y= (int) (Math.random()*100+1);
        int signo= (int) (Math.random()*3+1);

        switch (signo){
            case 1:{System.out.println(x +"+" +y);
                respuestaCorrecta=(x+y);break;
            }
            case 2:{System.out.println(x +"-" +y);
                respuestaCorrecta=(x-y);break;
            }
            case 3:{System.out.println(x +"*" +y);
                respuestaCorrecta=(x*y);break;
            }
        }
        System.out.println("Ingerse su respuesta ");
        respuestaUsuario= sn.nextInt();

        if (respuestaCorrecta==respuestaUsuario){
            System.out.println("respuesta correcta");
        }else{
            System.out.println("respuesta incorrecta, la respues correcta era "+ respuestaCorrecta);
        }
    }
}
