export class Produto {
    constructor(nome, preco){
        this.nome=nome;
        this.preco=preco;
    }

    mostrarDetalhes(){
        console.log( `Nome: ${this.nome}, Preço ${this.preco}`);
    }
}