create database db_empresa
use db_empresa;
create table tb_funcionario(
	id bigint auto_increment,
    	nome varchar (50),
    	idade int,
    	estadoCivil varchar (10),
    	filhos boolean,
    	salario decimal (10,2),
    
    primary key (id)
)

insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("João da Silva", 25, "casado", false, 1000.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("José Ribeiro", 30, "solteiro", false, 2500.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Regina Duarte", 35, "divorciado", true, 2500.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Maria da Graça", 40, "viúvo", true, 3000.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Gloria Pires", 45, "casado", true, 3000.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Fátima Bernardes", 44, "casado", false, 3000.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Fábio Pereira", 26, "viúvo", false, 1800.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Miguel Azevedo", 28, "divorciado", false, 1800.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Ana Melo", 31, "solteiro", false, 2500.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Julia Rodrigues", 32, "solteiro", true, 2500.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Jessica Pinho", 33, "casado", false, 2500.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Juliana Veloso", 50, "casado", true, 3000.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Marcos Veras", 47, "solteiro", false, 3000.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("William Pacheco", 22, "solteiro", false, 800.00);
insert into tb_funcionario (nome, idade, estadoCivil, filhos, salario) values ("Mario Machado", 20, "solteiro", false, 800.00);

select * from tb_funcionario where salario > 2000.00; 

select * from tb_funcionario where salario < 2000.00; 

delete from tb_funcionario where id = 1;









create database db_Ecommerce;
use db_Ecommerce;
create table tb_produtos (
	id bigint(5) auto_increment,
	descrição varchar(50),
	marca varchar(50),
    valor decimal (10,2),
    ativo boolean,
    
    primary key
)
insert into tb_produtos (descrição, marca, valor, ativo) values ("camiseta", "Nike", 89.90, true);
insert into tb_produtos (descrição, marca, valor, ativo) values ("shorts", "Nike", 99.90, true);
insert into tb_produtos (descrição, marca, valor, ativo) values ("boné", "Nike", 149.90, true);
insert into tb_produtos (descrição, marca, valor, ativo) values ("meia", "Nike", 39.90, true);
insert into tb_produtos (descrição, marca, valor, ativo) values ("tênis", "Nike",499.90, true);
insert into tb_produtos (descrição, marca, valor, ativo) values ("chuteira", "Nike", 209.90, true);
insert into tb_produtos (descrição, marca, valor, ativo) values ("moletom", "Nike", 269.90, true);
insert into tb_produtos (descrição, marca, valor, ativo) values ("jaqueta", "Nike", 199.90, true);
insert into tb_produtos (descrição, marca, valor, ativo) values ("touca", "Nike", 49.90, true);
insert into tb_produtos (descrição, marca, valor, ativo) values ("regata", "Nike", 69.90, true);

select * from tb_produtos where valor > 500;

select * from tb_produtos where valor < 500;

update tb_produtos set ativo = false where id = 1









create database db_Escola
create database db_Escola
create table tb_alunos (
	id bigint(5) auto_increment,
    nome varchar(50),
    idade int,
    mediaNota int,
    serie int,
    periodo varchar (10),
    
    primary key(id)
)
insert into tb_alunos (nome, idade, mediaNota, serie, periodo) values ("Francisco do Nascimento", 13, 5, 8, "manhã");
insert into tb_alunos (nome, idade, mediaNota, serie, periodo) values ("Ana Carolina de Souza Braga", 14, 3, 7, "tarde");
insert into tb_alunos (nome, idade, mediaNota, serie, periodo) values ("Fernanda Rangel", 15, 6, 6, "manhã");
insert into tb_alunos (nome, idade, mediaNota, serie, periodo) values ("Danielle do Nascimento", 15, 10, 5, "tarde");
insert into tb_alunos (nome, idade, mediaNota, serie, periodo) values ("Celia Maria", 17, 5, 8, "manhã");
insert into tb_alunos (nome, idade, mediaNota, serie, periodo) values ("Jessica Pereira", 16, 7, 8, "manhã");
insert into tb_alunos (nome, idade, mediaNota, serie, periodo) values ("Mirella Santos", 12, 6, 7, "manhã");
insert into tb_alunos (nome, idade, mediaNota, serie, periodo) values ("Carolina Drumond", 11, 8, 7, "tarde");
insert into tb_alunos (nome, idade, mediaNota, serie, periodo) values ("Natalia Vuldarsti", 13,9, 6, "tarde");
insert into tb_alunos (nome, idade, mediaNota, serie, periodo) values ("Leticia Maria", 14, 8, 6, "manhã");

select * from tb_alunos where mediaNota >= 7;

select * from tb_alunos where mediaNota < 7;

update tb_alunos set mediaNota = 1 where id = 2;

