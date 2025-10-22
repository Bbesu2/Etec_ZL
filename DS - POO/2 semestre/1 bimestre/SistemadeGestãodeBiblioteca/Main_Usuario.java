package SistemadeGestãodeBiblioteca;
public class Main_Usuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        
        u1.nome = "Percy Jackson";
        u1.data = "14/09/2025";
        u1.tipoUsuario = "visitante";
        u1.exibirInfo();
        u1.calcularPrazoDevolucao();
    }
}
