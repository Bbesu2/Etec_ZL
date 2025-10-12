<?php
require_once 'Pessoa.php';

class Aluno extends Pessoa{
    private $rm;

    public function __construct($rm,$nome){
       parent::__construct($nome);
        $this->rm=$rm;
        
    }

    public function getRm(): string{
        return $this->rm;
    }
}