package CadastrodeClientesemumaLojaOnline;
public class Main_Cliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        
        c1.setNome("Ykaro");
        c1.setCpf("222.333.111-10");
        c1.setEndereco("Rua Mariana, 16");
        
        System.out.println("--- Cliente ---");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("CPF: " + c1.getCpf());
        System.out.println("Endereco: " + c1.getEndereco());
        System.out.println("----------------");
    }
    
}
