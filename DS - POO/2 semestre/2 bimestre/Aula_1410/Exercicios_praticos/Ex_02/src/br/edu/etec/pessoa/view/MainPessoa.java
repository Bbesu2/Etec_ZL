
package br.edu.etec.pessoa.view;

import br.edu.etec.pessoa.model.Pessoa_ex2;

public class MainPessoa {

    public static void main(String[] args) {
        Pessoa_ex2 p1 = new Pessoa_ex2();
            p1.setNome("Raul Seixas");
            p1.setIdade(-123);
            p1.setCpf("111.111.111-12");
           p1.Exibir_info();
    }
    
}
