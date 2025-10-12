import { Veiculo } from "./Veiculos.js";

export class Carro extends Veiculo{
     constructor(marca, ano,modelo){
        super(marca, ano);
        this.modelo=modelo;
     }
         Ligar(){
        console.log("O veiculo esta ligado")
    }
    Desligar(){
        console.log("O veiculo esta desligado")
    }
    Acelerar(){
        console.log("O veiculo esta acelerando")
    }
    Frear(){
        console.log("O veiculo esta freando")
    }
    
    Info(){
        console.log(`Marca: ${this.marca}, Ano: ${this.ano}, Modelo: ${this.modelo}`)
    }
}