package SistemaBancário;
public class Conta {

    public Conta(String numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }
    String numConta;
    double saldo;
    
    public void despositar(double valor){
        System.out.println("O saldo da conta " + numConta +" agora e de: " + (valor + saldo));
    }
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Você nao pode sacar esse valor!");
        }else{
            System.out.println("O saldo da conta " + numConta + "agora e de: " + (saldo - valor));
        }
    }   
    public void exibirInfo(){
        System.out.println("--- Conta ---");
        System.out.println("Numero da Conta: " + numConta);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("--------------");
    }
} 

