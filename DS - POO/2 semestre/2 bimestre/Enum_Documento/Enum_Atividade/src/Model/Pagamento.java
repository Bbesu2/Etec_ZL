package Model;

public enum Pagamento {
    CARTAOD("Pagamento feito por cartao de debito"),
    CARTAOC("Pagamento feito por cartao de debito"),
    BOLETO("Pagamento feito por boleto"),
    DINHEIRO("Pagamento feito por dinheiro"),
    PIX("Pagamento feito por pix");
    
    // criando atributo para as descricoes
           private String descricao;
           
           //Constructor
        Pagamento(String descricao) {
            this.descricao = descricao;
        }
        
        //Get para pegar a descricao
        public String getDescricao() {
            return this.descricao;
            }   
         }
