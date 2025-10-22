package SistemadeGestãodeBiblioteca;
public class Usuario {
    String nome;
    String tipoUsuario;
    String data;
    
    public void calcularPrazoDevolucao(){
        if(tipoUsuario.equalsIgnoreCase("professor")){
            System.out.println("Voce devera devolver o livro em : " + "30 dias"); 
         }else if(tipoUsuario.equalsIgnoreCase("aluno")){
            System.out.println("Voce devera devolver o livro em : " + "15 dias"); 
        }else if(tipoUsuario.equalsIgnoreCase("visitante")){
            System.out.println("Voce devera devolver o livro em : 7 dias");
        }
    }
    public void exibirInfo(){
            System.out.println("--- Gestao de Livros ---");
            System.out.println("Nome do Livro: " + nome);
            System.out.println("Tipo de Usuario: " + tipoUsuario);
            System.out.println("Dia que pegou o livro: " + data);
            System.out.println("------------------------");
    }
}