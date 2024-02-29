import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String nombre, apellido;
        byte edad;


        System.out.println("Ingrese su nombre ->");
        nombre=sn.next(); sn.nextLine();
        System.out.println("ingrese su apellido ->");
        apellido=sn.next(); sn.nextLine();
        System.out.println("Ingrese su edad->");
        edad= sn.nextByte();

        incremento(nombre,apellido,edad);


    }

    public static void incremento(String nom, String ape, byte ed){
        ed+=10;
        System.out.println(nom+" "+ape+" dentro 10 años tendras "+ed+" años");




    }
}
