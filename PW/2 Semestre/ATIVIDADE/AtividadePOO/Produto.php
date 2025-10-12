<?php

class Produto {
        public $nome;
        public $preco;

        public function __construct($nome,$preco){
            $this->nome=$nome;
            $this->preco=$preco;
        }

        public function exibirInfo(){
            echo "Produto: $this->nome - Preco:R$ $this->preco";
        }
    }