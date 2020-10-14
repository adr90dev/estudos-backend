use db_diversos
create table tb_produtos(
	id_produto bigint(5) auto_increment,
    categoria varchar (50),
    preco decimal (10,2),
    marca varchar (15),
    ativo boolean,
    
    primary key (id_produto)
)

alter table tb_produtos add tipo varchar (25)

insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("cozinha", 1500.00, "eletrolux", true, "fogão");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("cozinha", 500.00, "eletrolux", true, "microondas");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("cozinha", 3500.00, "eletrolux", true, "lava-louças");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("cozinha", 2500.00, "eletrolux", true, "geladeira");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("sala", 4000.00, "lg", true, "televisão");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("sala", 1500.00, "samsung", true, "hometheater");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("sala", 1500.00, "sony", true, "PS4");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("sala", 5000.00, "sentado nas nuvens", true, "sofá");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("sala", 1500.00, "madeira madeira", true, "painel");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("quarto", 4500.00, "madeira madeira", true, "cama king");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("quarto", 3500.00, "madeira madeira", true, "guarda-roupas");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("quarto", 500.00, "mobli", true, "sapateira");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("quarto", 1000.00, "mobli", true, "cômoda");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("banheiro", 100.00, "ducha", true, "chuveiro");
insert into tb_produtos (categoria, preco, marca, ativo, tipo) values ("banheiro", 300.00, "sentado nas nuvens", true, "vaso sanitário");

select * from tb_produtos where tipo like "a%"

select * from tb_produtos where categoria="cozinha";

select * from tb_produtos where categoria="cozinha" and preco between 1000.00 and 1500.00;

select * from tb_produtos where categoria like "%sala%";