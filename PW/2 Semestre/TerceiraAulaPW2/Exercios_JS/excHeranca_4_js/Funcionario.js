import { Pessoa } from "./Pessoa.js";

export class Funcionario extends Pessoa {
    constructor(nome, idade, cargo){
        super(nome, idade); 
        this.cargo = cargo;
    }

    Apresentar(){
        console.log( `Nome: ${this.nome}, Idade ${this.idade}, Cargo: ${this.cargo}`);
    }
}