package JogoDeRPG;
public class Mago extends Pesonagem{
    
    int mana;

    public Mago(String nome, int nivel, int vida, int forca, int mana) {
        super(nome, nivel, vida, forca);
        this.mana = mana;
    }
    
        @Override
        public void atacar(){
        System.out.println("O mago esta atacando com uma bola de fogo");
    }
    @Override
    public void exibirInfo(){
        System.out.println("--- Personagem ---");
        System.out.println("Nome do personagem: " + nome);
        System.out.println("Nivel do personagem: " + nivel);
        System.out.println("Vida do personagem: " + vida);
        System.out.println("Forca do personagem: " + forca);
        System.out.println("Mana: " + mana);
        System.out.println("-------------------");
    }
}
