import java.util.Scanner;
public class DivisoresLista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            System.out.println("Divisores de " + numero + ":");
            listarDivisores(numero);

            scanner.close();
        }

        // Función para listar los divisores de un número
        private static void listarDivisores(int numero) {
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }


