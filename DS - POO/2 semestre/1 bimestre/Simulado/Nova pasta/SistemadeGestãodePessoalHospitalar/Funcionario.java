package SistemadeGestãodePessoalHospitalar;
public class Funcionario {
   String nome;
   String matricula;
   double salario;
   
   
   public void exibirInfo(){
       System.out.println("--- Funcionarios ---");
       System.out.println("Nome: "  + nome);
       System.out.println("Matricula: " + matricula);
       System.out.println("Salario: " + salario);
       System.out.println("--------------------");
   }
}
