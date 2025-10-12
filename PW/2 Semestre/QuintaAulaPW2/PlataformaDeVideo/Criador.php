<?php
require 'Usuario.php';
 class Criador extends Usuario{

    public $n_Post;
    public $n_Video;

    public function __construct($nome, $idUser, $senha, $n_Posts, $n_Videos) {
        parent::__construct($nome, $idUser, $senha);
        $this->$n_Posts = $n_Posts;
        $this->$n_Videos = $n_Videos;
    }
    public function Apagar_Comentario(){
        echo "$this->nome apagou o comentario";
    }
    public function Postar_Video(){
        echo "$this->nome postou o video";
    }
    public function Apagar_Video(){
        echo "$this->nome apagaou o video";
    }
    public function Postar_Post(){
        echo "$this->nome postou a postagem";
    }
    public function Apagar_Post(){
        echo "$this->nome apagou a postagem";
    }

    public function Monetizar(){
        echo "$this->nome monetizou o video";
    }
}