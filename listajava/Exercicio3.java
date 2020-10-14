package PacoteJava;

import java.util.Scanner;

public class Exercicio3 
{
	public static void main (String args [])
	{
		int ts;
		float hora, minuto, segundo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto para a atividade em segundos: ");
		ts = ler.nextInt();
		
		hora = (ts/3600);
		minuto = (ts%3600)/60;
		segundo = (ts%3600)%60;
		
		System.out.println("Tempo gasto: "+hora+ " horas, "+minuto+ " minutos e "+segundo+ " segundos ");
		
	}
}
