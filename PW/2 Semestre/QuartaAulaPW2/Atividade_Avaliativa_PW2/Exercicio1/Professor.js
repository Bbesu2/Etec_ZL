import {Pessoa} from "./Pessoa.js";

export class Professor extends Pessoa{
     constructor(nome, cpf, dt_nasc,rf,disciplina){
        super(nome, cpf,dt_nasc);
        this.rf=rf;
        this.disciplina=disciplina;
    }
      mostrarInfo(){
            console.log(`Nome: ${this.nome}, CPF: ${this.cpf}, Data Nasc: ${this.dt_nasc}, RF: ${this.rf}, Disciplina: ${this.disciplina}`);
}
}