package SistemadeGestãodeProdutosdeEcommerce;
public class Produto {
     String nome;
     double preco;
     int quantEstoque;
     
     public void exibirInfo(){
         System.out.println("--- Produtos ---");
         System.out.println("Nome do produto: " + nome);
         System.out.println("Preco do produto; " + preco);
         System.out.println("Quantidade que temos no estoque " + quantEstoque);
         System.out.println("----------------");
     }
}
