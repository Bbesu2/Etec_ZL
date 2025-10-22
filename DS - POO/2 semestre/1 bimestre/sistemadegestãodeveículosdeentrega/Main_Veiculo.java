package sistemadegestãodeveículosdeentrega;
public class Main_Veiculo {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        
        v1.modelo = "City";
        v1.placa = "LO1L10";
        v1.capacidedeDeCarga = 10.50;
        
        v1.exibirInfo();
    }
    
}
