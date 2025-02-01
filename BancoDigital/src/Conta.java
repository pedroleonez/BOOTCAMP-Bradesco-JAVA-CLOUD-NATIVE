abstract class Conta {
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = 1; // Padrão para todas as contas
        this.numero = SEQUENCIAL++;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$%.2f realizado com sucesso!\n", valor);
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso!\n", valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
            return true;
        }
        return false;
    }

    public void imprimirExtrato() {
        System.out.printf("Titular: %s\n", cliente.getNome());
        System.out.printf("Agência: %d\n", agencia);
        System.out.printf("Número da Conta: %d\n", numero);
        System.out.printf("Saldo: R$%.2f\n", saldo);
    }

    public int getNumero() {
        return numero;
    }
}
