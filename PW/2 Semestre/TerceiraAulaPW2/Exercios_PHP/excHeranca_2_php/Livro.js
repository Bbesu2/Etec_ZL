import { Produto } from "./Produto.js";

export class Livro extends Produto {
    constructor(nome, preco, autor){
        super(nome, preco); 
        this.autor = autor;
    }

    apresentar(){
        console.log(`Au au.!!.!`);
    }
}