/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadepersonagem;

/**
 *
 * @author Admin
 */
public class Mago extends Personagem{

      private int mana;
      
    public Mago(int mana, String nome, int nivel, int vida) {
        super(nome, nivel, vida);
        this.mana = mana;
    }
    
    public void Consumir(){
        System.out.println("O mago "+getNome()+" consumiu mana"); 
    }
  
    public int getMana() {
        return mana;
    }
        public void setMana(int mana) {
        this.mana = mana;
    }
        
    @Override
        public void mostrarStatus(){
        System.out.println("-------------Status de Personagem De Jogo-------------");
        System.out.println("Nome: "+getNome());
        System.out.println("Nivel: "+getNivel());
        System.out.println("Vida "+getVida());
        System.out.println("Mana "+mana);
        }
}
