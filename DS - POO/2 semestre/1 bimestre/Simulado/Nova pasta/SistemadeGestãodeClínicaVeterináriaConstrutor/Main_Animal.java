package SistemadeGestãodeClínicaVeterináriaConstrutor;
public class Main_Animal {
    public static void main(String[] args) {
        Animal a1 = new Animal("Thor", 5.5, 1);
        a1.exibirInfo();
        a1.calcularIMC();
    }
}
