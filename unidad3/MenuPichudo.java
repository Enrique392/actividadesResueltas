package unidad3;

import javax.swing.*;

public class MenuPichudo {
    public static void main(String[] args) {
        String menu="";
        byte opcion=0;
        char simbolo=' ';
        String salida=" ";
        int operando1,operando2,resultado=0,resultadoUser=0,contador=0;
        do {

       //     menu=" ";
       //     menu+="+++++Menu +++++"
       //     menu+="1. SUMAR"
       //     menu+=
       //     menu+=

         operando1= (int) (Math.random() * 100 + 1);
         operando2= (int) (Math.random() * 100 + 1);

         switch (opcion){
             case 1->{
                 simbolo= '+';
                 resultado=operando1+operando2;
                 salida=operando1+" "+simbolo+operando2;
             }
         }






++contador;
        }while (opcion!=4 && resultado==resultadoUser);
        --contador;
        JOptionPane.showMessageDialog(null,contador);

    }
}
