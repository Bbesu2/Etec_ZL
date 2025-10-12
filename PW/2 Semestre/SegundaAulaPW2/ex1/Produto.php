<?php 
class Produto {
        public $nome;
        public $preco;

        public function exibirInfo(){
            echo "Produto: {$this->nome} - preço:R$ {$this->preco}";
        }
    }
?>