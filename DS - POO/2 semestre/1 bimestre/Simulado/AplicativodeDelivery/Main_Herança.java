package AplicativodeDelivery;
public class Main_Herança {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("Hamburguer", 35, 001);
        Hamburgueria h1 = new Hamburgueria("Burger", "Rua F, nº1", "Artesanal");
        Pizzaria pi1 = new Pizzaria("Pizza", "Rua N, nº2", "A lenha");
        
        h1.exibirInfo();
        
        p1.exibirInfo();
        p1.adcionar();
        p1.calcularTotal();
        
        pi1.exibirInfo();
        
    }
    
}
