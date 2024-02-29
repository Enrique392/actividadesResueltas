package unidad3;

import java.util.Scanner;

public class Repaso {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        String poblacion;
        String nombreUsuario;
        int habitantes=0,total=0;

        for (int i=1;i<=5;i++){
            System.out.println("Indica tu nombre->");
            nombreUsuario= sn.nextLine();sn.nextLine();
            System.out.println("Indica la Provincia");
            poblacion= sn.nextLine();sn.nextLine();
            System.out.println("Indique el numero de habitantes");
            habitantes= sn.nextInt();sn.nextLine();



            if (habitantes<20000){
                i--;
                System.out.println("Los habitantes de "+ poblacion + " son mas de "+ habitantes + ". Vuelve a insertar la informacion. ");

            }else {
                total+=habitantes;
            }

        }
        System.out.println("El numero de habitantes de la Provincia de CLM es "+ total);

    }
}
