package unidad3;

public class Practica_bucle {
    public static void main(String[] args) {
        int i=1;
        boolean t=true;
        while (t){
            System.out.println(i);
            i++;
            if (i>=3){
                t=false;
            }
        }
    }
}
