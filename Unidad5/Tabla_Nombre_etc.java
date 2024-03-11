package Unidad5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


//hacemos una tabla donde se solicita al usuario que rellene una tabla con la siguiente informacion
// nombre apellido prefesion email
public class Tabla_Nombre_etc {
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {

        mostrarAlumnos(alumnosDatos());
    }

    public static String[][]alumnosDatos(){
        //leemos los datos de los alumnos y lo guardamos en el Array

        System.out.println("Indique la cantidad de personas ->");
        int p= sn.nextInt();

        String [][]alumnos=new String[p][4];
        for (int i = 0; i < p; i++) {
         if (i>=1){
             System.out.println("");
         }
            System.out.println("Datos de la persona Nº "+(i+1));

            for (int j = 0; j < 4; j++) {
                //si la columna es 0-> Nombre
                if (j==0){
                    System.out.print("Indica el nombre->");
                    alumnos[i][j]= sn.next();sn.nextLine();
                }
                //si la columna es 1-> Apellido
                if (j==1){
                    System.out.print("Indica el apellido->");
                    alumnos[i][j]= sn.next();sn.nextLine();
                }
                //si la columna es 2-> profesion
                if (j==2){
                    System.out.print("Indica la profesion->");
                    alumnos[i][j]= sn.next();sn.nextLine();
                }
                //si la columna es 3-> email
                if (j==3){
                    System.out.print("Indica el email->");
                    alumnos[i][j]= sn.next();sn.nextLine();
                }
            }
        }

        return alumnos;
    }

    // Funcion que muestra la informacion ordenada por el nombre del alumno y forma la tabla


    public static void mostrarAlumnos(String[][]alumnos){

        Arrays.sort(alumnos, Comparator.comparing(a -> a[0]));
        System.out.println("|Nombre |Apellido |Profesion |Email|");
        for (String fila[]:alumnos){
            for (String col:fila){
                System.out.print(col+"\t");
            }
            System.out.println("");
        }
     //   System.out.println(Arrays.deepToString(alumnos));



    }

}
