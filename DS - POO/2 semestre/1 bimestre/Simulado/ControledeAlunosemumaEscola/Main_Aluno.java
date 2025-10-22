package ControledeAlunosemumaEscola;
public class Main_Aluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        
        a1.setMatricula("Matriculado");
        a1.setNome("Mario");
        a1.setNota(10);
        
        System.out.println("--- Alunos ---");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Matricula: " + a1.getMatricula());
        System.out.println("Nota: " + a1.getNota());
        System.out.println("--------------");
    }
    
}
