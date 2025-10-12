create database Empresa;
use Empresa;
create table tbDepto( idDepto int Primary key,nome varchar(100) not null );

create table tbFunc( idFunc int Primary key, 
nome varchar(100) not null, 
email varchar(100) not null,
idDepto int, constraint fk_idDepto Foreign key (idDepto) references tbDepto(idDepto));

Insert into tbDepto
values (1,'Artes'),(2,'Forja');

Insert into tbFunc(idFunc,nome,email) values (1,'Fulano1','falaninhodograu89@gmail.com');
Insert into tbFunc(idFunc,nome,email) values (2,'Falano2','Fabilanodasfalas@gmail.com');
Insert into tbFunc(idFunc,nome,email) values (3,'Fulano3','Laninho2014@gmai.com');

select * from tbFunc f;

select 
f.idFunc as ID, 
f.nome as nomeFunc, 
f.email as emailFunc,
d.nome as nomeDepto 
from tbFunc f 
left join tbdepto d on (d.idDepto = f.idDepto);