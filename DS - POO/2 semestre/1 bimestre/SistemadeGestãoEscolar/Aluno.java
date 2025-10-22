package SistemadeGestãoEscolar;
public class Aluno extends Pessoa{
    
    String matricula;
    String curso;
    
    @Override
    public void exibirInfo(){
        System.out.println("--- Pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dt_Nasc);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("--------------");
    } 
}
