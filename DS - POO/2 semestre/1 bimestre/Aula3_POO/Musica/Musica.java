package mainmusica;

public class Musica {
    
        
        String nome;
        String autor;
        String genero;
        String album;
        int ano;
    
        public void play(){
    System.out.println("A musica esta tocando");
        }
    
        public void stop(){
    System.out.println("A musica parou");
        }          

        public void skip(){
    System.out.println("Pulou para a proxima musica");
        }
         public void exibirInfo(){
    System.out.println("------- Sistema de Gerenciamento de musica -------");
    System.out.println("Nome da musica: "+nome);
        System.out.println("Autor da musica: "+autor);
        System.out.println("Genero da musica: "+genero);
        System.out.println("Album da musica: "+album);
        System.out.println("Ano de publicacao da musica: "+ano);
         }
  
    }

