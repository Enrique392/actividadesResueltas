import java.util.Scanner;

public class Euros {
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
        mostar("Que tarea desea realizar?");
        mostar("1. Conversion de moneda\n2. Converscion de peso");
        byte opcion= sn.nextByte();

        if (opcion==1){
            System.out.println("Ingrese en Euros el monto a convertir");
            double euros= sn.nextDouble();

            menu(euros); //Llamada a funcion con pase de palabras
        }else {
            System.out.println("Ingrese la cantidad en kilogramos que desea conertir ");

        }



    }

    public static void menu(double euros){
        char letra;
        do {
            mostar("*****CONVERSOR DE MONEDA*****");
            mostar("\ta-> Libras");
            mostar("\tb-> yen Japones");
            mostar("\tc-> Dolar EEUU");
            mostar("\td-> Dolar Canada");
            mostar("\tx-> Salir");
            mostar("Indica la modena a convertir");
            letra = sn.next().charAt(0);

            switch (letra) {
                case 'a' -> {
                    System.out.println(euros + "€=" + euros * 0.8562 + " GBP");
                }
                case 'b' -> {
                    System.out.println(euros + "€=" + euros * 163.24 + " Yen Japones");
                }
                case 'c' -> {
                    System.out.println(euros + "€=" + euros * 1.0838 + " DLS USA");
                }
                case 'D' -> {
                    System.out.println(euros + "€=" + euros * 1.4711 + " DLS CND");
                }
                case 'x' -> {
                    mostar("¿Estas seguro de salir, x-> continuar");
                    letra = sn.next().charAt(0);
                    if (letra != 'x') {
                        menu(euros);
                    }else{
                        break;
                    }
                }
                default -> {mostar("Opcion no V A L I D A");}

            }
        }while(letra!='x');

    }

    public static void kilos(){





    }

    public static void mostar(String texto){
        System.out.println("\t"+texto);




    }
}
