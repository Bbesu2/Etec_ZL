package GerenciamentodeLivrosemumaBiblioteca;
public class Main_Livros {
    public static void main(String[] args) {
        Livros l1 = new Livros();
        
        l1.setTitulo("JOJO");
        l1.setAutor("Araki");
        l1.setAnoPublic(2001);
        
        System.out.println("--- Livros ---");
        System.out.println("Nome do Livro: " + l1.getAutor());
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("Ano de Publicacao: " + l1.getAnoPublic());
        System.out.println("--------------");
    }
}
