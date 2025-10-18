/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.funcionario_salario.model;

/**
 *
 * @author Admin
 */
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public String getNome() {return nome;}
    public double getSalario() {return salario;}
    public String getCargo() {return cargo;}

    public void setNome(String nome) {this.nome = nome;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public void setSalario(double salario) {this.salario = salario;
        if(salario>1412.00){System.out.println("Salario aceito");}else
        {System.out.println("Salario rejeitado - abaixo do minimo");}
    }

}
