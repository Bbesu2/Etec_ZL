/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

public class Main_Animal {
    
     public static void main(String[] args) {
            
         Animal animal = new Animal();
         
         animal.id_Animal=1;
         animal.nome="Toto";
            animal.idade=5;
                animal.tipo = "cachorro";
         
          System.out.println("------------------------Classe Animal 1");
            System.out.println("Numero identificador: " + animal.id_Animal);
            System.out.println("Nome: " + animal.nome);
            System.out.println("Idade: " + animal.idade);
            System.out.println("Profissao: " +  animal.tipo);
            animal.comer();
    }
}
