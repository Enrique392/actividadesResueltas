import java.util.Scanner;

public class Calculadora {

    static double resultado;
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        System.out.println(" _____________________ ");
        System.out.println("|  calculadora        |");
        System.out.println("|  1. Sumar           |");
        System.out.println("|  2. Restar          |");
        System.out.println("|  3. Multiplicar     |");
        System.out.println("|  4. Dividir         |");
        System.out.println("|  5. Raiz Cuadrada   |");
        System.out.println("|  6. Exponencial     |");
        System.out.println("|  7. Salir           |");
        System.out.println("|_____________________|");
        byte opcion=sn.nextByte();
        operaciones(opcion);

    }
    static void operaciones(byte opcion){
        int numero1=0, numero2=0, base=0,exponente=0;
        if (opcion>=1 && opcion <4){
            System.out.println("Ingrese el valor del numero1");
            numero1= sn.nextInt();

            System.out.println("Ingrese el valor del numero2");
            numero2= sn.nextInt();

        }

        switch (opcion){
            case 1 -> resultado=numero1+numero2;
            case 2 -> resultado=numero1-numero2;
            case 3 -> resultado=numero1*numero2;
            case 4 -> resultado=numero1/numero2;
            case 5 -> {
                System.out.println("Ingrese el número a calcular la Raiz cuadrada");
                base= sn.nextInt();
                resultado=Math.sqrt(base);
            }
            case 6 -> {
                System.out.println("Ingrese la base-->" );
                base= sn.nextInt();

                System.out.println("Ingrese el exponente");
                exponente= sn.nextInt();
                resultado=Math.pow(base,exponente);
            }
            case 7 -> {System.err.println("¡Adios!");}

            default -> {
                System.err.println("opcion no valida");
                menu();
            }
        }
        if (opcion!=7) {menu();
            System.out.println("El reslutado es "+resultado);
        }
    }
}
//investigar la masa moscular, ingresa pesa altura y debes indicar si esta en sobrepeso (indice de masa muscular)