package Unidad5;


import java.util.Scanner;

public class Nombretelefono {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        mostrar("Indique cuantos contatos quiere agregar");
        int x= sn.nextInt();

        String[]nombre=new String[x];
        int[]telefono=new int[x];
        for (int i=0;i< nombre.length;i++){
            mostrarSin("Indica el nombre Nº"+(i+1)+" ");
            nombre[i]= sn.next();sn.nextLine();
            mostrarSin("Indica el telefono Nº"+(i+1)+" ");
            telefono[i]=sn.nextInt();

        }
        mostrar("Lista de telefonos\n");
        mostrar("Nombre\tTelefono\n");
        for (int i=0;i< nombre.length;i++){
            mostrar(nombre[i]+"\t"+telefono[i]);
            mostrar("----------------------------");
        }

        mostrar("Quieres buscar un nombre y te indique el numero->");
        String nombreBuscar= sn.next();sn.nextLine();


        int indiceNumero=buscarTexto(nombre,nombreBuscar);
        if (indiceNumero< nombre.length){
            mostrar("**** E N C O N T R A D O ****");
            mostrar(nombre[indiceNumero]+" Telefono: "+telefono[indiceNumero]);
        }
    }

    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }

    public static void mostrarSin(String texto){
        System.out.print("\t"+texto);
    }

    public static int buscarTexto(String texto[],String buscar){
        int indice=0;
        while (indice<texto.length && !texto[indice].equals((buscar))){
            indice++;
        }
        return indice;
}

}
