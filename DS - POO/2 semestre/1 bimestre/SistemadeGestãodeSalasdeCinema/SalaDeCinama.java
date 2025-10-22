package SistemadeGestãodeSalasdeCinema;
public class SalaDeCinama {
    int numero;
    int capacidade;
    String tipoTecnologia;
    
    public void exibirInfo(){
        System.out.println("--- Salas de Cinema ---");
        System.out.println("Numero da sala: " + numero);
        System.out.println("Capacidade da sala: " + capacidade);
        System.out.println("Tipo da tecnologia: " + tipoTecnologia);
        System.out.println("----------------------");
    }
}
