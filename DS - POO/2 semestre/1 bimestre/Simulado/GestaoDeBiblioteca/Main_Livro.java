/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestaoDeBiblioteca;

public class Main_Livro {
    public static void main(String[] args) {
        LivroFiccao f1 = new LivroFiccao("Aventura", "Harry Potter", "J. K. Rowling");
        System.out.println("--- Gestao de Biblioteca ---");
        System.out.println("Genero: "+f1.getGenero());
        System.out.println("Titulo: "+f1.getTitulo());
        System.out.println("Autor: "+f1.getAutor());
        
        LivroNaoFiccao l1 = new LivroNaoFiccao("Autobiografia", "Diario de Anne Frank", "Anne Frank");
        System.out.println("--- Gestao de Biblioteca ---");
        System.out.println("Assunto: "+l1.getAssunto());
        System.out.println("Titulo: "+l1.getTitulo());
        System.out.println("Autor: "+l1.getAutor());
    }
}

