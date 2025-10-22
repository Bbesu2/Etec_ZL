/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadegestãodeveículosdeentrega;

/**
 *
 * @author Administrador
 */
public class Veiculo {
        String modelo;
    String placa;
    double capacidedeDeCarga;

    
    public void exibirInfo(){
        System.out.println("-------- Veiculo -------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Capacidede de Carga: " + capacidedeDeCarga);
        System.out.println("------------------------------");
}
}