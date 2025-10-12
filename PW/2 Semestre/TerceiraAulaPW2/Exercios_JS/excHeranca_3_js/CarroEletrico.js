import { Carro } from "./Carro.js";

export class CarroEletrico extends Carro {
    constructor(marca, modelo, ano, autonomia){
        super(marca, modelo, ano);
        this.autonomia= autonomia;
    }

    Info(){
        console.log(`Marca: ${this.marca}, Modelo: ${this.modelo}, Ano: ${this.ano}, Autonomia: ${this.autonomia} km/carga`);
    }
}