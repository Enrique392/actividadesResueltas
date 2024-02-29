public class Funciones {
    public static void main(String[] args) {

        tresSaludos(1);
        tresSaludos(2);
        tresSaludos(3);
    }

    //Pureba para hecer funciones

public static void tresSaludos(int veces){
        if (veces==1){
            System.out.println("te vamos saludar "+ veces+" vez");
        }else
    System.out.println("te vamos a saludar "+veces+" veces");;

    for (int i=0;i<veces;i++){
        System.out.println("Hola");
    }
    }
}
