package SistemadeGestãoEscolar;
public class Professor extends Pessoa{
    String disciplina;
    double salario;
    
    @Override
    public void exibirInfo(){
        System.out.println("--- Pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dt_Nasc);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salario: " + salario);
        System.out.println("--------------");
    } 
}
