package SistemadeControleAcadêmicodeDisciplinas;
public class Main_Disciplina {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina();
        
        d1.nome = "Matematica";
        d1.cargaHoraria = 2;
        d1.professorResponsavel = "Julia";
        d1.exibirInfo();
    }
    
}
