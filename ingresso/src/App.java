public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Teste de Ingressos ===");
        MeiaEntrada meia = new MeiaEntrada(20.0, "Filme X", true);
        System.out.println(meia.getNomeFilme() + " - Valor informado: " + meia.getValor() + " -> Valor real: " + meia.valorReal());

        IngressoFamilia fam = new IngressoFamilia(15.0, "Filme Família", false, 4);
        System.out.println(fam.getNomeFilme() + " - Pessoas: " + fam.getNumeroPessoas() + " -> Valor real: " + fam.valorReal());

        System.out.println("\n=== Teste de Usuários ===");
        Gerente gerente = new Gerente("Alice", "alice@cinema.com", "senha123");
        Vendedor vendedor = new Vendedor("Bruno", "bruno@cinema.com", "v123");
        Atendente atendente = new Atendente("Carla", "carla@cinema.com", "a123");

        System.out.println("Gerente admin? " + gerente.isAdministrador());
        System.out.println("Vendedor admin? " + vendedor.isAdministrador());
        System.out.println("Atendente admin? " + atendente.isAdministrador());

        vendedor.realizarVenda();
        vendedor.realizarVenda();
        System.out.println("Vendas do vendedor: " + vendedor.consultarVendas());

        atendente.receberPagamento(50.0);
        atendente.receberPagamento(30.0);
        System.out.println("Valor em caixa antes de fechar: " + atendente.getValorEmCaixa());
        double fechado = atendente.fecharCaixa();
        System.out.println("Fechado: " + fechado + " -> Caixa agora: " + atendente.getValorEmCaixa());

        System.out.println("\n=== Teste de Relógios ===");
        RelogioBrasileiro rb = new RelogioBrasileiro(21, 30, 45);
        RelogioAmericano ra = new RelogioAmericano(9, 15, 0);

        System.out.println("Brasileiro: " + rb.horaFormatada());
        System.out.println("Americano: " + ra.horaFormatada());

        
        ra.sincronizarCom(rb);
        System.out.println("Americano sincronizado com brasileiro: " + ra.horaFormatada());

        
        rb.sincronizarCom(ra);
        System.out.println("Brasileiro sincronizado com americano: " + rb.horaFormatada());
    }
}
