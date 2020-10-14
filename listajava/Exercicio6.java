package PacoteJava;

import java.util.Scanner;

public class Exercicio6
{

	public static void main (String args[])
	{
		
		float x1, x2, y1, y2, d, w, z;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de X1: ");
		x1 = ler.nextFloat();
		System.out.println("Digite o valor de X2: ");
		x2 = ler.nextFloat();
		System.out.println("Digite o valor de Y1: ");
		y1 = ler.nextFloat();
		System.out.println("Digite o valor de Y2: ");
		y2 = ler.nextFloat();
		
		w = (float) Math.pow((x2 - x1), 2);
		z = (float) Math.pow((y2 - y1), 2);
		
		d = (float) Math.sqrt(w + z);
	
		System.out.println("O valor da distância D é: "+d);
		
	}
	
}
