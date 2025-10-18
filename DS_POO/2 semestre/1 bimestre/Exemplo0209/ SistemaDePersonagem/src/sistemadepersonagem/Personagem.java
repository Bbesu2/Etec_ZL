/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadepersonagem;

/**
 *
 * @author Admin
 */
public class Personagem {
    
    //atributos
    
        private String nome;
        private int nivel;
        private int vida;

        
        //construtor
            public Personagem(String nome, int nivel, int vida) {
                this.nome = nome;
                this.nivel = nivel;
                this.vida = vida;
            }

        //metodo
        public void Atacar(){
            System.out.println(nome+" atacou");
        }
     
        public void mostrarStatus(){
        System.out.println("-------------Status de Personagem De Jogo-------------");
        System.out.println("Nome: "+nome);
        System.out.println("Nivel: "+nivel);
        System.out.println("Vida "+vida);
        }
        
        
        // metodo de acesso
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
        
}
