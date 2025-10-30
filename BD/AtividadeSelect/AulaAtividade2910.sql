create database lojaMusica;

use LojaMusica;

create table CD(
codigo int primary key, 
nomeCD varchar(50), 
dataCompra int, 
valorPago double, 
localCompra varchar(100),
album varchar(3));

select * from cd;

create table Musicas(
 codigo int, constraint fk_codigo Foreign key (codigo) references CD(codigo),
 numeroMusica int,
 nomeMusica varchar(50),
 artista varchar(50),
 tempo time);

Insert into cd values  (001,"Be the Cowboy",16106023,9.99, "Escuta os cd ai", "sim");
Insert into cd values  (002,"Tudo Que Eu Sempre Sonhei",10012022,14.99, "Escuta os cd ai", "sim");
Insert into cd values  (003,"O Descobrimento do Brasil",23042024,14.99, "Escuta os cd ai", "sim");
Insert into cd values  (004,"Garotinhao Mal",14032016,2.99, "Escuta os cd ai", "nao");
Insert into cd values  (005,"Boys Will Be Bugs",17012023,2.99, "Escuta os cd ai", "nao");
Insert into cd values  (006,"Gratitud",29102023,2.99, "Escuta os cd ai", "sim");

Insert into musicas values  (001,01,"Me and My Hunsdband","Mitsuki",'0:2:17');
Insert into musicas values  (001,02,"Nobody","Mitsuki",'0:3:13');

Insert into musicas values  (002,03,"Tudo Que EU sempre Sonhei","Pullovers",'0:3:37');
Insert into musicas values  (002,02,"O Amor Verdadeiro Nao Tem Vista Para o Mar","Pullovers",'0:3:22');
Insert into musicas values  (001,02,"Licao de Casa","Pullovers",'0:4:11');

Insert into musicas values  (003,02,"Nobody","Mitsuki",'0:3:13');
Insert into musicas values  (001,02,"Nobody","Mitsuki",'0:3:13');
Insert into musicas values  (001,02,"Nobody","Mitsuki",'0:3:13');
Insert into musicas values  (001,02,"Nobody","Mitsuki",'0:3:13');
Insert into musicas values  (001,02,"Nobody","Mitsuki",'0:3:13');
Insert into musicas values  (001,02,"Nobody","Mitsuki",'0:3:13');
Insert into musicas values  (001,02,"Nobody","Mitsuki",'0:3:13');
Insert into musicas values  (001,02,"Nobody","Mitsuki",'0:3:13');
Insert into musicas values  (001,01,"Nobody","Mitsuki",'0:3:13');
Insert into musicas values  (001,02,"Nobody","Mitsuki",'0:3:13');

