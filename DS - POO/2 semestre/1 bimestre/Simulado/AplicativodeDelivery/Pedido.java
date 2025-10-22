package AplicativodeDelivery;
public class Pedido {

    public Pedido(String produto, double preco, int id) {
        this.produto = produto;
        this.preco = preco;
        this.id = id;
    }
    
    String produto;
    double preco;
    int id;
    
    public void calcularTotal(){
        System.out.println("O total ficou: " + preco);
        System.out.println("-------------------");
    }
    public void adcionar(){
        System.out.println("Voce adcionou o produto: " + produto);
    }
    public void remover(){
        System.out.println("Voce removeu o produto: " + produto);
    }
    
    public void exibirInfo(){
        System.out.println("--- Produto ---");
        System.out.println("Nome do produto: " + produto);
        System.out.println("Preco do produto: " + preco);
        System.out.println("Id do produto: " + id);
        System.out.println("----------------");
    }
}
