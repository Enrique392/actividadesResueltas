import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

       final double precioMenor=4.50;
       double precioAdulto=6.00,totalEntradas=0;
        //miercoles todas las entradas cuestan 4.50
        byte opcionMenu=0;
        byte miercoles=0;
        String pelicula="";

        System.out.println("¿Es miercoles?");
        System.out.println("\t 1. Si \n\t 2. No");
        System.out.println("\tRespuesta->");
        miercoles=sn.nextByte();
        if (miercoles==1){
            precioAdulto=4.50;
        }

        System.out.println("----CINEMA----");
        System.out.println("\t1. Ferrari \uD83D\uDE97");
        System.out.println("\t2. Priscila \uD83D\uDC69\uD83C\uDFFB");
        System.out.println("\t3. Peppa ciname Party \uD83D\uDC37");
        System.out.println("\t4. Pobres Criaturas \uD83D\uDC57");
        System.out.println("\t5. La piscina \uD83D\uDCA6");
        System.out.println("\t6. Cazadores de demonios \uD83D\uDC79");
        System.out.println("\t7. Factura y Salir");
        System.out.println("-------------------------");

        do {
            System.out.println("indica que pelicula quieres ver");
            opcionMenu=sn.nextByte();
            switch (opcionMenu){
                case 1,2,3->{
                    System.out.println("Cantidad de niños->");
                    totalEntradas+=sn.nextDouble()*precioMenor;
                    System.out.println("Cantidad de adultos");
                    totalEntradas+=sn.nextDouble()*precioAdulto;
                }
                case 4,5,6->{
                    System.out.println("Ingrese la cantidad de adultos");
                    totalEntradas=sn.nextDouble()*precioAdulto;
                }
                case 7->{
                    System.out.println("Imprimiendo sus entradas");
                }
            }
        }while (opcionMenu!=7);

        System.out.println("-----ENTRADAS-----");
        System.out.println("Total a pagar "+totalEntradas );
        System.out.println("Gracais por tu compra");


    }

}
