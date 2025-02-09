package fundamentos;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pessoa1 = sc.nextLine();
        int idade1 = sc.nextInt();
        sc.nextLine();
        String pessoa2 = sc.nextLine();
        int idade2 = sc.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.println("A diferença de idade entre " + pessoa1 + " e " + pessoa2 + " é de " + diferenca + " anos.");

        sc.close();
    }
}
