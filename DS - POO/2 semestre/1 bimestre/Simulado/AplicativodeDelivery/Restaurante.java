package AplicativodeDelivery;
public class Restaurante {

    public Restaurante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
   String nome;
   String endereco;
   
   public void exibirInfo(){
       System.out.println("--- Restarante ---");
       System.out.println("Nome do restaurante: " + nome);
       System.out.println("Endereco do restaurante " + endereco);
       
   }
}
