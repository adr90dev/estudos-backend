package ProjetoAcademia;

import java.util.Scanner;

public class Cadastro {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int op;//opção de matricula.
		int op2;//opção de objetivo.
		String nome;
		String nome1;
		String nome2;
		long cpf;
		long rg;
		String genero;
		int idade;
		float altura;
		float peso;
		long ca;//código do aluno.
		
		System.out.println("O que deseja fazer? \n1 -- Cadastrar aluno \n2 -- Consultar situação do aluno");
		op = entrada.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Insira o primeiro nome");
			nome = entrada.next();
			System.out.println("Insira o nome do meio");
			nome1 = entrada.next();
			System.out.println("Insira o terceiro nome");
			nome2 = entrada.next();
			System.out.println("Digite o CPF");
			cpf = entrada.nextLong();
			System.out.println("Digite o RG");
			rg = entrada.nextLong();
			System.out.println("Insira o gênero");
			genero = entrada.next();
			System.out.println("Digite a idade");
			idade = entrada.nextInt();
			System.out.println("Digite o peso atual (em quilogramas)");
			altura = entrada.nextFloat();
			System.out.println("Digite a altura (em centimetros)");
			peso = entrada.nextFloat();
			
			System.out.println("Nome: "+nome+" "+nome1+" "+nome2);
			System.out.println("CPF: "+cpf);
			System.out.println("RG: "+rg);
			System.out.println("Gênero: "+genero);
			System.out.println("Idade: "+idade+" anos");
			System.out.println("Altura: "+altura+" cm");
			System.out.println("Peso atual: "+peso+" kg");
			
			System.out.println("\n\nQual seu objetivo? \n1 -- Ganho de massa muscular \n2 -- Perda de peso \n3 -- Condicionamento físico");
			op2 = entrada.nextInt();
			
			switch (op2) {
			case 1:
				System.out.println("O mais indicado para o invíduo é focar em treinos com pesos, priorizar treinos com menos repetições e mais intensidade, \natividade cardiovascular após a atividade com peso, de preferência atividades com baixa intensidade cardíaca. \nConsuma alimentos com alto índice glicêmico e alta ingestão de proteína");
				break;
			case 2:
				System.out.println("O mais indicado para quem quer perder peso é focar em atividade cardiovasculares e atividade com pesos (focar em mais repetições e menos intensidade). \nConsuma alimentos com alto índice glicêmico e alta ingestão de proteína");
				break;
			case 3:
				System.out.println("O mais indicado para quem quer melhorar seu condicionamento físico é focar em atividade cardiovasculares e atividade com pesos (focar em mais repetições e menos intensidade). \nConsuma alimentos com alto índice glicêmico e alta ingestão de proteína");
				break;
			}
			
			break;
		case 2:
			System.out.println("Insira o código do aluno");
			ca = entrada.nextLong();
			
			System.out.println("Aluno matriculado desde 30/01/2020.\nNenhum débito em aberto.");
			break;
		}
		
		System.out.println("\n\n\n\nMuito Obrigado");
	}
}
