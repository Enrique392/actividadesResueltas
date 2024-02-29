import java.util.Scanner;

public class IndiceMasa {
    static Scanner sn=new Scanner(System.in);
    static String nombre;
    static double peso,altura,imc;

    public static void main(String[] args) {  //Nada importante, solo si el usuario quiere saber cuanto pero debe perder
        byte continuar=0;
        double pesoPerder;

        informacion();

        if (imc>24.9){System.out.println("¿Quieres saber cuanto peso seria recomendable perder?\n(1) SI\t\t(2) NO, prefiero ser feliz.");
            continuar= sn.nextByte();
        } else if (imc<18.5) {
            System.out.println("Quieres saber cuanto peso seria recomendable que ganes?\n(1) SI\t\t(2) NO, prefiero ser feliz.");
            continuar= sn.nextByte();

        } else if (18.5<=imc&&imc<=24.9){System.out.println("Gracias por su tiempo, vuelva pronto");}

        if (continuar==1&&imc>24.9){
            pesoPerder=peso-Math.pow(altura,2)*24.99;
            System.out.println("De ser posible es recomendable que pierda: ");
            System.out.printf("%.2f",pesoPerder);
            System.out.print("Kg\n");
        }else if (continuar==2){System.out.println("Gracias por su tiempo, vuelva pronto");}

        if (continuar==1&&imc<18.5){
            pesoPerder=Math.pow(altura,2)*24.99-peso;
            System.out.println("De ser posible es recomendable que pierda: ");
            System.out.printf("%.2f",pesoPerder);
            System.out.print("Kg\n");
        }


    }
static void informacion(){ //aqui solicitamos informacion y evitamos posible errores con la informacion
    System.out.println("Ingrese su nombre");
    nombre=sn.nextLine();

    System.out.println("Ingrese su altura (Cm)");
    altura= sn.nextDouble();
    altura=altura/100;

    if (altura<0.50){
        System.err.println("REVISAR LOS DATOS");
        informacion();
    }

    System.out.println("Ingrese su peso (kg)");
    peso= sn.nextDouble();

    if (peso<3){
        System.err.println("REVISAR LOS DATOS");
        informacion();
    }

    imc=(peso/Math.pow(altura,2)); //(IMC = peso (kg)/ [estatura (m)]2

    operaciones(imc);
}

static void operaciones(double imc){ //Aqui estan los if que indican el estado del usuario
    System.out.println(nombre + " Su IMC es de: ");
    System.out.printf("%.2f",imc);

    if (imc<=18.5) {
        System.out.println("\nSu peso esta por debajo de lo recomendado");
    }else if (imc>18.5 && imc<=24.9) {
        System.out.println("\nSu peso dentro de lo recomandable");
    } else if (imc>24.9 && imc<=29.9) {
        System.out.println("\nSu peso esta por encima de lo recomendado");
    } else if (imc>29.9 && imc<=39.9) {
        System.out.println("\nSu peso sobrepasa lo recomendado");
    } else if (imc>40) {
        System.out.println("\nSu peso esta muy por encima de lo recomendado");
    }
}
}
