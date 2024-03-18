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
* */
public class ExamenMenu2 { //estas variables y Scanner se utilizaran en diversas funciones, por eso se encuentran aqui.
    static Scanner sn=new Scanner(System.in);
    static byte cantidad=0;
    static int[] clientes=new int[0];
    static byte indice=0;
    static byte opcion;
    static byte contador;

    public static void main(String[] args) {
        //Creamos la funcion main, esta la mantemenos lo mas vacia posible
        inicio();
    }
    public static void inicio(){ //esta funcion sera nuestra funcion principal, aqui el usuario decide que accion tomar
        System.out.println("|-----------------------------------|");
        System.out.println("| Bienvenido al nuestro restaurante |");
        System.out.println("|                                   |");
        System.out.println("| 1. Crear Orden                    |");
        System.out.println("| 2. Modificar/confirmar Orden      |");
        System.out.println("| 3. Salir                          |");
        System.out.println("|___________________________________|");
        opcion= sn.nextByte(); //esta variable sera utilizada luego para un switch

        menu1(opcion); //aqui llamamos a la funcion "menu1" donde se utilizara la variable "opcion"
    }
    static void menu1(byte opcion){ //En esta funcion esta el switch cada caso realiza una accion distinta y todas llevan a la funcion "inicio de una u otra manera
        switch (opcion){
            case 1->{ // este case nos permite extender el array y darle el valor que el usuario indique
                if (contador==0) { //este if evita que el usuario genera mas de un pedido a la vez (no se como hacer uno nuevo de forma facil, me quiero ahorrar problemas)
                    System.out.println("Por favor indique la cantidad de personas que van a ordenar (maximo 6) ");
                    cantidad = sn.nextByte();
                    if (cantidad<=0 || cantidad>6) { // con este if nos aseguramos de que el usuario no sobrepase el limite
                        System.err.println("La cantidad indicada no se encuentra en el limite, por favor indique un numero del 1 al 6");
                        menu1(opcion);
                    } else {
                        clientes = Arrays.copyOf(clientes, clientes.length + cantidad);
                    }
                    contador++;
                    menu2();//llamamos a la funcion "menu2" donde se encuentra el menu del restaurante
                }else {
                    System.out.println("Ya realizo un pedido. Por favor termine este pedido antes de empezar otro");
                    inicio();
                }
            }
            case 2-> { //este case se encarga de enseñarle al usuario su orden
                System.out.println("Su orden es:");
                if (contador==1){
                    for (int i = 0; i < clientes.length; i++) { //este for se encarga de generar una lista de forma ordenada para que cada pedido coincida con el cliente que lo pidio
                        System.out.println("El cliente "+(i+1)+" pidio el menu "+clientes[i]);
                    }
                    System.out.println("la orden es correcta\t1. Si\t2. No");
                    byte confirmar=sn.nextByte();
                    if (confirmar==1){ //este if se encarga de saber si el usuario desea cambiar o no la orden
                        System.out.println("Gracias por su compra, vuelva pronto \uD83D\uDE01");
                        System.exit(0);
                    }else if (confirmar==2){
                        arreglar();
                    }else { //si el usuario ingresa cualquier numero que no sea 1 o 2 se le devolvera al inicio del case para que ingrese un numero valido
                        System.err.println("El numero indicado no es valido, Por favor indique una opcion valida");
                        menu1(opcion);
                    }
                }else {
                    System.out.println("Primero veces realizar un pedido");
                    inicio();
                }
            }
            case 3->{ //el case mas sencillo :) Este solo le da la despedida al usuario de la forma mas amigable posible
                if (contador>0){
                    System.out.println("Su pedido fue cancelado\uD83D\uDE21 Gracias por hacernos perder el tiempo.\nNo vuelva pronto\uD83D\uDE01");
                }else {
                    System.out.println("Gracias por si visita, vuelva pronto \uD83D\uDE01");
                }

                System.exit(0);
            }
            default -> { //el defaul se encarga que si el usuario ingresa un numero invalido sea devuelto al inicio para que pueda escoger nuevamente
                System.err.println("Respuesta no valida");
                inicio();
            }
        }
    }
    static void menu2(){ //este funcion como se dijo antes contiene el menu de el restaurante
        System.out.println("\n*******************MENU*******************");
        System.out.println("                                          ");
        System.out.println(" 1. Patatas fritas con albóndigas         ");
        System.out.println(" 2. Salmón ahumado con patatas horneadas  ");
        System.out.println(" 3. Lentejas con chorizo                  ");
        opcion= sn.nextByte(); //esta variable sera utilizada para el switch que viene

        extras(opcion); //llamamos a la funcion que contiene un switch usando la variable anterior
    }
    static void extras(byte opcion){ //este switch se encarga de indicarle al usuario el plato que pidio
        switch (opcion){
            case 1->{
                System.out.println("El cliente "+ (indice+1)+" ordenó el menu 1"); //al indice se le suma 1 para que sea mas entendible para el usuario
                clientes[indice]=1; //asignamos el valor/la opcion escogida por el usuario
                indice++; //aumentamos el valor de "indice" para cambiar de cliente
            }
            case 2->{ //este case hace lo mismo que el case 1 pero con la opcion 2
                System.out.println("El cliente "+ (indice+1)+" ordenó el menu 2");
                clientes[indice]=2;
                indice++;
            }
            case 3->{ //este case hace lo mismo que el case 1 pero con la opcion 3
                System.out.println("El cliente "+ (indice+1)+" ordenó el menu 3");
                clientes[indice]=3;
                indice++;
            }
                default -> { //el default se encarga de devolver al usuario al menu2 en
                    // caso de ingresar un valor invalido, el mensaje aparecera en rojo para que sea mas llamativo para el usuario
                    System.err.println("Respuesta no valida");
                    menu2();
                }
            }
            if (indice < clientes.length){ //este if else se encarga de sacar al usuario de esta funcion cuando todos lo clientes tengan su pedidp
                menu2();
            }else {
                inicio();
            }
        }
        static void arreglar(){ //esta funcion esta medio fea pero no quise pensar mas, le enseña al usuario las opciones y cambia la orden del cliente que haya indicado
        // se puede mejorar y llamar a la funcion menu2 pero genera unos porblemas y prefiero ahorarmelos
        byte editar,nuevaOrden;
            System.out.println("Indique el numero de cliente del cual quiere editar la orden");
            editar= sn.nextByte();
            indice= (byte) (editar-1); //de restamos 1 para que el cliente y el valor del array coincidan
            System.out.println("\n*******************MENU*******************");
            System.out.println("                                          ");
            System.out.println(" 1. Patatas fritas con albóndigas         ");
            System.out.println(" 2. Salmón ahumado con patatas horneadas  ");
            System.out.println(" 3. Lentejas con chorizo                  ");
            opcion= sn.nextByte();

            clientes[indice]=opcion; //remplazamos el valor anterior con el nuevo
            indice= (byte) (cantidad-1); //aumentamos nuevamente el valor de indice por si el usuario desea hacer algun otro cambio mas adelante
            opcion=2; //hacemos esto para que devuelva al usuario al menu1 case 2
            menu1(opcion); // devolvemos el usuario al menu
        }
}
