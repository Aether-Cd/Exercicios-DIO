public class RelogioAmericano extends Relogio {

    public RelogioAmericano() { super(); }
    public RelogioAmericano(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    @Override
    public void setHora(int hora) {
        if (hora < 1) {
            throw new IllegalArgumentException("Hora americana deve estar entre 1 e 12");
        }
        if (hora > 12) {
            int h = hora % 12;
            if (h == 0) h = 12;
            this.hora = h;
        } else {
            this.hora = hora;
        }
    }

    @Override
    public void sincronizarCom(Relogio outro) {
        int h = outro.getHora();
        int m = outro.getMinuto();
        int s = outro.getSegundo();

        int conv = h % 12;
        if (conv == 0) conv = 12;
        setHora(conv);
        setMinuto(m);
        setSegundo(s);
    }
}