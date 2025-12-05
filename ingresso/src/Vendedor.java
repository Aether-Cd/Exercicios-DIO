public class Vendedor extends Usuario {
    private int quantidadeVendas = 0;
    private final boolean administrador = false;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        if (quantidadeVendas < 0) throw new IllegalArgumentException("Quantidade de vendas não pode ser negativa");
        this.quantidadeVendas = quantidadeVendas;
    }

    public void realizarVenda() {
        this.quantidadeVendas++;
    }

    public int consultarVendas() {
        return quantidadeVendas;
    }
}