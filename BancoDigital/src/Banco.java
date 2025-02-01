import java.util.ArrayList;
import java.util.List;

class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void listarContas() {
        System.out.println("\n--- Lista de Contas ---");
        for (Conta conta : contas) {
            conta.imprimirExtrato();
            System.out.println("----------------------");
        }
    }
}
