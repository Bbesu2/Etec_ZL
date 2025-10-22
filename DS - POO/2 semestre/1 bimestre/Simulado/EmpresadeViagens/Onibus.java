package EmpresadeViagens;
public class Onibus extends Transporte{
    int numeroAssentos;

    public Onibus(int capacidade, double precoBase, int numeroAssentos) {
        super(capacidade, precoBase);
        this.numeroAssentos = numeroAssentos;
    }

    @Override
    public double calcularValorPassagem() {
        return precoBase; 
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Transporte: Onibus ---");
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Preco base: R$" + precoBase);
        System.out.println("Numero de assentos: " + numeroAssentos);
        System.out.println("--------------------------");
    }
}
