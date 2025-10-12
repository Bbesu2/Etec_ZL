/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestaoDeBiblioteca;

public class LivroNaoFiccao extends Livro{
    private String assunto;
    
    public LivroNaoFiccao(String assunto, String titulo, String autor) {
        super(titulo, autor);
        this.assunto = assunto;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}

