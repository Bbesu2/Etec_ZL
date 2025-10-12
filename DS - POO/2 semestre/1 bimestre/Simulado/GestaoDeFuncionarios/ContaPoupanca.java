/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestaoDeFuncionarios;

public class ContaPoupanca extends Conta {
    private double taxaDeRendimento;

    public ContaPoupanca(String numero, double saldo, double taxaDeRendimento) {
        super(numero, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaDeRendimento;
    }
}

