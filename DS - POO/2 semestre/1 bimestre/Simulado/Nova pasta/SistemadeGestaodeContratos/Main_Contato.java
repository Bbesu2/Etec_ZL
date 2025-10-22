package SistemadeGestaodeContratos;
public class Main_Contato {
    public static void main(String[] args) {
        Contato c1 = new Contato();
        
        c1.setNome("Almir");
        c1.setEmail("Almir@gmail.com");
        c1.setTelefone("(11)99999-9999");
        
        System.out.println("------- Contatos -------");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Email: " + c1.getEmail());
        System.out.println("Telefone: " + c1.getTelefone());
        System.out.println("------------------------");
    }
    
}
