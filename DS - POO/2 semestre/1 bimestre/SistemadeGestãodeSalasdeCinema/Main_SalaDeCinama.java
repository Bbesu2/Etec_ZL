package SistemadeGestãodeSalasdeCinema;
public class Main_SalaDeCinama {
    public static void main(String[] args) {
        SalaDeCinama Sala1 = new SalaDeCinama();
        
        
        Sala1.numero = 1;
        Sala1.capacidade = 100;
        Sala1.tipoTecnologia = "2D";
        Sala1.exibirInfo();
    }
}
