import { Pessoa } from "./Pessoa.js";

export class Aluno extends Pessoa{
    constructor(nome, cpf, dt_nasc,ra, curso){
        super(nome, cpf,dt_nasc);
        this.ra=ra;
        this.curso=curso;
}
          mostrarInfo(){
            console.log(`Nome: ${this.nome}, CPF: ${this.cpf}, Data Nasc: ${this.dt_nasc}, RA ${this.ra}, Curso: ${this.curso}`);

}
}