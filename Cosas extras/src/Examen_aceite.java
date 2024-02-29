/*Una empresa que se dedica a la venta de Aceite de Oliva   necesita una aplicación en java para gestionar las
facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro.

Realizar un menú, con la siguiente estructura:

1. Facturar
2. Salir


En facturar, solicitar el código que pueden ser (01 de 1 litro, 02 de 3 litros y 03 de 5 litros)

Según el formato, los precios son:

1 litro -> 9,99€

3 litros -> 29,99€

5 litros-> 49,95€

 */


import java.util.Scanner;

public class Examen_aceite {
    static Scanner sn=new Scanner(System.in);
    static double precioF=0;
    static String producto="";
    public static void main(String[] args) {

menu();

    }

    public static void menu(){
        Scanner sn=new Scanner(System.in);
        byte opcion;
        int cantidad;
        double precioF=0;
        byte continuar;

        System.out.println("BIENVENIDO");
        System.out.println("\n¿Que accion desea realizar?");
        System.out.println("1.  Comprar/Facturar");
        System.out.println("2.  Salir");
        System.out.println(" ");
        opcion= sn.nextByte();

        menu2(opcion);
    }
    public static void menu2(int opcion2){
        Scanner sn=new Scanner(System.in);
        int cantidad;
        byte continuar;
        switch (opcion2){
            case 1-> {
                System.out.println("Digite la cantidad de aceite que desea");
                System.out.println("\n01... 1 Litro-> 9,99€\n02... 3 Litros->29,99€\n03... 5 Litros->49,95");
                cantidad=sn.nextInt();
                if (cantidad==1){
                    System.out.println("La cantidad seleccionada es 1 litro\n");
                    precioF=precioF+9.99;
                    producto+="01... 1 litro\n";
                    menu();
                } else if (cantidad==2){
                    System.out.println("La cantidad seleccionada son 3 Litros\n");
                    precioF=precioF+29.99;
                    producto+="02... 3 Litros\n";
                    menu();
                } else if (cantidad==3) {
                    System.out.println("la cantidad seleccionada son 5 Litros\n");
                    precioF=precioF+49.95;
                    producto+="03... 5 Litros\n";
                    menu();
                }else if(cantidad!=1||cantidad!=2||cantidad!=3){
                    System.err.println("Opcion no valida. ");
                    System.out.println("Intente denuevo");
                    menu();
                }

           }
            case 2-> {
                if (precioF>0){
                    System.out.println("Su pedido es: \n" + producto+" El total a pagar es de "+precioF+"€");
                    System.out.println("Gracias por su visita. ¡Adios!.");
                }else {
                    System.out.println("Gracias por su visita. ¡Adios!.");

                }

            }
            default -> {
                System.err.println("Opcion no valida. ");
                System.out.println("Intente denuevo");
                menu();
            }
        }
    }
}
