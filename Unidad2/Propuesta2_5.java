package Unidad2;

import java.util.Scanner;

public class Propuesta2_5 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);

        System.out.println("indique el aforo maximo" );
        int aforo = sn.nextInt();

        System.out.println("Ingrese el precio de las entradas ");
        double entradasPrecio = sn.nextDouble();

        System.out.println("Cantidad de entradas vendidas");
        int entradasVendidas = sn.nextInt();
        double entradasDescuento=entradasPrecio-(entradasPrecio*25/100);
        double gananciaDescuento=entradasDescuento*entradasVendidas;
        double ganancia=entradasPrecio*entradasVendidas;

        if (entradasVendidas<(aforo*20/100)) {
            System.out.println("Entradas insuficientes, se cancela el cocnierto");
        }else{if (entradasVendidas<aforo*50/100) {
            System.out.println("La recaudacion de las ventas de entradas fue de "+gananciaDescuento);
        }else{
            System.out.println("La recaudacion total del conicerto fue de "+ganancia);
        }}
















    }
}
