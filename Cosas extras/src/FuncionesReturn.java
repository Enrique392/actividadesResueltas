import java.util.Scanner;

public class FuncionesReturn {
    public static void main(String[] args) {

        String nombreUsuario=llamadaNombre(3);
        System.out.println("Tu nombre es "+nombreUsuario);

    }

    public static String llamadaNombre(int contador){
        Scanner sn=new Scanner(System.in);
        String nombre="";

        System.out.println("indica el nombre");
        nombre= sn.next();

        return nombre;

    }
}
