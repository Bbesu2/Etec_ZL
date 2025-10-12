<?php

require "Usuario.php";

class Espectador extends Usuario{
    
    public function __construct($nome, $idUser, $senha) {
        parent::__construct($nome, $idUser, $senha);}

    public function VirarCriador(){
        echo "$this->nome virou um criador";
    }

}