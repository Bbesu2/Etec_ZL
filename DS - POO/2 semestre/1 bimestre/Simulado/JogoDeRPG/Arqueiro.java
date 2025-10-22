package JogoDeRPG;
public class Arqueiro extends Pesonagem{

    String tipoArco;
    
    public Arqueiro(String nome, int nivel, int vida, int forca, String tipoArco) {
        super(nome, nivel, vida, forca);
        this.tipoArco = tipoArco;
    }
            @Override
        public void atacar(){
        System.out.println("O arqueiro esta atacando com um arco");
    }
    @Override
    public void exibirInfo(){
        System.out.println("--- Personagem ---");
        System.out.println("Nome do personagem: " + nome);
        System.out.println("Nivel do personagem: " + nivel);
        System.out.println("Vida do personagem: " + vida);
        System.out.println("Forca do personagem: " + forca);
        System.out.println("Tipo de arco: " + tipoArco);
        System.out.println("-------------------");
    }
}
