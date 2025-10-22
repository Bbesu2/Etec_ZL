package SistemadeGestãodeClínicaVeterináriaConstrutor;
public class Animal {

    public Animal(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    String nome;
    double peso;
    double altura;
    
    public void calcularIMC(){
        System.out.println("IMC = " + this.peso/(this.altura * this.altura)); 
    }
    public void exibirInfo(){
        System.out.println("--- Animal ---");
        System.out.println("Nome do animal: " + nome);
        System.out.println("Peso do animal: " + peso + "kg");
        System.out.println("altura do animal: " + altura + "m");
        System.out.println("---------------");
    }
}
