/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisaopoo;

/**
 *
 * @author User
 */
public class Funcionario extends Usuario{
     private int matricula;

    public int getMatricula() {
        return matricula;
}
 public Funcionario(String nome, int matricula) {
           super(nome);
          this. matricula = matricula;
}

 public void Falar(){
         System.out.println("O(a) funcionario(a) "+getNome()+" falou");
}
  public void Logar(){
         System.out.println("O(a) funcionario(a) "+getNome()+" entrou na conta");
}
}
