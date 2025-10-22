package SistemadeGestãodeMídia;
public class Funcionario {
    String nome;
    String matricula;
    double salario;
    
    
   public void exibirInfo(){
       System.out.println("--- Funcionario ---");
       System.out.println("Nome do funcionario: " + nome);
       System.out.println("Matricula: " + matricula);
       System.out.println("Salario: " + salario);
       System.out.println("-------------------");
   }
}
