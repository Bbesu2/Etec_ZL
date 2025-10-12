CREATE DATABASE ESCOLA;

use escola;

CREATE TABLE tbAluno(codAluno int primary key null,
nome varchar(50),
endAluno varchar(100),
telAluno varchar(20),
nascAluno date,
paiAluno varchar(50),
maeAluno varchar(50),
respoAluno varchar(50));

CREATE TABLE tbProfessor(codProfessor int primary key null,
nomeProfessor varchar(50),
endProfessor varchar(100));

CREATE TABLE tbCurso(codCurso int primary key null,
nomeCurso varchar(50),
codProfessor int );

CREATE TABLE tbNotas(codAluno int primary key null,
codCurso int ,
notaNotas int,
anoNotas  int,
bimestreNotas  date,
observacaoNotas  varchar(50));
