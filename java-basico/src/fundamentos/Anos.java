package fundamentos;

import java.util.Scanner;

public class Anos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        int idade = sc.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        sc.close();
    }
}
