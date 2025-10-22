/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadepersonagem;

/**
 *
 * @author Admin
 */
public class MainSistemaDePersonagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            Guerreiro g1 = new Guerreiro("Melvin",12,100);
                g1.mostrarStatus();
                g1.Defender();
                g1.Atacar();
            
    }
    
}
