package SistemaBancário;
public class ContaPoupança extends Conta{
    
    double taxaDeJuros;
    
    public ContaPoupança(String numConta, double saldo, double taxaDeJuros) {
        super(numConta, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }
    
    @Override
    public void despositar(double valor){
        System.out.println("Saldo do deposito (Conta Poupanca): O saldo da conta " + numConta +" com juros de 5% agora e de: " + ((valor + saldo) * 0.05));
    }
    @Override
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Você nao pode sacar esse valor!");
        }else{
            System.out.println("Saldo do saque (Conta Poupanca): O saldo da conta " + numConta + "agora e de: " + (saldo - valor));
        }
    }  
    @Override
    public void exibirInfo(){
        System.out.println("--- Conta Poupanca ---");
        System.out.println("Numero da Conta: " + numConta);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("Taxa de Juros: " + taxaDeJuros);
        System.out.println("--------------");
    }
}
