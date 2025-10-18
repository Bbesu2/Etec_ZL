<?php

Class Produto{
    private $nome;
    private $preco;
    private $estoque;
    private $comprar;
    
    //constructor
    public function __construct($nome,$preco,$estoque, $comprar){
        $this->nome=$nome;
        $this->preco=$preco;
        $this->estoque=$estoque;
        $this->comprar=$comprar;
    }


    //Nome
    public function getNome($nome){$this->nome=$nome;}
    public function setNome(){return $this->nome;}

    //Comprar
    public function getComprar($comprar){$this->comprar=$comprar;}
    public function setComprar(){return $this->comprar;}

    //Preco
    public function getPreco($preco){$this->preco=$preco;}
    public function setPreco(){
        if($this->preco>0){
    return $this->preco;}
    else{}}       

    //estoque
    public function getEstoque($estoque){$this->estoque=$estoque;}
    public function setEstoque(){
        if($this->estoque>0 && $this->estoque%2===0){
        return $this->estoque;}}

        //metodo vender
        public function Vender(){

            $valor = $this->setEstoque() - $this->setComprar();

                    //Mensagem caso der certo
               if ($this->setEstoque() - $this->setComprar()) {echo 'Venda realizada!!';}
                    //Mensagem de erro
                else{echo "Numero invalido";}
            echo "</br>";
            echo "estoque restante: {$valor}";
        }

        public function Preco(){
            
        }
}