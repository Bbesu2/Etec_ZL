/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pessoa;

public class Main_Pessoa {

    public static void main(String[] args) {
      
        
        //objeto1
        Pessoa pessoa = new Pessoa();
    
        //Instaciamos os atributos
            pessoa.idPessoa = 1;
                    pessoa.nome = "Besu";
                        pessoa.idade = 16;
                                pessoa.profissao = "estudante";
                                
        //Metodos
        
        System.out.println("------------------------Classe Pessoa 1");
            System.out.println("Numero identificador: " + pessoa.idPessoa);
            System.out.println("Nome: " + pessoa.nome);
            System.out.println("Idade: " + pessoa.idade);
            System.out.println("Profissao: " + pessoa.profissao);
            pessoa.estudar();
            
            
        //objeto2
        Pessoa pessoa1 = new Pessoa();
        
        //Instaciamos os atributos
            pessoa1.idPessoa = 2;
                    pessoa1.nome = "Charlie";
                        pessoa1.idade = 16;
                                pessoa1.profissao = "estudante";
                                
        //Metodos
        
        System.out.println("------------------------Classe Pessoa 2");
            System.out.println("Numero identificador: " + pessoa1.idPessoa);
            System.out.println("Nome: " + pessoa1.nome);
            System.out.println("Idade: " + pessoa1.idade);
            System.out.println("Profissao: " + pessoa1.profissao);
            pessoa1.falar();
            
            
            //objeto3
        Pessoa pessoa2 = new Pessoa();
        
        //Instaciamos os atributos
            pessoa2.idPessoa = 3;
                    pessoa2.nome = "Bruna";
                        pessoa2.idade = 16;
                                    pessoa2.profissao = "artista";
                                
        //Metodos
        
        System.out.println("------------------------Classe Pessoa 3");
            System.out.println("Numero identificador: " + pessoa2.idPessoa);
            System.out.println("Nome: " + pessoa2.nome);
            System.out.println("Idade: " + pessoa2.idade);
            System.out.println("Profissao: " + pessoa2.profissao);
            pessoa2.falar();
            
            
            //objeto4
        Pessoa pessoa3 = new Pessoa();
        
        //Instaciamos os atributos
            pessoa3.idPessoa = 4;
                    pessoa3.nome = "Shopia";
                        pessoa3.idade = 16;
                                pessoa3.profissao = "Manicure";
                                
        //Metodos
        
        System.out.println("------------------------Classe Pessoa 4");
            System.out.println("Numero identificador: " + pessoa3.idPessoa);
            System.out.println("Nome: " + pessoa3.nome);
            System.out.println("Idade: " + pessoa3.idade);
            System.out.println("Profissao: " + pessoa3.profissao);
            pessoa3.trabalhar();
          
    }
    

}
