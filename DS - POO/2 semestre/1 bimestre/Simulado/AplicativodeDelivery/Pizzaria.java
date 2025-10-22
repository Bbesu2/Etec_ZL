package AplicativodeDelivery;
public class Pizzaria extends Restaurante{
    
    String tipoForno;
    
    public Pizzaria(String nome, String endereco, String tipoForno) {
        super(nome, endereco);
        this.tipoForno = tipoForno;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("--- Pizzaria ---");
        System.out.println("Nome da pizzaria: " + nome);
        System.out.println("Endereco da pizzaria: " +endereco);
        System.out.println("Tipo de forno usado: " + tipoForno);
        System.out.println("-----------------");
    }
    
}
