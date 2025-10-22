package SupermercadoOnline;
public class Produto {
    String nome;
    double preco;
    
    public void aplicarDesconto(double quantComprada){
        if(quantComprada >= 10){
            System.out.println("Voce pagara: " + (preco - (preco*0.15)));
        }else if(quantComprada < 10 && quantComprada >= 5 ){
            System.out.println("Voce pagara: " + (preco - (preco*0.10)));        
        }else if(quantComprada < 5 && quantComprada >= 3  ){
            System.out.println("Voce pagara: " + (preco - (preco*0.05)));        
        }else{
            System.out.println("Voce pagara: " + preco);
        }
    }
    public void exibirInfo(){
        System.out.println("--- Produto ---");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preco do produto: " + preco);
        System.out.println("---------------");
    }
}
