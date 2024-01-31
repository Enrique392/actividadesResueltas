package unidad3;

import java.util.Scanner;

public class Propuesta3_1 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        byte edad,edadMinima, edadMaxima;
        System.out.println("indica la edad->");
        edad= sn.nextByte();
        edadMaxima=edad;
        edadMinima=edad;

        while (edad!=-1){if (edadMinima>edad){edadMinima=edad;
        }
        if (edadMaxima<edad){edadMaxima=edad;
        }
        System.out.println("Indica la edad");
        edad= sn.nextByte();

        }
        System.out.println("La edad minima ingresas es "+edadMinima);
        System.out.println("La edad maxima ingresas es "+edadMaxima);

    }
}
