package EmpresadeViagens;
public class Aviao extends Transporte{
  double taxaDeAeroporto;

    public Aviao(int capacidade, double precoBase, double taxaDeAeroporto) {
        super(capacidade, precoBase);
        this.taxaDeAeroporto = taxaDeAeroporto;
    }

    @Override
    public double calcularValorPassagem() {
        return precoBase + taxaDeAeroporto;
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Transporte: Aviao ---");
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Preco base: R$" + precoBase);
        System.out.println("Taxa de aeroporto: R$" + taxaDeAeroporto);
        System.out.println("--------------------------");
    }
}
