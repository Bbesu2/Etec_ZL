package JogoDeRPG;
public class Main_Personagem {
    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro("MegaCavaleiro", 10, 5, 10);
        Arqueiro a1 = new Arqueiro("ArqueiroMagico", 10, 5, 10, "Magico");
        Mago m1 = new Mago("MagodeFogo", 10 , 5, 10, 10);
        
        
        g1.exibirInfo();
        g1.atacar();
        
        a1.exibirInfo();
        a1.atacar();
        
        m1.exibirInfo();
        m1.atacar();
    }
    
}
