package AplicativodeDelivery;
public class Hamburgueria extends Restaurante{
    
    String tipoHamburguer;
    
    public Hamburgueria(String nome, String endereco, String tipoHamburguer) {
        super(nome, endereco);
        this.tipoHamburguer = tipoHamburguer;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("--- Hamburgueria ---");
        System.out.println("Nome da Hamburgueria: " + nome);
        System.out.println("Endereco da Hamburgueria: " +endereco);
        System.out.println("Tipo do Hamburguer: " + tipoHamburguer);
        System.out.println("-----------------");
    }
    
    
}
