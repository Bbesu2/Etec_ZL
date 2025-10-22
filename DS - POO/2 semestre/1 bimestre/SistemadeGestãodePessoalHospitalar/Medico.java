package SistemadeGestãodePessoalHospitalar;
public class Medico extends Funcionario{
        
    int crm;
    
    @Override
    public void exibirInfo(){
       System.out.println("--- Funcionarios ---");
       System.out.println("Nome: "  + nome);
       System.out.println("Matricula: " + matricula);
       System.out.println("Salario: " + salario);
       System.out.println("CRM: " + crm);
       System.out.println("--------------------");
    }
}
