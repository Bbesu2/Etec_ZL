package SistemadeProntuáriodePacientes;
public class Paciente {
    String nome;
    int idade;
    String historicoDeConsultas;
    
    public void exibirInfo(){
        System.out.println("------- Paciente ------");
        System.out.println("Nome do paciente: " + nome);
        System.out.println("Idade do paciente: " + idade);
        System.out.println("Historico de Consultas: " + historicoDeConsultas);
        System.out.println("-------------------------");
    }
}
