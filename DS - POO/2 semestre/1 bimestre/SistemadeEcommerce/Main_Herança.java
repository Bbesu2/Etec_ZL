package SistemadeEcommerce;
public class Main_Herança {
    public static void main(String[] args) {
        PagamentoCartao pc1 = new PagamentoCartao();
        PagamentoPix pp1 = new PagamentoPix();
        PagamentoBoleto pb1 = new PagamentoBoleto();
        
        pc1.valor = 10.1;
        pc1.data = "10/10/2000";
        pc1.status = "a pagar";
        pc1.numCartao = "1234";
        pc1.bandeira = "Visa";
        
        pp1.valor = 10.1;
        pp1.data = "10/10/2000";
        pp1.status = "a pagar";
        pp1.chavePix = "123.123.121-10";
        
        pb1.valor = 10.1;
        pb1.data = "10/10/2000";
        pb1.status = "a pagar";
        pb1.dataVencimento = "12/10/2000";
        pb1.codigoBarra = "1234123";
        
        pb1.exibirInfo();
        pp1.exibirInfo();
        pc1.exibirInfo();
    }
    
}
