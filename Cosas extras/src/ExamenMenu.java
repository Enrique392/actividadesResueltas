import java.util.Arrays;
import java.util.Scanner;

/*Instrucciones
Desarrolla un programa java para ser usado por los camareros de un restaurante, que sirva para tomar nota de los menús que los clientes van a tomar.
Primero, realiza un menú, por ejemplo-> [1. Crear Orden | 2. Modificar Orden | 3. Salir]
Primer dato a introducir por el camarero es el número de comensales que tendrá que estar en el rango de 1-6,
ya que no hay mesas de más de cinco comensales. El valor introducido debe asegurarse de que se encuentra en el rango definido.
Entonces el camarero tiene que introducir el menú seleccionado por cada cliente.
Tenemos tres menús: #1,#2 y #3. Puedes identificar cada menú por el número: menú 1, menú 2 o menú 3.
Una vez introducidos todos los datos, el programa imprimirá por pantalla los menús solicitados por cada comensal.
Tienes que emplear un array para registrar los menús que tomará cada comensal.
Ten en cuenta que la dimensión de dicho array tendrá que definirse en ejecución, ya que no sabemos a priori cuántos comensales vamos a tener.
Adicional, confirma la orden con los comensales y si existe alguna modificación, tener la posibilidad de cambiar la orden.
EJEMPLO DE SALIDA:

   Introduce el número de comensales (máximo 6):3

           - MENÚ -

   [1] Patatas fritas con albóndigas

   [2] Salmón ahumado con patatas horneadas

   [3] Lentejas con chorizo

   Introduce el menú pedido por el comensal 1 :1

   Introduce el menú pedido por el comensal 2 :2

   Introduce el menú pedido por el comensal 3 :3

            - ORDEN -

   Comensal 1 va a tomar el menú ->1

   Comensal 2 va a tomar el menú ->2

   Comensal 3 va a tomar el menú ->3

   ¿La orden es correcta? [1-Si] [2-No]->2

   Indique que comensal modificar->1

   Introduce el menú pedido por el comensal 1 :2

            - ORDEN -

   Comensal 1 va a tomar el menú ->2

   Comensal 2 va a tomar el menú ->2

   Comensal 3 va a tomar el menú ->3

   ¿La orden es correcta? [1-Si] [2-No]->2

   Indique que comensal modificar->2

   Introduce el menú pedido por el comensal 2 :1

            - ORDEN -

   Comensal 1 va a tomar el menú ->2

   Comensal 2 va a tomar el menú ->1

   Comensal 3 va a tomar el menú ->3

   ¿La orden es correcta? [1-Si] [2-No]->1

   Gracias, en breve le traemos la comida.
*
*
*
* */
public class ExamenMenu {
    static Scanner sn=new Scanner(System.in);
    static byte cantidad=0;
    static int[][] clientes=new int[0][1];
    static byte indice=0;

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        System.out.println("|-----------------------------------|");
        System.out.println("| Bienvenido al nuestro restaurante |");
        System.out.println("|                                   |");
        System.out.println("| 1. Crear Orden                    |");
        System.out.println("| 2. Modificar Orden                |");
        System.out.println("| 3. Salir                          |");
        System.out.println("|___________________________________|");
        byte opcion= sn.nextByte();

        menu1(opcion);
    }




    static void menu1(byte opcion){
        switch (opcion){
            case 1->{
                System.out.println("Porfavor indique la cantidad de personas que van a ordenar (maximo 6) ");
                cantidad= sn.nextByte();
                // Crear un nuevo array con la longitud adecuada
                int[][] clientesNuevos = new int[clientes.length + cantidad][1];

                // Copiar elementos del array original al nuevo
                for (int i = 0; i < clientes.length; i++) {
                    clientesNuevos[i] = clientes[i];
                }

                // Asignar el nuevo array a la variable clientes
                clientes = clientesNuevos;
                System.out.println(Arrays.deepToString(clientes));
                menu2();

            }



        }
    }

    static void menu2(){
        byte opcion;
        System.out.println(Arrays.deepToString(clientes));
        System.out.println("********************MENU********************");
        System.out.println("1. Patatas fritas con albóndigas............");
        System.out.println("2. Salmón ahumado con patatas horneadas.....");
        System.out.println("3. Lentejas con chorizo.....................");
        System.out.println("4. Volver al menu ");
        opcion= sn.nextByte();

            do {
                extras(opcion);
                menu2();
            }while(indice!=cantidad);

        System.out.println(Arrays.deepToString(clientes));
    }



    static void extras(byte opcion){
        System.out.println(indice);
        switch (opcion){

            case 1->{
                System.out.println("El cliente "+ (indice+1)+" ordenó el menu 1");
                clientes[indice][0]=1;
                indice++;

            }
            case 2->{
                System.out.println("El cliente "+ (indice+1)+" ordenó el menu 2");
                clientes[indice][0]=2;
                indice++;
            }
            case 3->{
                System.out.println("El cliente "+ (indice+1)+" ordenó el menu 3");
                clientes[indice][0]=3;
                indice++;
            }
            case 4-> inicio();

                default -> {
                    System.err.println("Respuesta no valida");
                    menu2();
                }
            }
        }


}
