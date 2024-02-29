import java.io.PrintStream;
import java.util.Scanner;


//crear un programa que permita a traves de un meni (torillas, croquetas, jamon y queso, bebidas)
// Indicar lo que le cliente solicita y mstrar el total de su pedido, tomando en cuien ta los precios
//tortilas 2   croquetas 8   jamon y queso 15   todas las bebidas 3
public class Comandas {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        int cuenta=0;
        byte opcion=0,cantidad=0;
        double ivi=0.0;

        String detallePedido="";
        /* Crear un bucle con el menu */
        System.out.println("****Menú Coffe House****");
        System.out.println("\t1. Tortilllas");
        System.out.println("\t2. Croquetas");
        System.out.println("\t3. Jamón y Queso");
        System.out.println("\t4. Bebidas");
        System.out.println("\t5. Salir");

        do {
            System.out.println("\n\tIndique su opción->");
            opcion= sn.nextByte();
            if (opcion!=5) {
                System.out.println("ingrese la cantidad que quiere de ese producto -> ");
                cantidad = sn.nextByte();
            }
            switch (opcion){
                case 1->{

                    cuenta+=(cantidad*2);
                    detallePedido+=(cantidad+" Tortilla\n");
                    cantidad=0;
                }
                case 2->{

                    cuenta+=(cantidad*8);
                    detallePedido+=(cantidad + " Croquetas\n");
                    cantidad=0;
                }
                case 3-> {

                    cuenta +=(cantidad*15);
                    detallePedido += (cantidad+ " Jamón y Queso\n");
                    cantidad=0;
                }
                case 4-> {

                    cuenta +=(cantidad*3);
                    detallePedido +=(cantidad+ " Bebida\n");
                    cantidad=0;

                }
                case 5-> {
                    System.out.println("****Generando su cuenta****");

                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            }

        }while(opcion!=5);
        ivi=(cuenta+((double) (cuenta * 21) /100));
        System.out.println("\n\n****Factira Simplificada****");
        System.out.println("\tPedido: \n"+ detallePedido);
        System.out.println("\tCoste sin IVA "+ cuenta+ "€");
        System.out.println("\tCoste con el IVA " + ivi + "€");


    }
}
