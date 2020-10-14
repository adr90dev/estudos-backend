/*create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
	id bigint (5) auto_increment,
    nome varchar (30),
    restricao varchar (20),
    
    primary key (id)
);

create table tb_produto (
	id bigint auto_increment,
    nome varchar (50),
    preco decimal (5,2),
    ativo boolean,
    formato varchar (20),
    id_categoria bigint,
    
    primary key (id),
    foreign key (id_categoria) references tb_categoria (id)
);

insert into tb_produto (nome, preco, ativo, formato, id_categoria) values ("Dorflex", 5.52, true, "10 comprimidos", 1);
insert into tb_produto (nome, preco, ativo, formato, id_categoria) values ("Xarelto", 74.82, true, "10 comprimidos", 2);
insert into tb_produto (nome, preco, ativo, formato, id_categoria) values ("Neosadina", 14.99, true, "20 drágeas", 1);
insert into tb_produto (nome, preco, ativo, formato, id_categoria) values ("Addera D3",50.99, true, "30 cápsulas", 3);
insert into tb_produto (nome, preco, ativo, formato, id_categoria) values ("Torsilax", 12.68, true, "30 comprimidos", 1);
insert into tb_produto (nome, preco, ativo, formato, id_categoria) values ("Amoxicilina", 12.40, true, "15 cápsulas", 4);
insert into tb_produto (nome, preco, ativo, formato, id_categoria) values ("Diclofenaco Dietilamônio", 9.99, true, "pomada (12 gramas)", 5);
insert into tb_produto (nome, preco, ativo, formato, id_categoria) values ("Loratamed", 10.90, true, "12 comprimidos", 6);

insert into tb_categoria (nome, restricao) values ("Analgésico", "Não controlado");
insert into tb_categoria (nome, restricao) values ("Anticoagulante", "Não controlado");
insert into tb_categoria (nome, restricao) values ("Vitamina", "Não controlado");
insert into tb_categoria (nome, restricao) values ("Antibiótico", "Controlado");
insert into tb_categoria (nome, restricao) values ("Anti-Inflamatório", "Não controlado");
insert into tb_categoria (nome, restricao) values ("Anti-Alérgico", "Não controlado");

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria where preco > 50;

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria where preco between 3 and 60;

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria where tb_produto.nome like "%b%";

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria;*/
