package Unidad5;
import java.util.Arrays;


public class AmpliarArray {
    public static void main(String[] args) {
        int[] numeros=new int[6];
        for (int i=0;i< numeros.length;i++){
            numeros[i]=(int)(Math.random()*100+1);
        }
        System.out.println("Arrayantes de crecer, longitud->"+numeros.length);
        System.out.println(Arrays.toString(numeros));
        numeros=Arrays.copyOf(numeros,numeros.length+1);
        System.out.println("Array despues de crecer. longuitud"+numeros.length);
    //    numeros[numeros.length]


    }
    public static void mostrar(String texto){
            System.out.println("\t"+texto);
        }

    public static void mostrarSin(String texto){
            System.out.print("\t"+texto);
    }

}
