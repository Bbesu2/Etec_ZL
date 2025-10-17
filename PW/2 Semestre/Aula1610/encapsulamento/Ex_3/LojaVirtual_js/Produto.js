class Produto{

   constructor(nome, preco, estoque){
    this.preco=preco;
    this.nome=nome;
    this.estoque=estoque;
   }

   function getNome(nome) {
        this.nome=nome;
   }
   
}