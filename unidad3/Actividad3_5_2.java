package unidad3;

import java.util.Scanner;

public class Actividad3_5_2 {

    //  Desarrollar un juego que ayude a mejorar el cálculo mental de la suma.
    // El jugador tendrá que introducir la solución de la suma de dos números aleatorio
    // comprendidos entre 1 y 100. Mientras la solución introducida sea correcta, el juego continuará. En caso contrario,
    //el programa terminará y mostrará el número de operaciones realizadas correctamente

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = 0, x = 0, y = 0, respuesta = 0, aciertos = 0, signo;
        signo = (int) (Math.random() * 3 + 1);

        System.out.println("juego de suma");

        do {
            x = (int) (Math.random() * 100 + 1);
            y = (int) (Math.random() * 100 + 1);
            signo = (int) (Math.random() * 3 + 1);

            switch (signo) {
                case 1: {
                    System.out.println(x + "+" + y);
                    n = sn.nextInt();
                    respuesta = (x + y);
                    break;
                }
                case 2: {
                    System.out.println(x + "-" + y);
                    n = sn.nextInt();
                    respuesta = (x - y);
                    break;
                }
                case 3: {
                    System.out.println(x + "*" + y);
                    n = sn.nextInt();
                    respuesta = (x * y);
                    break;
                }
            }

            if (n == respuesta) {
                System.out.println("respuesta correcta");
            }
            aciertos++;



        }while (n == respuesta) ;

            System.out.println("Respuesta incorrecta, la respuesta era " + respuesta);
            System.out.println("Racha de aciertos " + (aciertos-1));


        }
    }
