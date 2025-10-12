<?php
 require 'Produto.php';

 $p1= new Produto();
 $p1->nome="Notebook";
 $p1->preco=3500;
 $p1->exibirInfo();

 echo"</br>";

 $p2= new Produto();
 $p2->nome="Geladeira";
 $p2->preco=4500;
 $p2->exibirInfo();

 echo"</br>"; 

 $p3= new Produto();
 $p3->nome="Conj. Panela";
 $p3->preco=300;
 $p3->exibirInfo();

 echo "</br>";

 $p4= new Produto();
 $p4->nome="Celular";
 $p4->preco=8600;
 $p4->exibirInfo();
?>