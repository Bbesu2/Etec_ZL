import { Veiculo } from "./Veiculos.js";

export class Caminhao extends Veiculo{
     constructor(marca, ano,cap_Carga){
        super(marca, ano);
        this.cap_Carga=cap_Carga;
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
        console.log(`Marca: ${this.marca}, Ano: ${this.ano}, Cap. Carga: ${this.cap_Carga}`)
    }
}