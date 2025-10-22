package SistemadeGestãoEscolar;
public class Pessoa {
    String nome;
    String cpf;
    String dt_Nasc;
    
    public void exibirInfo(){
        System.out.println("--- Pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dt_Nasc);
        System.out.println("--------------");
    } 
}
