package SistemadeEcommerce;
public class PagamentoCartao extends Pagamento{
    
    String numCartao;
    String bandeira;
    
    @Override
    public void exibirInfo(){
    System.out.println("--- Pagamento ---");
    System.out.println("Valor: " + valor);
    System.out.println("Data do pagamento: " + data);
    System.out.println("Status do pagamento: " + status);
    System.out.println("Numero do cartão: " + numCartao);
    System.out.println("Bandeira do Cartão: " + bandeira);
    System.out.println("------------------");
}
}
