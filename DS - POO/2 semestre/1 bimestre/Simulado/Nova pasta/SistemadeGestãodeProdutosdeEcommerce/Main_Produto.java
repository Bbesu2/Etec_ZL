package SistemadeGestãodeProdutosdeEcommerce;
public class Main_Produto {
    public static void main(String[] args) {
       Produto p1 = new Produto();
       
       p1.nome = "Celular Samsung";
       p1.preco = 1200.50;
       p1.quantEstoque = 200;
       p1.exibirInfo();
    }
    
}
