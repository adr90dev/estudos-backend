create database db_diversos;
use db_diversos
create table tb_escola(
	id bigint auto_increment,
    nome varchar(50),
    idade int,
    serie int,
    periodo varchar(10),
    media int,
    situação varchar (15),
    
    primary key (id)    
)

insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Ademir da Guia", 13, 6, "manhã", 8, "Aprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Edson Batista", 12, 6, "tarde", 5, "Reprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Garrincha de Oliveira", 13, 6, "manhã", 6, "Recuperação");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Marta Rocha", 13, 6, "manhã", 8, "Aprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Bernardo Gomes", 13, 6, "manhã", 8, "Aprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Matheus Vieira", 12, 6, "manhã", 8, "Aprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Magda Antibes", 12, 6, "manhã", 8, "Aprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Cassandra Antunes", 13, 6, "tarde", 3, "Reprovadp");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Rogerio Ceni", 14, 6, "tarde", 5, "Reprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Decio Marco", 13, 6, "tarde", 5, "Reprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Marco Antonio", 14, 6, "manhã", 8, "Aprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Rosa de Cassia", 13, 6, "manhã", 8, "Aprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Vilma Alvez", 13, 6, "manhã", 8, "Aprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Antonio de Matos", 12, 6, "manhã", 8, "Aprovado");
insert into tb_escola (nome, idade, serie, periodo, media, situação) values ("Vitor Junior", 13, 6, "manhã", 6, "Recuperação");

select * from tb_escola where idade < 18

select * from tb_escola where idade > 18

select * from tb_escola where idade between 20 and 25