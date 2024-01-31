package unidad3;

import java.util.Scanner;

public class Propuesta3_3 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica el Numero positivo y lo mostrare guarismo");
        int numero= sn.nextInt();
        int unidad=0;

        while (numero>0){
            unidad=numero%10;
            System.out.println(unidad);
            numero/=10;
        }

    }
}
