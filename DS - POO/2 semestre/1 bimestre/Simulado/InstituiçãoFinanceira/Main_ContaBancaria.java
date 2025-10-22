package InstituiçãoFinanceira;
public class Main_ContaBancaria {
    public static void main(String[] args) {
       ContaBancaria conta = new ContaBancaria();
       
       conta.limiteCredito = 100;
       conta.saldo = 100;
       conta.exibirInfo();
       conta.verificarSaque(10);
    }
}
