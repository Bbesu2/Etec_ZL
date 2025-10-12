<?php
include_once(__DIR__ . '/../model/Aluno.php');
include_once(__DIR__ . '/../model/Curso');
//criando matricula

//pega os parametros que vieram na requisicao get
$alunoNome=$_GET['nomeAluno'];
$cursoNome=$_GET['nomeCurso'];

//instaciando paremetros
$aPablo = new Aluno($alunoNome);
$cursoDS = new Curso($cursoNome);

$matricula = new Matricula($aPablo,$cursoDS);

var_dump($aPablo);