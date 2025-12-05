public class RelogioBrasileiro extends Relogio {

    public RelogioBrasileiro() { super(); }
    public RelogioBrasileiro(int hora, int minuto, int segundo) { super(hora, minuto, segundo); }

    @Override
    public void sincronizarCom(Relogio outro) {
        int h = outro.getHora();
        int m = outro.getMinuto();
        int s = outro.getSegundo();

        try {
            setHora(h);
        } catch (IllegalArgumentException ex) {
            int adjusted = Math.max(0, Math.min(23, h));
            setHora(adjusted);
        }
        setMinuto(m);
        setSegundo(s);
    }
}