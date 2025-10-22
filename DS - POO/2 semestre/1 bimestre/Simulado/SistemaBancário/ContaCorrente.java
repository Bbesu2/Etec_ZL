package SistemaBancário;
public class ContaCorrente extends Conta{
    
    double limiteDeCredito;
    
    public ContaCorrente(String numConta, double saldo, double limiteDeCredito) {
        super(numConta, saldo);
        this.limiteDeCredito = limiteDeCredito;
    }   
    
    @Override
    public void despositar(double valor){
        System.out.println("Saldo do Deposito (Conta Corrente): O saldo da conta " + numConta +" agora e de: " + (valor + saldo));
    }
    @Override
    public void sacar(double valor){
        
        double somaTotal = (saldo + limiteDeCredito);
        
        if(valor > somaTotal){
            System.out.println("Você nao pode sacar esse valor!");
        }else{
            System.out.println("Saldo do Saque (Conta Corrente): O saldo da conta " + numConta + "agora e de: " + (saldo - valor));
        }
    } 
    @Override
    public void exibirInfo(){
        System.out.println("--- Conta Corrente ---");
        System.out.println("Numero da Conta: " + numConta);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("Limite de Credito: " + limiteDeCredito);
        System.out.println("--------------");
    }
}
