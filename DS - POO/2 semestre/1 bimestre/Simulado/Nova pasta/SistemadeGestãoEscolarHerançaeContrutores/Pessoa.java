package SistemadeGestãoEscolarHerançaeContrutores;
public class Pessoa {
    String nome;
    String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
