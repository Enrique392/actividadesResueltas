package Unidad2;

import java.util.Scanner;

public class Actividad2_7 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int mayor = 0, menor= 0, medio= 0;

        System.out.println("Introduce el primero numero");
        int x = sn.nextInt();

        System.out.println("Introduce el segundo numero");
        int y = sn.nextInt();

        System.out.println("Introduce el tercer numero");
        int z = sn.nextInt();

        if (z>x && z>y) {mayor=z;}else {if (x>z && x>y) {
        mayor=x;}else {if (y>z && y>x) {
            mayor = y;}}}
        if (z>x && z>y) {mayor=z;}else {if (x > z && x>y) {
            mayor=x;}else {if (y > z && y > x) {
            mayor=y;}}}

        if (z>x&&z<y) {medio=z;}else {if (x>z && x<y) {
            medio=x;}else {if (y>z&& y<x) {
            medio=y;}}}

        if (z<x && z<y) {menor=z;}else{ if (x<z&&x<y) {
            menor=x;}else {if (y<z&&y<x) {
            menor=y;}}}

        System.out.println("El mayor es "+ mayor+ " el medio es "+medio+" el menor es "+ menor);

    }
}