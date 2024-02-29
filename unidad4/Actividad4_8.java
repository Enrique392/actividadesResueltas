package unidad4;

import java.util.Scanner;

public class Actividad4_8 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        byte continuar;


        System.out.println("Bienvenido\n");

        menu();

        System.out.println("¿Desea hacer otra operacion?\n1. Si\n2. No ");
        continuar= sn.nextByte();

        do {
            if (continuar==1){
                menu();
                System.out.println("¿Desea hacer otra operacion?\n1. Si\n2. No ");
                continuar= sn.nextByte();
            }else if (continuar==2){System.out.println("¡Adios!");
            } else {System.err.println("opcion no valida");
                System.out.println("¿Desea hacer otra operacion?\n1. Si\n2. No ");
                continuar= sn.nextByte();
            }

        }while (continuar!=2);
    }

    public static int menu(){
        Scanner sn=new Scanner(System.in);
        byte opcion;
        int a=0,b=0,resultado=0;

        System.out.println("-----CALCULADORA-----");
        System.out.println("| 1. SUMA           |");
        System.out.println("| 2. RESTA          |");
        System.out.println("| 3. MULTIPLICACION |");
        System.out.println("| 4. DIVISION       |");
        System.out.println("| 5. SALIR          |");
        System.out.println("---------------------");

        System.out.println("\n ¿Que desea hacer?");
        opcion= sn.nextByte();

        if (opcion!=5&&opcion<6){System.out.println("Ingrese el primer valor");
        a= sn.nextInt();
        System.out.println("Ingrese el segundo valor");
        b= sn.nextInt();
        }

        switch (opcion){
            case 1-> {resultado=a+b;
                System.out.println("El resultado de su suma es "+resultado+"\n");
            }
            case 2-> {resultado=a-b;
                System.out.println("El resultado de su resta es "+resultado+"\n");
            }
            case 3-> {resultado=a*b;
                System.out.println("El resultado de su multiplicacion es "+resultado+"\n");
            }
            case 4-> {resultado=a/b;
                System.out.println("El resultado de su division es "+resultado+"\n");
            }
            case 5-> {System.out.println("¡Adios!");
                System.exit(0);

            }
            default -> System.err.println("Opcion no valida");
        }
        return opcion;

    }
}
