<?php

Class AlunoAcd{
    private $nome;
    private $peso;
    private $altura;

    //construtor
    public function __construct($nome,$altura,$peso){
        $this->nome=$nome;
        $this->altura=$altura;
        $this->peso=$peso;
    }

    //get
    public function getNome($nome){$this->nome=$nome;}
    public function getPeso($peso){$this->peso=$peso;}
    public function getAltura($altura){$this->altura=$altura;}

    //set
    public function setNome(){return $this->nome;}
    public function setPeso(){
        if ($this->peso<30)
        {}else{
        return $this->peso;}}
    public function setAltura(){return $this->altura;}

    public function IMC(){
        $imc = $this->setPeso() / $this->setAltura()**2;
        if ($this->setPeso()<30){echo "Valor nao aceito";}else{
        echo "O IMC de {$this->nome} e igual a {$imc}";}
    }
}