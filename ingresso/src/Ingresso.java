public abstract class Ingresso {
    protected double valor;
    protected String nomeFilme;
    protected boolean dublado; 

    public Ingresso(double valor, String nomeFilme, boolean dublado) {
        if (valor < 0) throw new IllegalArgumentException("Valor não pode ser negativo");
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor não pode ser negativo");
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public abstract double valorReal();
}
