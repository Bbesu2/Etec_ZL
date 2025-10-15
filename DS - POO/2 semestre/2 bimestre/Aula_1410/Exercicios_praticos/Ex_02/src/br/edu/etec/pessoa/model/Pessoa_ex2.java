package br.edu.etec.pessoa.model;

public class Pessoa_ex2 {
    private String nome;
    private int idade;
    private String cpf;

public String getNome(){return nome;}
public int getIdade() {return idade;}
    
public String getCpf() {return cpf;}

public void setNome(String nome){this.nome = nome;}
public void setIdade(int idade){
    if(idade>=0){this.idade = idade;} 
    else {System.out.println("idade invalida");}}
public void setCpf(String cpf){this.cpf = cpf;}

public void Exibir_info(){
  System.out.println("----------- Sistema de gerenciamneto de pessoas -----------");
            System.out.println("Nome: "+ getNome());
            System.out.println("Idade: "+ getIdade());
            System.out.println("CPF: "+ getCpf());
            System.out.println("----------- Sistema de gerenciamneto de pessoas -----------");}
}

