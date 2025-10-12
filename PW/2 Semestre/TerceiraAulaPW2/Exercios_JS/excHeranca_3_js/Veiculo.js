export class Veiculo {
    constructor(marca, modelo){
        this.marca=marca;
        this.modelo=modelo;
    }

    Info(){
        console.log(`Marca: ${this.marca}, Modelo: ${this.modelo}`);
    }
}