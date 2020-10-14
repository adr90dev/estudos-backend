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