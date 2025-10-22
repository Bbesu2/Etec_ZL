package SistemadeGestãodeClínicaVeterinária;
public class Main_Animal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        
        a1.nome = "Thor";
        a1.peso = 5.5;
        a1.altura = 1.05;
        a1.exibirInfo();
        a1.calcularIMC();
    }
    
}
