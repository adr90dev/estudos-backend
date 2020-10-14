package PacoteJava;

import java.util.Scanner;

public class Exercicio5
{

	public static void main (String args[])
	{
		
		Scanner ler = new Scanner (System.in);
		
		int m1, m2, m3;
		float mp;
		
		System.out.println("Digite a primeira nota: ");
		m1 = ler.nextInt();
		System.out.println("Digite a segunda nota: ");
		m2 = ler.nextInt();
		System.out.println("Digite a terceira nota: ");
		m3 = ler.nextInt();
		
		mp = (m1*2 + m2*3 + m3*5)/10;

		System.out.println("Valor da média ponderada é: "+mp);
		
	}
	
}
