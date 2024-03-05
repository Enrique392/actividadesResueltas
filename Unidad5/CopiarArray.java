package Unidad5;

import java.util.Arrays;

public class CopiarArray {
    public static void main(String[] args) {
        //para copiar debemos hacer dos arrays con la misma longitud
        int[] a=new int[5];
        for (int i=0;i< a.length;i++){
            a[i]=(int)(Math.random()*100+1);
        }
        System.out.println(Arrays.toString(a));
        //si necesitas copiar un array

        int[] b=new int[5];
        //copyOf construye y devuelve una cipoa del origen al destino con la longuitud indicada en el metodo
        b=Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(b));
        //copyOfRange
        //crea y devuelve una tabla donde se copian los elementos indicados en el rango
        //indice desde, donde comeinza hasta..donde termina sin incluir este elemento.

        int c[]=Arrays.copyOfRange(a,2,4);
        System.out.println(Arrays.toString(c));

        int[] d=new int[5];
        System.arraycopy(a,0,d,0,a.length);

    }
}
