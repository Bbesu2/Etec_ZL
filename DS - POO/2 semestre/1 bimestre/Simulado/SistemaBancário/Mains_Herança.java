package SistemaBancário;
public class Mains_Herança {
    public static void main(String[] args) {
    ContaPoupança cp = new ContaPoupança("12345", 1000.0, 0.05);
    
        cp.exibirInfo();
        cp.despositar(500);
        cp.sacar(200);
        
        ContaCorrente cc = new ContaCorrente("1234-5", 1000.0, 500.0);
         
        cc.exibirInfo();
        cc.despositar(200.0);  
        cc.sacar(300.0);
}
}
