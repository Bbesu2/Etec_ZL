import { Livro } from "./Livro.js";

export class LivroDigital extends Livro {
    constructor(nome, preco, autor, formato){
        super(nome, preco, autor); 
        this.formato = formato;
    }

    mostrarDetalhes(){
        console.log( `Nome: ${this.nome}, Preço ${this.preco} reais, Autor: ${this.autor}, Formato: ${this.formato}`);
    }
}