package unidad3;

import java.util.Scanner;

public class Actividad3_12 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int nota;
        String suspenso="";
        boolean flag=false;
        System.out.println("Verifique sus notas");
       // System.out.println("************************");

        for (int cuenta=1;cuenta<=5;cuenta++){
            System.out.println("Ingrese la nota->");
            nota= sn.nextInt();
            if (5>nota){
                suspenso+="tienes suspendida la nota-> "+cuenta+" con  "+nota+"\n";
                flag=true;
            }
        }
        if (!flag){
            System.out.println("No tienes ningun suspenso");
        }else System.out.println(suspenso);




    }
}
