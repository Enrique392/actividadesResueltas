package Unidad2;

import java.util.Scanner;

public class Aplicacion2_13 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        double comidaDiaria, numAnimales, kilosPorAnimal,gasto,necesario=0;

        System.out.println("Ingrese la compra diaria de alimentos");
        comidaDiaria= sn.nextDouble();

        System.out.println("Ingrese cuantos animales tiene");
        numAnimales= sn.nextDouble();

        System.out.println("Ingrese cuantos kilos consume un animal");
        kilosPorAnimal= sn.nextDouble();
        gasto=numAnimales*kilosPorAnimal;
        necesario=comidaDiaria/numAnimales;

        if (numAnimales==0){
            System.out.println("No tienes animales que alimentar");
        }else if (gasto>comidaDiaria){
            System.out.println("La comida es insuficiente, deberan comer " + necesario+"kg");
        }else{
            System.out.println("TIene suficiente comida");
        }

    }
}
