package unidad4;

import java.util.Scanner;

public class Actividad4_5 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        boolean es;

        System.out.println("Ingrese cualquier letra") ;
        char vocal=sn.next().charAt(0);

        es=comprobar(vocal);

        System.out.println("La letra indicada es vocal? \n"+ es);

    }
    public static boolean comprobar(char letra){
        boolean si=true;

        if (letra=='a'||letra=='A'||letra=='e'||letra=='E'||letra=='i'|| letra=='I'||letra=='o'||letra=='O'||letra=='u'||letra=='U'){
            si=true;
        }else si=false;


        return si;

    }

}
