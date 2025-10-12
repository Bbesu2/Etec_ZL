import { Animal } from "./Animal.js";

export class Cachorro extends Animal {
    constructor(nome, idade){
        super(nome, idade); 
    }

    apresentar(){
        console.log(`Au au.!!.!`);
    }
}