package PacoteJava;

import java.util.Scanner;

public class exercicioRepeticao5 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner(System.in);
		
		int x, soma = 0;	
		
		do
		{
			System.out.println("Digite um n�mero: ");
			x = entrada.nextInt();
			
			soma = soma + x;
			
		}while (x>0);
		
		
		
		System.out.println("A soma dos n�meros digitados foi de: "+soma);
		
	}
}
