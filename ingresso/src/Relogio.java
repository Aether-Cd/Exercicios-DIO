public abstract class Relogio {
    protected int hora;    
    protected int minuto;  
    protected int segundo; 

    public Relogio() {
        this(0,0,0);
    }

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora deve estar entre 0 e 23");
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) throw new IllegalArgumentException("Minuto inválido");
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) throw new IllegalArgumentException("Segundo inválido");
        this.segundo = segundo;
    }

    public String horaFormatada() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    public abstract void sincronizarCom(Relogio outro);
}