package estruturasDeControle;

import java.util.Scanner;

public class NNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número inicial: ");
        int numeroInicial = scanner.nextInt();

        while (true) {
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();

            if (numero < numeroInicial) {
                System.out.println("Número menor que o número inicial. Ignorado.");
                continue;
            }

            if (numero % numeroInicial != 0) {
                System.out.println("O número " + numero + " não é divisível por " + numeroInicial + ". Finalizando execução.");
                break;
            }

            System.out.println("O número " + numero + " é divisível por " + numeroInicial + ".");
        }

        scanner.close();
    }
}
