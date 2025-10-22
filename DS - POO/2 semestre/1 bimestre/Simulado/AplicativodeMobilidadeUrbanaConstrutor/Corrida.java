package AplicativodeMobilidadeUrbanaConstrutor;
public class Corrida {

    public Corrida(double distanciaPercorrida, double tarifaBase, double multiplicadorTarifa) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.tarifaBase = tarifaBase;
        this.multiplicadorTarifa = multiplicadorTarifa;
    }
    double distanciaPercorrida;
    double tarifaBase;
    double multiplicadorTarifa;
    
    public void calcularValorTotal(){
        System.out.println("O valor da corrida ficou: R$" + (tarifaBase + (distanciaPercorrida * multiplicadorTarifa)));
    }
    public void exibirInfo(){
        System.out.println("--- Corrida Urbana ---");
        System.out.println("Distancia Percorrida: " + distanciaPercorrida + "km");
        System.out.println("Tarifa Base: R$" + tarifaBase);
        System.out.println("Multiplicador da Tarifa: " + multiplicadorTarifa + "x");
        System.out.println("----------------------");
    }
}
