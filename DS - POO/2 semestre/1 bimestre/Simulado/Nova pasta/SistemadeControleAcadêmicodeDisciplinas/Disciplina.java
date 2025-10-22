package SistemadeControleAcadêmicodeDisciplinas;
public class Disciplina {
    String nome;
    int cargaHoraria;
    String professorResponsavel;
    
    public void exibirInfo(){
        System.out.println("---- Disciplinas ----");
        System.out.println("Nome da Disciplina: " + nome);
        System.out.println("Caga Horaria: " + cargaHoraria);
        System.out.println("Professor Responsavel: " + professorResponsavel);
        System.out.println("---------------------");
    }
}
