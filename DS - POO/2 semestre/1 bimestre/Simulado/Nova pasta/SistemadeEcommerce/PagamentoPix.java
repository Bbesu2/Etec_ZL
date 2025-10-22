package SistemadeEcommerce;
public class PagamentoPix extends Pagamento{
    
    String chavePix;
    
    
    @Override
    public void exibirInfo(){
    System.out.println("--- Pagamento ---");
    System.out.println("Valor: " + valor);
    System.out.println("Data do pagamento: " + data);
    System.out.println("Status do pagamento: " + status);
    System.out.println("Chave Pix: " + chavePix);
    System.out.println("------------------");
}
}
