package SistemadeEcommerce;
public class Pagamento {
    double valor;
    String data;
    String status;
    
public void exibirInfo(){
    System.out.println("--- Pagamento ---");
    System.out.println("Valor: " + valor);
    System.out.println("Data do pagamento: " + data);
    System.out.println("Status do pagamento: " + status);
    System.out.println("------------------");
}
}
