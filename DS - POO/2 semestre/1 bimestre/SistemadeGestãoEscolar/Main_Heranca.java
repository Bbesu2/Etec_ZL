package SistemadeGestãoEscolar;
public class Main_Heranca {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        Aluno a1 = new Aluno();
        
        p1.nome = "Paulo";
        p1.cpf = "222.333.111-10";
        p1.dt_Nasc = "20/02/1999";
        p1.salario = 2500;
        p1.disciplina = "Matematica";
        
        a1.nome = "Paula";
        a1.cpf = "222.333.111-11";
        a1.dt_Nasc = "20/02/2005";
        a1.matricula = "01";
        a1.curso = "DS";
        
        p1.exibirInfo();
        a1.exibirInfo();
    }
    
}
