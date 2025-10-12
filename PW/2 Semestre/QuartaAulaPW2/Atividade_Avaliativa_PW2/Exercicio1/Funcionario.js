import { Pessoa } from "./Pessoa.js";

export class Funcionario extends Pessoa{
    constructor(nome, cpf, dt_nasc,rgm,cargo){
        super(nome, cpf,dt_nasc);
        this.rgm=rgm;
        this.cargo=cargo;
    }

 mostrarInfo(){
             console.log(`Nome: ${this.nome}, CPF: ${this.cpf}, Data Nasc: ${this.dt_nasc}, Rgm: ${this.rgm}, Cargo: ${this.cargo}`);
}
}