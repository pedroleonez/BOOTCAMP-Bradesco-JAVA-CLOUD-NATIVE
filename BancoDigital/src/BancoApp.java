import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Banco Digital");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Criar Conta Poupança");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Transferir");
            System.out.println("6. Listar Contas");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                case 2:
                    System.out.print("Digite o nome do cliente: ");
                    scanner.nextLine(); // Consumir quebra de linha
                    String nome = scanner.nextLine();
                    Cliente cliente = new Cliente(nome);
                    Conta novaConta = (opcao == 1) ? new ContaCorrente(cliente) : new ContaPoupanca(cliente);
                    banco.adicionarConta(novaConta);
                    System.out.println("Conta criada com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite o número da conta: ");
                    int numeroContaDep = scanner.nextInt();
                    Conta contaDep = banco.buscarConta(numeroContaDep);
                    if (contaDep != null) {
                        System.out.print("Digite o valor do depósito: ");
                        double valorDep = scanner.nextDouble();
                        contaDep.depositar(valorDep);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número da conta: ");
                    int numeroContaSaq = scanner.nextInt();
                    Conta contaSaq = banco.buscarConta(numeroContaSaq);
                    if (contaSaq != null) {
                        System.out.print("Digite o valor do saque: ");
                        double valorSaq = scanner.nextDouble();
                        contaSaq.sacar(valorSaq);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o número da conta de origem: ");
                    int numOrigem = scanner.nextInt();
                    Conta contaOrigem = banco.buscarConta(numOrigem);

                    if (contaOrigem != null) {
                        System.out.print("Digite o número da conta de destino: ");
                        int numDestino = scanner.nextInt();
                        Conta contaDestino = banco.buscarConta(numDestino);

                        if (contaDestino != null) {
                            System.out.print("Digite o valor da transferência: ");
                            double valorTransf = scanner.nextDouble();
                            contaOrigem.transferir(valorTransf, contaDestino);
                        } else {
                            System.out.println("Conta de destino não encontrada.");
                        }
                    } else {
                        System.out.println("Conta de origem não encontrada.");
                    }
                    break;

                case 6:
                    banco.listarContas();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}