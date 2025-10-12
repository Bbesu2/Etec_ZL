/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestaoDeVeiculos;

public class Carro extends Veiculo {
    private int numeroDePortas;
    
    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    
}

