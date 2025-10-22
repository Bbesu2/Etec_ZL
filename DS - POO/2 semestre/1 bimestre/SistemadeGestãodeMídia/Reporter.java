package SistemadeGestãodeMídia;
public class Reporter extends Funcionario{
    String areaAtuacao;
    int numReportagem;
    
    @Override
    public void exibirInfo(){
       System.out.println("--- Funcionario ---");
       System.out.println("Nome do funcionario: " + nome);
       System.out.println("Matricula: " + matricula);
       System.out.println("Salario: " + salario);
       System.out.println("Area de Atuacao: " + areaAtuacao);
       System.out.println("Numero de Reportagens: " + numReportagem);
       System.out.println("-------------------");
   }
}
