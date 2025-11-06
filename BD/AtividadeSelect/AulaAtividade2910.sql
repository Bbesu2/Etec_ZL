create database lojaMusica;

use LojaMusica;

create table CD(
codigo int primary key, 
nomeCD varchar(50), 
dataCompra int, 
valorPago double, 
localCompra varchar(100),
album varchar(3));

create table Musicas(
 codigo int, constraint fk_codigo Foreign key (codigo) references CD(codigo),
 numeroMusica int,
 nomeMusica varchar(50),
 artista varchar(50),
 tempo time);

Insert into cd values  (001,"Be the Cowboy",16106023,9.99, "Escuta os cd ai", "sim");
Insert into cd values  (002,"Tudo Que Eu Sempre Sonhei",10012022,14.99, "Escuta os cd ai", "sim");
Insert into cd values  (003,"Que Pais E Este",23042024,14.99, "Escuta os cd ai", "sim");
Insert into cd values  (004,"Garotinhao Mal",14032016,2.99, "Escuta os cd ai", "nao");
Insert into cd values  (005,"Boys Will Be Bugs",17012023,2.99, "Escuta os cd ai", "nao");
Insert into cd values  (006,"Gratitud",29102023,2.99, "Escuta os cd ai", "sim");
Insert into cd values  (007,"Os Anjos",05112024,2.99, "Escuta os cd ai", "nao");

# -----------------------------------------------------------------

drop table Musicas;

#musicas da mitsuki
Insert into musicas values  (001,01,"Me and My Hunsdband","Mitsuki",'0:2:17');
Insert into musicas values  (001,02,"Nobody","Mitsuki",'0:3:13');
Insert into musicas values  (001,03,"Washing Machine Heart","Mitsuki",'0:2:09');

#musicas dos Pullovers
Insert into musicas values  (002,04,"Tudo Que EU sempre Sonhei","Pullovers",'0:3:37');
Insert into musicas values  (002,05,"O Amor Verdadeiro Nao Tem Vista Para o Mar","Pullovers",'0:3:22');
Insert into musicas values  (002,06,"Licao de Casa","Pullovers",'0:4:11');
Insert into musicas values  (002,07,"Todas as canções são de amor","Pullovers",'0:3:57');

#musicas da Legiao Urbana
Insert into musicas values  (003,08,"Que Pais É Este","Legiao Urbana",'0:2:59');
Insert into musicas values  (003,09,"Tédio (Com Um T Bem Grande P'ra Você)","Legiao Urbana",'0:2:34');
Insert into musicas values  (003,10,"Faroeste Caboclo","Legiao Urbana",'0:9:07');
Insert into musicas values  (003,11,"Eu Sei","Legiao Urbana",'0:3:11');

Insert into musicas values  (004,12,"Garotinhao Mal","Fernando Mendonça e Lucas Gama",'0:3:13');

Insert into musicas values  (005,13,"Boys Will Be Bugs","Cavetown",'0:3:13');

#musicas do los espiritos
Insert into musicas values  (006,14,"Perro Viejo","Los Espíritus",'0:6:40');
Insert into musicas values  (006,15,"Negro Chico","Los Espíritus",'0:4:03');
Insert into musicas values  (006,16,"Vamos A La Luna","Los Espíritus",'0:5:29');

#Legiao Urbana
Insert into musicas values  (007,17,"Os Anjos","Legiao Urbana",'0:2:06');

#codigo select - CD
#1 - select  * from cd;
#2 - select nomeCD, dataCompra from cd order by NomeCD;
#3 - select nomeCD, dataCompra from cd order by dataCompra desc;
#4 - select nomeCD, dataCompra, valorPago from cd order by valorPago desc;
#5 - select sum(valorPago) from cd;
#11 - select nomeCD from CD where localCompra = "Escuta os cd ai";
#13 - select * from cd where album = "sim";
#14 - select avg(valorPago) from cd;

#codigo select - musicas
#6 - select  * from musicas where codigo = 1;
#7 - select nomeMusica, artista from musicas;
#8 - select numeroMusica, nomeMusica, tempo from musicas where codigo = 5 order by numeroMusica;
#9 - select count(numeromusica) from musicas;
#10 - select nomeMusica from musicas where artista = "Legiao Urbana"; 
#12 - select * from musicas order by nomeMusica;
