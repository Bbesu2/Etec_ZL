package SistemadeGestãodeConcessionária;
public class Carro extends Veiculo{
    
    int numPortas;
    
    @Override
    public void exibirInfo(){
        System.out.println("--- Veiculos ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano do veiculo: " + ano);
        System.out.println("Numero de portas: " + numPortas);
        System.out.println("----------------");
    }
}
