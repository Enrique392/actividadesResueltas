package Unidad5;

public class BusquedaNoOrdenada {
    public static void main(String[] args) {
        int []numeros={5,3,7,977,3,6,8,1,4,90,44};
        mostrar("Longitud de la tabla->"+ numeros.length);
        int indice=0;
        int numeroBuscado=50;
        while (indice<numeros.length && numeros[indice]!=numeroBuscado){
            indice++;
        }
        if (indice<numeros.length){
            mostrar("La posicion del numero buscado es ->"+indice);
        }  else mostrar("EL numero solicitado no existe");


        String[] nombres={"Maria","Pedro","Juan","Irene","Isabel","Jose","Alba","Enrique"};
        buscarTexto(nombres,"Ana");
    }





    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }

    public static void mostrarSin(String texto){
        System.out.print("\t"+texto);
    }


    public static void buscarTexto(String texto[],String buscar){
        int indice=0;
        while (indice<texto.length && !texto[indice].equals((buscar))){
            indice++;
        }
        if (indice<texto.length){
            mostrar("La posicion del numero buscado es ->"+indice);
        }  else mostrar("EL numero solicitado no existe");

    }

}
