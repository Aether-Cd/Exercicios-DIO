public class Atendente extends Usuario {
    private double valorEmCaixa = 0.0;
    private final boolean administrador = false;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    public void receberPagamento(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor do pagamento não pode ser negativo");
        this.valorEmCaixa += valor;
    }

    public double fecharCaixa() {
        double fechado = this.valorEmCaixa;
        this.valorEmCaixa = 0.0;
        return fechado;
    }
}