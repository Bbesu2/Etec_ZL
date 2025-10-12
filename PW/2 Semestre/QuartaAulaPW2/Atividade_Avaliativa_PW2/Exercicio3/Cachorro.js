import { Animal } from "./Animal.js";

export class Cachorro extends Animal{
        constructor(nome, especie, raca){
            super(nome, especie);
        this.raca=raca;

    }

    latir(){
        console.log(`O ${this.nome} latiu`);
    }
}