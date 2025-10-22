/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadepersonagem;

/**
 *
 * @author Admin
 */
public class Guerreiro extends Personagem {

    //atributo expecifico da classe filha
    private String arma;
    
    public Guerreiro(String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.arma=arma;
    }
        public void Defender(){
            System.out.println("O guerreiro "+ getNome()+" defendeu");
        }
        
    @Override
        public void mostrarStatus(){
        System.out.println("-------------Status de Personagem De Jogo-------------");
        System.out.println("Nome: "+getNome());
        System.out.println("Nivel: "+getNivel());
        System.out.println("Vida "+getVida());
        System.out.println("Arma "+arma);
        }
        
        //metodo de acesso
            public String getArma(){
                return arma;
            }
               public void setArma(String arma){
                this.arma=arma;
               }
}
