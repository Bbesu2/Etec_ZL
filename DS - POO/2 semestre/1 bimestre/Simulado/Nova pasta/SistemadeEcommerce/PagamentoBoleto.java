package SistemadeEcommerce;
public class PagamentoBoleto extends Pagamento{
    
    String codigoBarra;
    String dataVencimento;
    
    @Override
    public void exibirInfo(){
    System.out.println("--- Pagamento ---");
    System.out.println("Valor: " + valor);
    System.out.println("Data do pagamento: " + data);
    System.out.println("Status do pagamento: " + status);
    System.out.println("Codigo de Barras: " + codigoBarra);
    System.out.println("Data de Vencimento: " + dataVencimento);
    System.out.println("------------------");
}
}
