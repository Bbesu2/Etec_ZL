/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainmusica;

/**
 *
 * @author Admin
 */
public class MainMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Musica music = new Musica();
        
        music.nome="Entre Canibales";
        music.autor="Soda Stereo";
        music.genero="Rock";
        music.album="Cancion Animal";
        music.ano=1990;
        
        music.exibirInfo();
        music.play();
        
    }
    
}
