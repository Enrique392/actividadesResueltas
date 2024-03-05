package Unidad5;

import javax.sql.rowset.CachedRowSet;
import java.util.Scanner;

//Introduce por teclado un número n; a continuación, solicita al usuario que teclee n núme-ros.
// Realiza la media de los números positivos,
// la media de los negativos y cuenta el nú-mero de ceros introducidos.
public class Propuesta5_3 {
    public static void main(String[] args) {
        //solicitamos cuantos numeros quiere ingresar el usuario
        Scanner sn=new Scanner(System.in);
        int cantidad;
        int contadorCeros=0;
        int contadorNegativos=0;
        int contadorPositivos=0;
        double mediaPositivos=0;
        double mediaNegativos=0;

        mostrar("Ingrese la cantidad de numeros que quiere ingresar");
        cantidad= sn.nextInt();

        int[]numero=new int[cantidad];

        for (int i=0;i<cantidad;i++){
            mostrar("Indica el elemento Nº "+(i+1));
            numero[i]= sn.nextInt();
            if (numero[i]<0){
                mediaNegativos+=numero[i];
                contadorNegativos++;
            } else if (numero[i]>0) {
                mediaPositivos+=numero[i];
                contadorPositivos++;
            }else contadorCeros++;
        }

        mostrar("negativos "+(mediaNegativos/contadorNegativos));
        mostrar("positivos "+(mediaPositivos/contadorPositivos));
        mostrar("Cantidad de ceros "+contadorCeros);
    }

    public static void mostrar(String texto){
        System.out.println("\n"+texto);
    }
}
