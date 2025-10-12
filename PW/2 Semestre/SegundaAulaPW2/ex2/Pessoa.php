<?php

class Pessoa{
    var $dataNascimento;
    var $nome;

    public function imprimeDados(){
        echo "Data de Nascimento: ". $this->dataNascimento;
        echo " - Nome: ". $this->nome;
    }
    public function showNome($nome){
        return $this->nome;
    }
}