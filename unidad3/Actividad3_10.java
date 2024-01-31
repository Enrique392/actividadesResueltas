package unidad3;

public class Actividad3_10 {
    public static void main(String[] args) {
        System.out.println("Se mostrara la suma de los primeros 20 numeros impares");
        int suma=0;
        for (int par=0; par<=20; par+=2){
            System.out.println(par);
            suma+=par;
        }
        System.out.println("la suma de los primeros "+ suma);


    }
}
