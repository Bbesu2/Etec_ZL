import { Pessoa } from "./Pessoa.js";

export class Funcionario extends Pessoa {
    constructor(nome, idade, cargo){
        super(nome, idade); // chama o construtor da classe pai - Pessoa
        this.cargo = cargo;
    }

    apresentar(){
         console.log(`Nome: ${this.nome}, Idade: ${this.idade} anos, Cargo: ${this.cargo}`);
    }
}