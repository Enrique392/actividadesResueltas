package unidad1;

/**Teniendo como base, que el 100% de un colegio esta formado por todos alumnos,
 * solicita cuantas niñas y cuantos niños hay, e indica el porcentaje de cada uno.
 * Existe 84 niñas y 78 niños, el 100% de los niños son 162 niños,
 *
 * 51.85% son niñas
 * 48.148 son niños
 *
 * Recordemos la regla de tres: 162 total - 100%
 *                              84 niñas  -  x
 */
import java.util.concurrent.LinkedTransferQueue;
import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {

        //mio
        int ninos, ninas;
        double total,promedio, promedio2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de niñas");
        ninas = sc.nextInt();
        System.out.println("Cantidad de niños");
        ninos = sc.nextInt();
        total = (ninas + ninos);
        promedio = (ninas*100/total);
        promedio2 = (100-promedio);
        System.out.println("El porcentaje de niñas es " + promedio);
        System.out.println("El promedio de niños es " + promedio2);

        //Profe

        Scanner sn=new Scanner(System.in);
        System.out.println("Indica cuantas niñas hay matriculada");
        short girl=sn.nextShort();
        System.out.println("Indica cuantas niños hay matriculada");
        short boy= sn.nextShort();
        double totalMatriculados=girl+boy;
        double porcentajeNinas=(double) (girl*100/totalMatriculados);
        double porcentajeNinos=(double) (boy *100/totalMatriculados);
        System.out.println("El porccentaje de niñas es " + porcentajeNinas);
        System.out.println("EL porcentaje de niños es " + porcentajeNinos);


    }
}
