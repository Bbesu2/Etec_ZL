package SistemadeGestãodeMídia;
public class Editor extends Funcionario{
    
        String softwareEdit;
    
        @Override
       public void exibirInfo(){
       System.out.println("--- Funcionario ---");
       System.out.println("Nome do funcionario: " + nome);
       System.out.println("Matricula: " + matricula);
       System.out.println("Salario: " + salario);
       System.out.println("Software de Edicao: " + softwareEdit);
       System.out.println("-------------------");
   } 
}
