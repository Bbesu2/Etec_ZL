package SistemadeGestãodeConcessionária;
public class Main_Herança {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Moto m1 = new Moto();
        
        c1.modelo = "City";
        c1.ano = 2020;
        c1.placa = "A1CD234";
        c1.numPortas = 4;
        
        m1.modelo = "XJ";
        m1.placa = "AB1C456";
        m1.ano = 2010;
        m1.cilindradas = 100;
        
        c1.exibirInfo();
        m1.exibirInfo();
    }
    
}
