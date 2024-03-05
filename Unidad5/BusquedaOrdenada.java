package Unidad5;

import java.util.Arrays;

public class BusquedaOrdenada {
    public static void main(String[] args) {
        int numeros[] = {5, 7, 2, 3, 7, 8, 3, 4, 5, 7, 8};
        mostrar("Longitud->" + numeros.length);
        mostrar("-Sin ordenar-");
        mostrar(Arrays.toString(numeros));
        Arrays.sort(numeros);
        mostrar("- Ordenado -");
        mostrar(Arrays.toString(numeros));
        //despues de ordenar el array, se puede buscar un elemento con la clase
        //ninarySearch(nombreArray,elementoAbuscar)
        //El resultado de esta clase es un entero, si es positivo, es el indice donde se encuentra
        //Si es negativo menos que 0. es el indice donde deberia ir posicionado ese elemento per
        //que n o se encuentra
        int pos = Arrays.binarySearch(numeros, 8);
        mostrar("Posicion->" + pos);
        if (pos < 0) {
            mostrar("Este numero no existe en la tabla");
        }
        else {
            int indiceInsertar = pos - 1;
            mostrar("El 8 deberia ir en el indice " + indiceInsertar + " para mantener la tabla ordenada");
        }


    }
    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }

    public static void mostrarSin(String texto){
        System.out.print("\t"+texto);
    }
}
