package JogoDeRPG;
public class Pesonagem {

    public Pesonagem(String nome, int nivel, int vida, int forca) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.forca = forca;
    }
    
    String nome;
    int nivel;
    int vida;
    int forca;
    
    public void atacar(){
        System.out.println("O joogador está atacando");
    }
    public void exibirInfo(){
        System.out.println("Nome do personagem: " + nome);
        System.out.println("Nivel do personagem: " + nivel);
        System.out.println("Vida do personagem: " + vida);
        System.out.println("Forca do personagem: " + forca);
    }
}
