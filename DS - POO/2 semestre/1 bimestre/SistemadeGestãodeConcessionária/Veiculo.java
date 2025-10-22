package SistemadeGestãodeConcessionária;
public class Veiculo {
    String modelo;
    String placa;
    int ano;
    
    public void exibirInfo(){
        System.out.println("--- Veiculos ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano do veiculo: " + ano);
        System.out.println("----------------");
    }
}
