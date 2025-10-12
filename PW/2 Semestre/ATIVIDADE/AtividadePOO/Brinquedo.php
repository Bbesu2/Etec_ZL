<?php

require 'Produto.php';
class Brinquedo extends Produto{

 public $tipo;

 public function __construct($nome,$preco, $tipo){
        parent::__construct($nome, $preco);
        $this->tipo = $tipo;
}
public function exibirInfo(){
            echo "Produto: $this->nome - Preco:R$ $this->preco - Tipo $this->tipo";
        }
}