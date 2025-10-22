package SistemadeGestãoEscolarHerançaeContrutores;
public class Disciplina {
        String nome;
        int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirInfo() {
        System.out.println("=== Boletim Escolar ===");
        System.out.println("Disciplina: " + nome);
        System.out.println("Carga Horaria: " + cargaHoraria + "h");
        System.out.println("=======================");
    }
}
