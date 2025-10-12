<?php
 class Video{

    public $n_Views;
    public $nomeVideo;
    public $duracaoVideo;
    public $dataPostagem;

    public function PostarVideo(){
        echo "$this->nomeVideo} foi postado";
    }
}