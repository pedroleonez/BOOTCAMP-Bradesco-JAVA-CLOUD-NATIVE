public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private Boolean administrador;
    private Boolean logado = true;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public Boolean getLogado() {
        return logado;
    }

    public void setLogado(Boolean logado) {
        this.logado = logado;
    }

    public void realizarLogin() {
        if (this.logado) {
            System.out.println("Usuário já está logado.");
            return;
        }
        System.out.println("Realizando login...");
    }

    public void realizarLogoff() {
        if (!this.logado) {
            System.out.println("Usuário já está deslogado.");
            return;
        }
        System.out.println("Realizando logoff...");
    }

    public void alterarDados(String novoEmail) {
        System.out.println("Alterando dados...");
        this.email = novoEmail;
    }

    public void alterarSenha(String novaSenha) {
        System.out.println("Alterando senha...");
        this.senha = novaSenha;
    }
}
