<?php

require 'Roupa.php';
require 'Brinquedo.php';
require 'Livro.php';

$b1 = new Brinquedo('Lalalupsy',100,'Boneca');
$r1 = new Roupa('Regata',20,'Top','verde');
$l1 = new Livro('O castelo animado',100,'fisico',"Diana Wynne Jones");

$r1->exibirInfo();
$b1->exibirInfo();
$l1->exibirInfo();