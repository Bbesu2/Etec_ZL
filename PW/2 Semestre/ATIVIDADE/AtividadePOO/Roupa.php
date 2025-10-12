<?php

require 'Produto.php';
class Roupa extends Produto{

 public $tipo;
  public $cor;

 public function __construct($nome,$preco, $tipo,$cor){
        parent::__construct($nome, $preco);
        $this->tipo = $tipo;
        $this->cor = $cor;
}
public function exibirInfo(){
            echo "Produto: $this->nome - Preco:R$ $this->preco - Tipo$this->tipo - Cor $this->cor";
        }
}