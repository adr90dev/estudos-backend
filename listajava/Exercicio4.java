package PacoteJava;

import java.util.Scanner;

public class Exercicio4 
{
	public static void main (String args []) 
	{
		float d, s, r;
		int a, b, c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro para A");
		a = ler.nextInt();
		System.out.println("Digite um valor inteiro para B");
		b = ler.nextInt();
		System.out.println("Digite um valor inteiro para C");
		c = ler.nextInt();
	
		r = (float) Math.pow(a + b, 2);
		s = (float) Math.pow(b + c, 2);
		
		d = (float)(r + s)/2;
		
		System.out.println("O valor de D é: "+d);
		
	}
	
	
}
