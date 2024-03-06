package Unidad5;
/*vamos a realizar la sesta de la compra...
* Caad que compramos, variamos de productos, y de cantidad.
* Creamos un array que crecera a medida que insertemos productos, para ello utilizaremos un pequeño
* menu, y para la ejecucion funciones de busqueda y de insersion.
*  */

import java.awt.*;
import java.util.Scanner;
import static java.lang.System.in;



public class InsertarOrdenadaFunciones {
    static  Scanner sn = new Scanner(in);
   // static
    public static void main(String[] args) {


        mostrar("----CESTA DE LA COMPRA----");
        mostrar("1. Insertar");
        mostrar("2. Mostrar Cesta");
        mostrar("3. Eliminar Producto");
        mostrar("4. imprimir y Salir");
        mostrarSin("Indica su opcion-> ");
        byte opcion= sn.nextByte();

        String[] cesta=new String[0];

        switch (opcion){
            case 1->cesta=insertar(cesta);


        }

    }

    public static String[] insertar(String cesta[]){
        //preguntamos el producto a insertar
        mostrar("Indica el nombre del producto");
        String productoNuevo= sn.next();sn.nextLine();


        return cesta;
    }


    public static boolean buscadorProducto(String cesta[],String productoNuevo){
        boolean existe=false;
        int indice=0;
        while (indice<cesta.length && !cesta[indice].equals((productoNuevo))){
            indice++;
        }
        if (indice<cesta.length){
            existe=true;
        }
        return existe;


    }


    public static void menu(){

    }

    public static void buscar(){

    }

    public static void mostrar(String texto){
            System.out.println("\t"+texto);
        }

    public static void mostrarSin(String texto){
            System.out.print("\t"+texto);
    }



}
