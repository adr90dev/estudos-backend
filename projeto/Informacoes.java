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
		
		
		System.out.println("\n\nSeu cadastro foi realizado e seu n�mero de matricula �: " +Andre.getMatricula());
		
		System.out.println("\n\nQual seu objetivo? \n1 -- Ganho de massa muscular \n2 -- Perda de peso \n3 -- Condicionamento f�sico");
		byte opcao;
		opcao = s.nextByte();
		
		switch (opcao) {
		case 1:
			System.out.println("O mais indicado para o inv�duo � focar em treinos com pesos, priorizar treinos com menos \nrepeti��es e mais intensidade, atividade cardiovascular ap�s a atividade com peso, \nde prefer�ncia atividades com baixa intensidade card�aca. Consuma alimentos com alto �ndice \nglic�mico e alta ingest�o de prote�na");
			break;
		case 2:
			System.out.println("O mais indicado para quem quer perder peso � focar em atividade cardiovasculares e atividade com pesos (focar em mais repeti��es e menos intensidade). \nConsuma alimentos com alto �ndice glic�mico e alta ingest�o de prote�na");
			break;
		case 3:
			System.out.println("O mais indicado para quem quer melhorar seu condicionamento f�sico � focar em atividade cardiovasculares e atividade com pesos (focar em mais repeti��es e menos intensidade). \nConsuma alimentos com alto �ndice glic�mico e alta ingest�o de prote�na");
			break;
		}
	}
}