package PacoteJava;

import java.util.Scanner;

public class Exercicio8
{
	
	public static void main (String args[])
	{
	
	Scanner ler = new Scanner (System.in);
	
	float cf, cc;
	
	System.out.println("Insira o valor do custo de fabrica��o: ");
	cf = ler.nextInt();
	
	cc = (float) (cf + (cf*0.73));
	
	System.out.println("O custo para o consumidor �: "+cc);
	
	}
}
