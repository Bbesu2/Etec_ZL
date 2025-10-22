package SistemadeGestãoEscolarHerançaeContrutores;
public class Main_Herança {
    public static void main(String[] args) {
         Aluno a1 = new Aluno("Joao Silva", "123.456.789-00", "MAT123", 8.5);
        Professor p1 = new Professor("Maria Souza", "987.654.321-00", 3500.0, "Matematica");
        Disciplina d1 = new Disciplina("Matematica", 60);
        
        a1.exibirInfo();
        p1.exibirInfo();
        d1.exibirInfo();
    }
}
