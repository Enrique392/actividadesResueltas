package Unidad2;

import java.util.Scanner;

public class Actividades2_14 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int dia=0,mes=0,year=0;

        System.out.println("Ingrese el dia");
        dia=sn.nextInt();

        System.out.println("Ingrese el mes");
        mes=sn.nextInt();

        System.out.println("Ingrese los segundos");
        year=sn.nextInt();
        int diaNuevo= dia+1;

        switch (mes) {

            case 1,3,5,7,8,10,12: {if(diaNuevo>=31) {diaNuevo-=31;mes=mes+1;}
                if (mes>=12) {mes-=12;year=year+1;}}
            break;
            case 4,6,9,11: {if(diaNuevo>=30) {diaNuevo-=30;mes=mes+1;}
                if (mes>=12) {mes-=12;year=year+1;}}
            break;

            case 2: {if(diaNuevo>=28) {diaNuevo-=28;mes=mes+1;}
                if (mes>=12) {mes-=12;year=year+1;}}
            break;
           default:
                System.err.println("Fecha Invalida");
        }

        //if (diaNuevo>=31) {diaNuevo-=60;mes=mes+1;}
        //if (mes>=12) {mes-=12;year=year+1;}
        //if (year>=24) {year-=24;}

        System.out.println("la fecha actual es "+diaNuevo+"."+mes+"."+year);


    }
}
