<?php

 class Usuario{

    public $idUser;
    public $nome;
    private $senha;

    public function __construct($nome, $idUser, $senha) {
        $this->nome = $nome;
        $this->$senha = $senha;
        $this->$idUser = $idUser;
    }

    //metodos
    public function Curtir(){
        echo "$this->nome curtiu o video";
    }
    public function Inscrever(){
        echo "$this->nome se inscreveu no canal";
    }

    public function Comentar(){
        echo "$this->nome comentou no video";
    }

    public function Apagar(){
        echo "$this->nome apagou o proprio comentario";
    }

    public function Denunciar_Video(){
        echo "$this->nome denunciou o video";
    }
    public function Denunciar_Comentario(){
        echo "$this->nome denunciou o video";
    }
}