public class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int numeroPessoas) {
        super(valor, nomeFilme, dublado);
        if (numeroPessoas <= 0) throw new IllegalArgumentException("Número de pessoas deve ser >= 1");
        this.numeroPessoas = numeroPessoas;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        if (numeroPessoas <= 0) throw new IllegalArgumentException("Número de pessoas deve ser >= 1");
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double valorReal() {
        double total = valor * numeroPessoas;
        if (numeroPessoas > 3) {
            total = total * 0.95; 
        }
        return total;
    }
}