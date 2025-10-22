package SistemadeProntuáriodePacientes;
public class Main_Paciente {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        
        p1.nome = "Peter";
        p1.idade = 16;
        p1.historicoDeConsultas = "Veio em todas as consultas";
        p1.exibirInfo();
    }
    
}
