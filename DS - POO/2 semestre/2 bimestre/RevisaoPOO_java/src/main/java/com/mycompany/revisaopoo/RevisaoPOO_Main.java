/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.revisaopoo;

/**
 *
 * @author User
 */
public class RevisaoPOO_Main {

    public static void main(String[] args) {

         System.out.println("----------------");
            System.out.println("");
            
        Usuario u1  = new Usuario("Pablo");
            u1.Logar();
            
        Aluno a1 = new Aluno ("Pablo",1);
        a1.Logar();
        a1.Falar();
        
        System.out.println("");
            System.out.println("----------------");
            System.out.println("");
            
        Usuario u2 = new Usuario("Flavia");
            u2.Logar();
            
        Funcionario f1 = new Funcionario("Flavia",1);
            f1.Logar();

       Professor p1 = new Professor("Flavia",1);
       p1.Falar();
       
       System.out.println("");
            System.out.println("----------------");
            System.out.println("");
    }
}
