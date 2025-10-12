import { Produto } from "./Produto.js";

export class Livro extends Produto {
    constructor(nome, preco, autor){
        super(nome, preco); 
        this.autor = autor;
    }

    mostrarDetalhes(){
        console.log( `Nome: ${this.nome}, Preço ${this.preco}, Autor: ${this.autor}`);
    }
}