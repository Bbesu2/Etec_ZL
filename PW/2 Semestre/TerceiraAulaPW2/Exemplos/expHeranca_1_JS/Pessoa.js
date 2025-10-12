export class Pessoa {
    constructor(nome, idade){
        this.nome=nome;
        this.idade=idade;
    }

    apresentar(){
        console.log(`Nome: ${this.nome}, Idade: ${this.idade} anos`);
    }
}