import java.util.Scanner;
import java.util.Scanner;
public class DivisoresPrimosLista {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            System.out.println("Divisores primos de " + numero + ":");
            listarDivisoresPrimos(numero);

            scanner.close();
        }

        // Función para verificar si un número es primo
        private static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }

            return true;
        }

        // Función para listar los divisores primos de un número
        private static void listarDivisoresPrimos(int numero) {
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0 && esPrimo(i)) {
                    System.out.println(i);
                }
            }
        }
    }


