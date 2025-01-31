class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double saldoDevedorChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.chequeEspecial = (depositoInicial <= 500) ? 50 : depositoInicial * 0.5;
        this.saldoDevedorChequeEspecial = 0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return chequeEspecial;
    }

    public boolean estaUsandoChequeEspecial() {
        return saldo < 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        if (saldoDevedorChequeEspecial > 0) {
            double taxa = saldoDevedorChequeEspecial * 0.2;
            double totalDevido = saldoDevedorChequeEspecial + taxa;

            if (valor >= totalDevido) {
                valor -= totalDevido;
                saldoDevedorChequeEspecial = 0;
            } else {
                saldoDevedorChequeEspecial -= valor;
                return;
            }
        }

        saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    
}

public class BancoApp {
}
