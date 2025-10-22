package SistemadeGestãodePessoalHospitalar;
public class Enfermeiro extends Funcionario{
    String coren;
    
    @Override
    public void exibirInfo(){
       System.out.println("--- Funcionarios ---");
       System.out.println("Nome: "  + nome);
       System.out.println("Matricula: " + matricula);
       System.out.println("Salario: " + salario);
       System.out.println("Coren: " + coren);
       System.out.println("--------------------");
}
}
