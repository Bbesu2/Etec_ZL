export class Pessoa{
    constructor(nome, cpf, dt_nasc){
        this.nome=nome;
        this.cpf=cpf;
        this.dt_nasc=dt_nasc;
    }
        mostrarInfo(){
             console.log(`Nome: ${this.nome}, CPF: ${this.cpf}, Data Nasc: ${this.dt_nasc}`);
}
}