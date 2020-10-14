use db_diversos
create table tb_petshop(
	id bigint auto_increment,
    peso float,
    especie varchar(20),
    nome varchar (20),
    idade int,
    entrada datetime,
    alta datetime,
    sexo varchar (10)
    
    primary key (id)
)

alter table tb_petshop add sexo varchar (10)

insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (20.0, "cachorro", "Sherlock", 8, "2020-06-23 06:15:00", "2020-06-26 11:00:00", "macho");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (25.0, "cachorro", "Dini", 8, "2020-05-23 12:45:00", "2020-05-23 15:00:00", "femea");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (5.0, "cachorro", "Bebe", 6, "2020-01-02 05:10:00", "2020-01-02 10:05:00", "macho");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (3.0, "gato", "Mimi", 4, "2020-03-23 09:45:00", "2020-03-26 09:00:00", "femea");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (1.5, "Papagaio", "Loreco", 5, "2020-04-04 02:20:00", "2020-04-04 03:00:00", "macho");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (0.1, "periquito", "Kiko", 3, "2020-08-23 09:45:00", "2020-08-26 09:00:00", "macho");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (25, "cachorro", "Bubby", 1, "2020-09-25 09:45:00", "2020-09-25 12:00:00", "macho");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (6.0, "cachorro", "Bob", 8, "2019-08-23 09:45:00", "2019-08-26 15:00:00", "macho");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (3.0, "coelho", "MrRabbit", 1, "2020-08-23 07:45:00", "2020-08-26 09:00:00", "macho");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (0.2, "peixe", "Mobby", 1, "2020-08-23 06:45:00", "2020-08-26 09:00:00", "macho");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (9.0, "cachorro", "Zara", 1, "2020-08-23 09:45:00", "2020-08-26 09:00:00", "femea");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (1.0, "coruja", "Hohoo", 2, "2018-05-23 10:45:00", "2018-05-23 12:00:00", "femea");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (10.0, "cobra", "Nagile", 5, "2020-08-23 09:45:00", "2020-08-26 12:00:00", "femea");
insert into tb_petshop (peso, especie, nome, idade, entrada, alta, sexo) values (5.0, "porco", "Jorge", 3, "2017-08-01 11:45:00", "2017-08-01 15:00:00", "macho");

select * from tb_petshop where peso > 10

select * from tb_petshop where peso < 10

select * from tb_petshop where peso between 10 and 30