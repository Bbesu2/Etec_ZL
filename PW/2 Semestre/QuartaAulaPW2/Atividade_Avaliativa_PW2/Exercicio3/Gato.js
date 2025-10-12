import { Animal } from "./Animal.js";

export class Gato extends Animal{
        constructor(nome, especie){
            super(nome, especie)
    }

    Miar(){
        console.log(`O ${this.nome} miou`);
    }
}