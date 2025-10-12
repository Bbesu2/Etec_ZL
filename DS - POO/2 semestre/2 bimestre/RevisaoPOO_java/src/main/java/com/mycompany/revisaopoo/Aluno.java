/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisaopoo;

/**
 *
 * @author User
 */
public class Aluno extends Usuario{
     private int ra;

    public int getRa() {
        return ra;
}
 public Aluno(String nome, int ra) {
            super(nome);
            this.ra = ra;
}

 public void Falar(){
         System.out.println("O(a) aluno(a) "+getNome()+" falou");
}
  public void Logar(){
         System.out.println("O(a) aluno(a) "+getNome()+" entrou na conta");
}
}
