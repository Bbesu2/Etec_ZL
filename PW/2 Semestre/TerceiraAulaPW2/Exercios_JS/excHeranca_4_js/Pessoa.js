export class Pessoa {
    constructor(nome, idade){
        this.nome=nome;
        this.idade=idade;
    }

    Apresentar(){
        console.log( `Nome: ${this.nome}, Idade ${this.idade}`);
    }
}