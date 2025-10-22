package SistemadeGestãodeMídia;
public class Cameraman extends Funcionario{
    
    String tipoCamera;
    int tempoExperiencia;
        
    @Override
        public void exibirInfo(){
       System.out.println("--- Funcionario ---");
       System.out.println("Nome do funcionario: " + nome);
       System.out.println("Matricula: " + matricula);
       System.out.println("Salario: " + salario);
       System.out.println("Tipo de Camera: " + tipoCamera);
       System.out.println("Tempo de Experiencia: " + tempoExperiencia + " anos");
       System.out.println("-------------------");
   }
}
