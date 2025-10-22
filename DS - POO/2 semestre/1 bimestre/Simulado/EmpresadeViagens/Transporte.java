package EmpresadeViagens;
public class Transporte {
    int capacidade;
    double precoBase;

    public Transporte(int capacidade, double precoBase) {
        this.capacidade = capacidade;
        this.precoBase = precoBase;
    }

    public double calcularValorPassagem() {
        return precoBase;
    }

    public void exibirInfo() {
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Preço base: R$" + precoBase);
    }
}

