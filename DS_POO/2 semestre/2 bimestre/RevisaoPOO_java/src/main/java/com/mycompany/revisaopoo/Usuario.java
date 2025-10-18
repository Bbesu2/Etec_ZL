/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisaopoo;

/**
 *
 * @author User
 */
public class Usuario extends Pessoa{

 public Usuario(String nome){
     super(nome);
}

 public void Logar(){
         System.out.println("O(a) usuario(a) "+getNome()+" logu");
}
}


