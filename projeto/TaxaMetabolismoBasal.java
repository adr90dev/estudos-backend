package ProjetoAcademia;

import java.util.Scanner;

public class TaxaMetabolismoBasal {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
	
		String genero;
		int op;
		int op2;
		int idade;
		float peso;
		float altura;
		double tmb;
		double ndc1;
		double ndc2;
		double ndc3;
		
		
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		System.out.println("Digite seu peso (em quilogramas): ");
		peso = ler.nextInt();
		System.out.println("Digite sua altura (em centímetros): ");
		altura = ler.nextInt();
		
	
		System.out.println("Escolha gênero: 1 -- Masculino \t2 -- feminino");
		op = ler.nextInt();
	
		switch (op) {
		case 1:
			tmb = 66.5 + (13.75*peso) + (5.0*altura) - (6.8*idade);
			System.out.printf("\nSua Taxa de Metabolismo Basal é: %.2f",tmb);
			
			System.out.println("\n\n\n\nCom qual frequência você pratica atividades físicas? \n\n1 -- Nenhuma atividade física \n\n2 -- Atividade fisíca moderada (meia hora de caminhada, natação ou bicicleta, quatro vezes por semana) \n\n3 -- Atividade física intensa (uma hora de corrida, pelo menos quatro vezes por semana)	");
			op2 = ler.nextInt();
			
			switch (op2) {
			case 1:
				ndc1 = tmb + tmb*0.25;
				System.out.printf("\nSua Necessidade Diária de Calorias é: %.2f",ndc1,"." );
				break;
			case 2:
				ndc2 = tmb + tmb*0.35;
				System.out.printf("\nSua Necessidade Diária de Calorias é: %.2f",ndc2,"." );
				break;
			case 3:
				ndc3 = tmb + tmb*0.45;
				System.out.printf("\nSua Necessidade Diária de Calorias é: %.2f",ndc3,"." );
				break;
			}
			break;
		case 2:
			tmb = 665.1 + (9.56*peso) + (1.8*altura) - (4.7*idade);
			System.out.printf("\nSua Taxa de Metabolismo Basal é: %.2f",tmb);
				
			System.out.println("\n\n\n\nCom qual frequência você pratica atividades físicas? \n\n1 -- Nenhuma atividade física \n\n2 -- Atividade fisíca moderada (meia hora de caminhada, natação ou bicicleta, quatro vezes por semana) \n\n3 -- Atividade física intensa (uma hora de corrida, pelo menos quatro vezes por semana)	");
			op2 = ler.nextInt();
				
			switch (op2) {
			case 1:
				ndc1 = tmb + tmb*0.20;
				System.out.printf("\nSua Necessidade Diária de Calorias é: %.2f",ndc1,"." );
				break;
			case 2:
				ndc2 = tmb + tmb*0.30;
				System.out.printf("\nSua Necessidade Diária de Calorias é: %.2f",ndc2,"." );
				break;
			case 3:
				ndc3 = tmb + tmb*0.40;
				System.out.printf("\nSua Necessidade Diária de Calorias é: %.2f",ndc3,"." );
				break;			
			}
			break;
		}
		
		System.out.println ("\n\nMuito bem!!! Agora que sabemos sua necessidade diária de calorias, podemos traças um plano segundo suas metas!!! \nProcure um(a) de nossos(as) instrutores(as)");
	}
}
