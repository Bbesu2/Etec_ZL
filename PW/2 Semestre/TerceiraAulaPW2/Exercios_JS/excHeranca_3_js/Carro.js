import { Veiculo } from "./Veiculo.js";

export class Carro extends Veiculo {
    constructor(marca, modelo, ano){
        super(marca, modelo,ano);
        this.ano=ano;
    }

    Info(){
        console.log(`Marca: ${this.marca}, Modelo: ${this.modelo}, Ano: ${this.ano}`);
    }
}