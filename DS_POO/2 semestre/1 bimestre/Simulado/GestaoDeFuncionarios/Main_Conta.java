/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestaoDeFuncionarios;

public class Main_Conta {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("001", 10000, 5000);
        System.out.println("Conta Corrente " + cc.getNumero() + " - Saldo inicial: " + cc.getSaldo());
        cc.sacar(1.200);
        System.out.println("Saldo apos saque: " + cc.getSaldo());
        cc.depositar(300);
        System.out.println("Saldo apos deposito: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca("002", 2000, 05);
        System.out.println("Conta Poupanca " + cp.getNumero() + " - Saldo inicial: " + cp.getSaldo());
        cp.aplicarRendimento();
        System.out.println("Saldo apos rendimento: " + cp.getSaldo());
    }
}

