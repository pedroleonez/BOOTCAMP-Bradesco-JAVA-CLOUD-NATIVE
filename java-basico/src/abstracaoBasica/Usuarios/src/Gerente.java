public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.setAdministrador(true);
    }

    public void gerarRelatorioFinanceiro() {
        if (!this.getLogado()) {
            System.out.println("Usuário não está logado.");
            return;
        }
        System.out.println("Gerando relatório financeiro...");
    }

    public void consultarVendas() {
        if (!this.getLogado()) {
            System.out.println("Usuário não está logado.");
            return;
        }
        System.out.println("Consultando vendas...");
    }
}
