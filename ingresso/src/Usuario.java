public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean logado = false;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public boolean isLogado() { return logado; }

    public boolean realizarLogin(String senha) {
        if (this.senha != null && this.senha.equals(senha)) {
            this.logado = true;
            return true;
        }
        return false;
    }

    public void realizarLogoff() {
        this.logado = false;
    }

    public void alterarDados(String novoNome, String novoEmail) {
        if (novoNome != null && !novoNome.isEmpty()) this.nome = novoNome;
        if (novoEmail != null && !novoEmail.isEmpty()) this.email = novoEmail;
    }

    public boolean alterarSenha(String senhaAtual, String novaSenha) {
        if (this.senha != null && this.senha.equals(senhaAtual)) {
            this.senha = novaSenha;
            return true;
        }
        return false;
    }
}