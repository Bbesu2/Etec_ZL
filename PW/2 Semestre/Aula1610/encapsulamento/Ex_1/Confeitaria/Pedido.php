*<?php

Class Pedido{
    private $saborBolo;
    private $quantidade;
    private $valorUnitario;

    //constructor
    public function __construct($saborBolo,$quantidade,$valorUnitario){
        $this->saborBolo=$saborBolo;
        $this->quantidade=$quantidade;
    }

    //get
    public function getSaborBolo($saborBolo){$this->saborBolo = $saborBolo;}
    public function getValorUnitario($valorUnitario){$this->valorUnitario = $valorUnitario;}
    public function getQuantidade($quantidade){$this->quantidade = $quantidade;}


    //set
    public function setSaborBolo(){return $this->saborBolo;}
    public function setValorUnitario(){return $this->valorUnitario;}
    public function setQuantidade(){return $this->quantidade;}

    public function calculo(){
        $valorTotal = $this->quantidade * $this->valorUnitario;
        echo "Informacoes do pedido:";
        echo "Sabor do bolo: {$this->saborBolo} - Valor total: {$valorTotal}";
    }
}