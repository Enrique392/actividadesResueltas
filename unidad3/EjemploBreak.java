package unidad3;

import java.util.Scanner;

public class EjemploBreak {
    public static void main(String[] args) {
        /*
        * Ejemplo, imagina la edad para entrar al pub, solo pueden entrar los mayores de 19, y quiero saber
        * cuantas `personas han entrado porque el aforo es de 100 personas.
        *
        * indica la edad-> si es manor de 18 no entra y no cuenta, si es mayor y el aforo lo permite entra, sino...
        * el programa se interrumpe porque no puede tener dentro del local mas de 100 personas...
        *
        * */
        Scanner sn=new Scanner(System.in);
        byte edad,menores=0;
        for (byte i=1;i<=100;i++) {
            System.out.println("indica la Edad->");
            edad = sn.nextByte();
            if (edad > 18) {
                System.out.println("No tienes permitido entrar");
                i--;
            }
            if (i==5){
                System.out.println("Han intentado entrar "+menores+" menores de edad");
                System.out.println("***Aforo completo***");
                break;
            }
        }
    }
}
