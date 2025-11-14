
package View;
import Model.Pagamento;
public class Enum_Atividade {

    public static void main(String[] args) {
        
        //Criando uma forma de pagamento
       Pagamento pagamentoD = Pagamento.CARTAOD;
       
       //imprimindo pagamento
        System.out.println(pagamentoD.getDescricao());
    }
     
}
