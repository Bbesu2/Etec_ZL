<?php

require_once 'Criador.php';
require_once 'Espectador.php';
require_once 'Video.php';

$c1 = new Criador ("Ana",123123,123,4,12);

$c1->Curtir();

$e1 = new Espectador ("maria",1234,12);

$e1->Curtir();

$v1 = new Video (121,"Melho Video","1:30","12/09/2025");

$v1->Curtir();


