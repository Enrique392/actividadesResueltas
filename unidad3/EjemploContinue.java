package unidad3;

import java.util.Scanner;

public class EjemploContinue {
    public static void main(String[] args) {
        /*
         *hacer una lista de 14 persomas de la clase, y saltaar aa los que
         * se llaman "Manuel"
         */

        Scanner sn = new Scanner(System.in);
        String nombresImp = "";
        String todosNombre = "";
        for (byte i = 1; i <= 14; i++) {
            System.out.println("Indica tu nombre ->");
            nombresImp = sn.nextLine();
            if (nombresImp.equals("Manuel") || nombresImp.equals("manuel")) {
                continue;
            }
            todosNombre += nombresImp + "\n";
        }
        System.out.println("***Alumnos***\n"+todosNombre);



    }
}
