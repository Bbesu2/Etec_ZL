package SistemadeGestãoEscolarHerançaeContrutores;
public class Professor extends Pessoa{
        double salario;
    String disciplina;

    public Professor(String nome, String cpf, double salario, String disciplina) {
        super(nome, cpf);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public void registrarNota(Aluno aluno, double novaNota) {
        aluno.nota = novaNota;
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Professor ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salario: R$" + salario);
        System.out.println("-----------------");
    }
}
