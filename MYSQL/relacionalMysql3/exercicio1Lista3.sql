create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
    id bigint (5) auto_increment,
    classe varchar (20),
    poderAtq int,
    poderDef int,
    poderHabil int,

    primary key (id)
);

create table tb_personagem(
	id bigint auto_increment,
    nome varchar (50),
    idade int,
    raca varchar (20),
    genero varchar (20),
    id_classe bigint,
    
    primary key (id),
    foreign key (id_classe) references tb_classe (id)
);

insert into tb_personagem (nome, idade, raca, genero, id_classe) values ("Drigar", 30, "Humano", "Masculino", 1);
insert into tb_personagem (nome, idade, raca, genero, id_classe) values ("Binholaden", 33, "Humano", "Masculino", 2);
insert into tb_personagem (nome, idade, raca, genero, id_classe) values ("Caos", 33, "Fauno", "Masculino", 3);
insert into tb_personagem (nome, idade, raca, genero, id_classe) values ("Geldan", 31,"Gigante", "Masculino", 4);
insert into tb_personagem (nome, idade, raca, genero, id_classe) values ("WRB", 30, "Anão", "Masculino", 5);
insert into tb_personagem (nome, idade, raca, genero, id_classe) values ("Totonho", 28, "Dragoniano", "Masculino", 1);
insert into tb_personagem (nome, idade, raca, genero, id_classe) values ("SonOfLight", 100, "Humano", "Masculino", 1);


insert into tb_classe (classe, poderAtq, poderDef, poderHabil) values ("Guerreiro", 7, 8, 2);
insert into tb_classe (classe, poderAtq, poderDef, poderHabil) values ("Arqueiro", 9, 5, 3);
insert into tb_classe (classe, poderAtq, poderDef, poderHabil) values ("Mago", 3, 5, 9);
insert into tb_classe (classe, poderAtq, poderDef, poderHabil) values ("Necromante", 7, 5, 5);
insert into tb_classe (classe, poderAtq, poderDef, poderHabil) values ("Lanceiro", 8, 7, 2);


select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.id_classe where poderAtq > 2000;

select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.id_classe where poderAtq between 1000 and 2000;

select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.id_classe where tb_personagem.nome like "%c%";

select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.id_classe where classe = "Guerreiro";