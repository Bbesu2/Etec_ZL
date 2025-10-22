package SistemadeGestãodeConcessionária;
public class Moto extends Veiculo{
    
    int cilindradas;
    
    @Override
    public void exibirInfo(){
        System.out.println("--- Veiculos ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano do veiculo: " + ano);
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("----------------");
    }
}
