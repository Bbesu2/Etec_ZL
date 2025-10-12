import { Funcionario } from "./Funcionario.js";

export class Gerente extends Funcionario {
    constructor(nome, idade, cargo, departamento){
        super(nome, idade, cargo); 
        this.departamento = departamento;
    }

    Apresentar(){
        console.log( `Nome: ${this.nome}, Idade ${this.idade}, Cargo: ${this.cargo}, Departamento: ${this.departamento}`);
    }
}