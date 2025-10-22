package SistemadeGestãoEscolarHerançaeContrutores;
public class Aluno extends Pessoa{
    String matricula;
    double nota;

    public Aluno(String nome, String cpf, String matricula, double nota) {
        super(nome, cpf);
        this.matricula = matricula;
        this.nota = nota;
    }

    public double calcularMedia() {
        return nota; 
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Aluno ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota: " + nota);
        System.out.println("Media: " + calcularMedia());
        System.out.println("---------------");
    }
}
