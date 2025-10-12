CREATE TABLE tbNotas(codAluno int primary key null,
codCurso int ,
notaNotas int,
anoNotas  int,
bimestreNotas  date,
observacaoNotas  varchar(50));

insert into tbNotas
values(1,1,10,'3 bimestre',''),
(2,1,9,'3 bimestre',''),
(3,1,8,'3 bimestre',''),
(4,1,7,'3 bimestre',''),
(5,2,5,'3 bimestre',''),
(6,2,3,'3 bimestre','conversa bastante'),
(7,2,1,'3 bimestre',''),
(8,2,7,'3 bimestre','Precisa conversar menos em aula'),
(9,3,8,'3 bimestre',''),
(10,3,0,'3 bimestre','falta muito'),
(11,3,9,'3 bimestre',''),
(12,4,4,'3 bimestre',''),
(13,4,5,'3 bimestre','Dedicado porem nao vem em dia de prova'),
(14,4,6,'3 bimestre',''),
(15,4,10,'3 bimestre','');