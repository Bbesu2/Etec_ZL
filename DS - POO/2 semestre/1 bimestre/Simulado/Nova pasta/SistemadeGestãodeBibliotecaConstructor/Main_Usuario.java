package SistemadeGestãodeBibliotecaConstructor;
public class Main_Usuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Percy Jackson", "aluno", "20/10/2000");
       
        
        u1.exibirInfo();
        u1.calcularPrazoDevolucao();
    }
    
}
