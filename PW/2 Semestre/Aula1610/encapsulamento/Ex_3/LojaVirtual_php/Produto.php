<?php

Class Produto{
    private $nome;
    private $preco;
    private $estoque;
    private $comprar;
    private $precoAnterior;
    
    //constructor
    public function __construct($nome,$preco,$estoque, $comprar){
        $this->nome=$nome;
        $this->preco = $preco;
        $this->precoAnterior = $preco;
        //necedssario para não atualizar o preco mesmo se der erro
        $this->estoque=$estoque;
        $this->comprar=$comprar;
    }


    //Nome
    public function getNome(){ return $this->nome; }
public function setNome($nome){ $this->nome = $nome; }

    //Comprar
    public function getComprar(){return $this->comprar;}
    public function setComprar($comprar){$this->comprar=$comprar;}
   
    //Preco
public function getPrecoAnterior(){
    return $this->precoAnterior;
}

    public function getPreco(){ return $this->preco; }
    public function setPreco($preco){
    if($preco >= 0){
        $this->precoAnterior = $this->preco;
        $this->preco = $preco;
        } else {
            echo '!!! valores invalidos - não foi possivel mudar o preco do produto !!!';
            echo "</br>";
            echo "Valor atual do produto: {$this->preco} reais";
            echo "</br>";
        }
        }

    //estoque
    public function getEstoque(){return $this->estoque;}
    public function setEstoque($estoque){
    if($estoque >= 0){
        $this->estoque = $estoque;}}
     
        //metodo vender
        public function Vender(){

            $estoqueAtual = $this->getEstoque();
            $comprarEstoque = $this->getComprar();
            $precoValidar = $this->getPreco();
            //If else para estoque

            if ($comprarEstoque>= 0 && $comprarEstoque<=$estoqueAtual){
                $estoqueAtualizado = $estoqueAtual-$comprarEstoque;
                 $this->setEstoque($estoqueAtualizado);}
                echo "</br>";
            if($precoValidar>0) { echo "Venda realizada com sucesso!!";
            echo "</br>";  
            echo "estoque restante: {$this->getEstoque()}";}
                else{echo "!!! valores invalidos !!!";
                    echo "</br>";
                    echo "O valor atual do produto e {$this->getPreco()}";
                    echo "</br>";
                }
        }
            
}