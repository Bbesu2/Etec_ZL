<?php

require 'Produto.php';

$pr1 = new Produto("Bola inflavel",10,5,4);

$pr1->setPreco(20);

$pr1->Vender();
