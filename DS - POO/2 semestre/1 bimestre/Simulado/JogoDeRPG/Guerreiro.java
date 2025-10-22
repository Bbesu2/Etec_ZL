package JogoDeRPG;
public class Guerreiro extends Pesonagem{

    public Guerreiro(String nome, int nivel, int vida, int forca) {
        super(nome, nivel, vida, forca);
    }
    
    
    @Override
    public void atacar(){
        System.out.println("O guerreirro esta atacando com uma espada");
    }
    @Override
    public void exibirInfo(){
        System.out.println("--- Personagem ---");
        System.out.println("Nome do personagem: " + nome);
        System.out.println("Nivel do personagem: " + nivel);
        System.out.println("Vida do personagem: " + vida);
        System.out.println("Forca do personagem: " + forca);
        System.out.println("-------------------");
    }

}
