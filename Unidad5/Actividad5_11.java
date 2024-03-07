package Unidad5;


import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Actividad5_11 {
    static Scanner sn = new Scanner(in);
    static byte dif=1;
    static int numeroSecreto=(int) (Math.random()*9+1);;
    static int numeroJugador=0;
    static int intentos=0;
    static int[] mejores=new int[0];
    static int score;

    public static void main(String[] args) {
        menu();

    }

    static void menu() {
        System.out.println(" Bienvenido al juego de ");
        System.out.println("   LA CAMARA SECRETA    ");
        System.out.println("1. Instrucciones        ");
        System.out.println("2. Selecionar dificultad");
        System.out.println("3. Jugar                ");
        System.out.println("4. Mejores puntuaciones ");
        System.out.println("5. Salir/rendirme       ");
        byte opcion = sn.nextByte();

        swi(opcion);
    }

    static void swi(byte opcion) {
        switch (opcion) {
            case 1 -> {
                System.out.println("|---------------------------------------------------------------------------------------------------|");
                System.out.println("| instruccines:                                                                                     |");
                System.out.println("| Deberas adivinar un codigo secreto                                                                |");
                System.out.println("| Este codigo puede ser de 1-3-5 digitos dependiendo de la dificultad seleccionada.                 |");
                System.out.println("| Despues de cada acierto fallido se le dara una pista.                                             |");
                System.out.println("| La pista indicara si esta la combinacion correcta es m ayor o menos a la indicada por el usuario  |");
                System.out.println("| Entre menos fallos tengan mayor sera tu puntuacion                                                |");
                System.out.println("|___________________________________________________________________________________________________|");
                menu();
            }
            case 2 -> dificultad();
            case 3 -> juego();
            case 4 -> tabla();
            case 5 -> System.out.println("Gracias por jugar con nosotros, no olvides en apoyarnos, vuelve pronto");
            default -> {
                System.err.println("Opcion no valida");
                menu();
            }
        }
    }

    static void dificultad(){
    System.out.println("indique que dificultad desea");
    System.out.println("1. facil   \uD83E\uDD78     ");
    System.out.println("2. medio   \uD83D\uDCAA     ");
    System.out.println("3. Dificil \uD83D\uDC79     ");
    dif= sn.nextByte();

        switch (dif){
            case 1-> numeroSecreto= (int) (Math.random()*9+1);
            case 2-> numeroSecreto= (int) (Math.random()*999+100);
            case 3-> numeroSecreto= (int) (Math.random()*99999+10000);
    }
    juego();
        }

        static void juego(){
        score=10000;
            System.out.println("Para abrir la boveda debes adivinar la combinacion correcta");
            System.out.println("Ingrese su combinacion");
            numeroJugador=sn.nextInt();
                while(numeroJugador!=numeroSecreto){
                    System.err.println("combinacion incorrecta");
                    System.out.println("Intente de nuevo");
                    numeroJugador=sn.nextInt();
                    intentos++;
                    if (numeroJugador>numeroSecreto){
                        System.out.println("Su combinacion es mayor al numero secreto");
                    }
                    if (numeroJugador<numeroSecreto){
                        System.out.println("Su combinacion es menor al numero secreto");
                    }
            }
                System.out.println("Felicitaciones, adivinaste la combinacion en "+ (intentos+1)+" intentos");
                score=10000-(intentos*100);


                System.out.println("Su puntuacion: "+score);

            mejores=Arrays.copyOf(mejores,mejores.length+1);
            mejores[mejores.length-1]=score;

            System.out.println("Quieres jugar otra vez\n1. Si\n2. No");
            byte continuar= sn.nextByte();

            if (continuar==1){
                dificultad();
            }else tabla();

        }

        static void tabla(){
            System.out.println("**Mejores puntuaciones**");
            System.out.println("**Las mejores puntuaciones son las de abajo");
            Arrays.sort(mejores);
            for (int i = 0; i < mejores.length; i++) {
                System.out.println("Nº "+i+" "+mejores[i]);

                System.out.println("Quires vovler al menu\n1. Si\n2. No");
                byte continuar= sn.nextByte();

                if (continuar==1){
                    menu();
                }else System.out.println("Gracias por jugar con nosotros, no olvides en apoyarnos, vuelve pronto");

            }

        }

}
