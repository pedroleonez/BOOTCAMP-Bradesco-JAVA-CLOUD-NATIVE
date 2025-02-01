import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaDeBanho maquina = new MaquinaDeBanho();

        while (true) {
            System.out.println("\nMENU INTERATIVO - PET SHOP");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("10 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    maquina.darBanho();
                    break;
                case 2:
                    maquina.abastecerAgua();
                    break;
                case 3:
                    maquina.abastecerShampoo();
                    break;
                case 4:
                    maquina.verificarAgua();
                    break;
                case 5:
                    maquina.verificarShampoo();
                    break;
                case 6:
                    maquina.verificarPetNoBanho();
                    break;
                case 7:
                    maquina.colocarPet();
                    break;
                case 8:
                    maquina.retirarPet();
                    break;
                case 9:
                    maquina.limparMaquina();
                    break;
                case 10:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}