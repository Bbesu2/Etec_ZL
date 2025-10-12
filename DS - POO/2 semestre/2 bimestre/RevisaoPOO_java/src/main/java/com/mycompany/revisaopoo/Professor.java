/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisaopoo;

/**
 *s
 * @author User
 */
public class Professor extends Funcionario {

 public Professor(String nome, int matricula) {
           super(nome, matricula);
}

 @Override
 public void Falar(){
         System.out.println("O(a) professor(a) "+getNome()+" esta dando aula");
}
  public void Logar(){
         System.out.println("O(a) professor(a) "+getNome()+" entrou na conta");
}
}
