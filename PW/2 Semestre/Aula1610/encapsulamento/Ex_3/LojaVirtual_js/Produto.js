export class Produto{

   constructor(nome, preco, estoque,comprar){
    this.preco=preco;
    this.nome=nome;
    this.estoque=estoque;
    this.comprar=comprar;
   }
   
   //nome
   setNome(nome){this.nome=nome;}
   getNome(){return this.nome}

   //estoque
   setEstoque(estoque){
      if(estoque>=0){
      this.estoque=estoque;}}
   getEstoque(){return this.estoque}

   //preco
   setPreco(preco) {
    if (preco >= 0) {
      //para salvar o preco anterio e não mudar
      //caso der erro
      this.precoAnterior = this.preco;
      this.preco = preco;

      console.log(``);
       console.log(`Mudanca do preco do produto concluida com sucesso!!`)
          console.log(`Valor atual do produto: ${preco} reais`);
          console.log(``);

    } else {
      console.log(``);
      console.log(`!!! valores invalidos - não foi possivel mudar o preco do produto !!!`)
          console.log(`Valor atual do produto: ${this.preco} reais`);
      console.log(``);
   
        }
  }
   getPreco(){return this.preco}

   //comprar
   setComprar(comprar){this.comprar=comprar;}
   getComprar(){return this.comprar}

         vender(){
           const estoqueAtual = this.getEstoque();
           const comprarEstoque = this.getComprar();
           const precoValidar = this.getPreco();

           if(comprarEstoque>+0 && comprarEstoque<=estoqueAtual){
            const estoqueAtualizado = estoqueAtual-comprarEstoque;

            this.setEstoque(estoqueAtualizado);
               console.log('Venda realizada com sucesso!!');
               console.log(' '); 
               console.log(`Estoque restante: ${this.getEstoque()}`)
            } else{console.log('Valores invalidos')}
           }
         }