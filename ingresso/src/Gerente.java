public class Gerente extends Usuario {
    private final boolean administrador = true;

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public String gerarRelatorioFinanceiro() {
        return "Relatório financeiro gerado por " + nome;
    }

    public String consultarVendas() {
        return "Consulta de vendas realizada por " + nome;
    }
}