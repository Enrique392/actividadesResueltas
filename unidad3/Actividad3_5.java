package unidad3;

import java.util.Scanner;

public class Actividad3_5 {

  //  Desarrollar un juego que ayude a mejorar el cálculo mental de la suma.
  // El jugador tendrá que introducir la solución de la suma de dos números aleatorio
  // comprendidos entre 1 y 100. Mientras la solución introducida sea correcta, el juego continuará. En caso contrario,
  //el programa terminará y mostrará el número de operaciones realizadas correctamente

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=0,x=0,y=0,respuesta,aciertos=0;

        System.out.println("juego de suma");

        do{
            x= (int) (Math.random()*100+1);
            y= (int) (Math.random()*100+1);
            respuesta=x+y;
            System.out.println("Realiza la siguinte operacion "+x+" + "+y);
            n= sn.nextInt();

            x= (int) (Math.random()*100+1);
            y= (int) (Math.random()*100+1);
            respuesta=x+y;
            System.out.println("respuesta correcta");
            System.out.println("Realiza la siguinte operacion "+x+" + "+y);
            n= sn.nextInt();
            aciertos++;

        }while(n==respuesta);

        System.out.println("Respuesta incorrecta, la respuesta era "+respuesta);
        System.out.println("Racha de aciertos "+ aciertos);







    }
}
