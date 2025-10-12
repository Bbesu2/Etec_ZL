export class Veiculo{
    constructor(marca, ano){
        this.marca=marca;
        this.ano=ano;
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
        console.log(`Marca: ${this.marca}, Ano: ${this.ano}`)
    }
}