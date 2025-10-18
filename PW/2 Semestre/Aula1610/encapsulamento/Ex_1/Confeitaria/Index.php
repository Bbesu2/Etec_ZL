<?php
require_once 'Pedido.php';

$p1 = new Pedido("Chocolate",3,29.99);
$p1->calculo();