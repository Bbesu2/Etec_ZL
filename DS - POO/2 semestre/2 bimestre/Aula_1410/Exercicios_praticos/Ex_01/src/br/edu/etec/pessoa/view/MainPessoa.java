/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.pessoa.view;

import br.edu.etec.pessoa.model.Pessoa_ex1;

/**
 *
 * @author Admin
 */
public class MainPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa_ex1 p1 = new Pessoa_ex1();
            p1.setNome("Raul Seixas");
            p1.setIdade(23);
            p1.setCpf("111.111.111-12");
            
            System.out.println("----------- Sistema de gerenciamneto de pessoas -----------");
            System.out.println("Nome: "+ p1.getNome());
            System.out.println("Idade: "+ p1.getIdade());
            System.out.println("CPF: "+ p1.getCpf());
            System.out.println("-----------------------------------------------------------");
    }
    
}
