/* create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria (
id bigint (5) auto_increment,
vegetariana boolean,
nao_vegetariana boolean,

primary key (id)
);

create table tb_pizza (
	id bigint auto_increment,
    sabor varchar(20),
    preco decimal (5,2),
    borda_recheada boolean,
    broto boolean,
    id_categoria bigint,
    
    primary key (id),
    foreign key (id_categoria) references tb_categoria (id)
);

insert into tb_categoria (vegetariana, nao_vegetariana) values (true, false);
insert into tb_categoria (vegetariana, nao_vegetariana) values (true, false);
insert into tb_categoria (vegetariana, nao_vegetariana) values (false, true);
insert into tb_categoria (vegetariana, nao_vegetariana) values (false, true);
insert into tb_categoria (vegetariana, nao_vegetariana) values (false, true);

insert into tb_pizza (sabor, borda_recheada, preco, broto, id_categoria) values ("Mussarela", true, 20, false, 1);
insert into tb_pizza (sabor, borda_recheada, preco, broto, id_categoria) values ("Calabresa", false, 20, false, 3);
insert into tb_pizza (sabor, borda_recheada, preco, broto, id_categoria) values ("Peperoni", false, 30, false, 4);
insert into tb_pizza (sabor, borda_recheada, preco, broto, id_categoria) values ("Frango com Catupity", false, 35, false, 4);
insert into tb_pizza (sabor, borda_recheada, preco, broto, id_categoria) values ("Quatro queijos", true, 40, false, 2);
insert into tb_pizza (sabor, borda_recheada, preco, broto, id_categoria) values ("Escarola", true, 50, true, 1);
insert into tb_pizza (sabor, borda_recheada, preco, broto, id_categoria) values ("Atum", true, 20, false, 3);
insert into tb_pizza (sabor, borda_recheada, preco, broto, id_categoria) values ("Portuguesa", true, 30, false, 1);



select * from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.id_categoria where preco > 45;

select * from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.id_categoria where preco between 29 and 60;

select * from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.id_categoria where tb_pizza.sabor like "%c%";

select * from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.id_categoria;*/


