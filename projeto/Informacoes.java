package ProjetoAcademia;

import java.util.Scanner;

public class Informacoes 
{	public static Scanner s = new Scanner(System.in);
	public static void main (String args[])
	{
		Matricula Andre = new Matricula ("Andre",44,"masculino",1,70,123,011223344,0232325365);
		Andre.chegou();
		System.out.println("- NOME: "+Andre.getNome());
		System.out.println("- IDADE: "+Andre.getIdade()+" anos.");
		System.out.println("- GENERO: "+Andre.getGenero());
		System.out.println("- ALTURA: "+Andre.getAltura()+" metros.");
		System.out.println("- PESO: "+Andre.getPeso()+" Kilogramas.");
		System.out.println("- ID: "+Andre.getId());
		System.out.println("- CPF: "+Andre.getCpf());
		
		
		System.out.println("\n\nSeu cadastro foi realizado e seu número de matricula é: " +Andre.getMatricula());
		
		System.out.println("\n\nQual seu objetivo? \n1 -- Ganho de massa muscular \n2 -- Perda de peso \n3 -- Condicionamento físico");
		byte opcao;
		opcao = s.nextByte();
		
		switch (opcao) {
		case 1:
			System.out.println("O mais indicado para o invíduo é focar em treinos com pesos, priorizar treinos com menos \nrepetições e mais intensidade, atividade cardiovascular após a atividade com peso, \nde preferência atividades com baixa intensidade cardíaca. Consuma alimentos com alto índice \nglicêmico e alta ingestão de proteína");
			break;
		case 2:
			System.out.println("O mais indicado para quem quer perder peso é focar em atividade cardiovasculares e atividade com pesos (focar em mais repetições e menos intensidade). \nConsuma alimentos com alto índice glicêmico e alta ingestão de proteína");
			break;
		case 3:
			System.out.println("O mais indicado para quem quer melhorar seu condicionamento físico é focar em atividade cardiovasculares e atividade com pesos (focar em mais repetições e menos intensidade). \nConsuma alimentos com alto índice glicêmico e alta ingestão de proteína");
			break;
		}
	}
}