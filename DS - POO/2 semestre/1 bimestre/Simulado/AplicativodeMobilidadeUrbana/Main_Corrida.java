package AplicativodeMobilidadeUrbana;
public class Main_Corrida {
    public static void main(String[] args) {
        Corrida c1 = new Corrida();
        
        c1.distanciaPercorrida = 5;
        c1.tarifaBase = 10;
        c1.multiplicadorTarifa = 2;
        c1.exibirInfo();
        c1.calcularValorTotal();
    }
    
}
