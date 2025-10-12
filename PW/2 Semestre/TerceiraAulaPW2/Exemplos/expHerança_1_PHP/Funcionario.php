<?php
require_once 'Pessoa.php';

class Funcionario extends Pessoa {
    public $cargo;

    public function __construct($nome,$idade,$cargo){
        parent::__construct($nome, $idade);
        $this->cargo=$cargo;
    }

    public function apresentar(){
        echo "Nome: {$this->nome}, Idade: {$this->idade} anos, Cargo: {$this->cargo}<br>";
    }
}