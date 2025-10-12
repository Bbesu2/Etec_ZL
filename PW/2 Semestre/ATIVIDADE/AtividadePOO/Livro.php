<?php

require 'Produto.php';
class Livro extends Produto{

 public $tipo;
  public $autor;

 public function __construct($nome,$preco, $tipo,$autor){
        parent::__construct($nome, $preco);
        $this->tipo = $tipo;
        $this->autor = $autor;
}
public function exibirInfo(){
            echo "Produto: $this->nome - Preco:R$ $this->preco - Tipo: $this->tipo";
        }
}

