<?php
require 'Pessoa.php';

$pessoa1 = new Pessoa();
$pessoa1-> dataNascimento = "17/01/2009";
$pessoa1-> nome = "Besu";


$pessoa2 = new Pessoa();
$pessoa2-> dataNascimento = "17/02/2009";
$pessoa2-> nome = "Arlo Charlie Ramon";

$pessoa1->imprimeDados();
echo"</br>";
$pessoa2->imprimeDados();