package PacoteJava;

/*
 menor		medio		maior
 a			b			c
 a			c			b
 b			a			c
 b			c			a
 c			a			b
 c			c			a
 */

import java.util.*;

public class ExercicioLaco2 {
	
	public static void main (String args[])
	{
		
		Scanner ler = new Scanner (System.in);
		int n1, n2, n3;
		
		System.out.println ("Digite o primeiro n�mero:");
		n1 = ler.nextInt();
		System.out.println ("Digite o segundo n�mero:");
		n2 = ler.nextInt();
		System.out.println ("Digite o terceiro n�mero:");
		n3 = ler.nextInt();
		
		if (n1<=n2 && n2<=n3)
		{
			System.out.println ("A ordem crescente dos n�meros digitados �:"+n1+", "+n2+", "+n3);
		}		
		else if (n1<=n3 && n3<=n2)			
			{
				System.out.println ("A ordem crescente dos n�meros digitados �:"+n1+", "+n3+", "+n2);
			}		
		else if (n2<=n1 && n1<=n3)			
			{
				System.out.println ("A ordem crescente dos n�meros digitados �:"+n2+", "+n1+", "+n3);
			}
		else if (n2<=n3 && n3<=n1)			
			{
				System.out.println ("A ordem crescente dos n�meros digitados �:"+n2+", "+n3+", "+n1);
			}
		else if (n3<=n1 && n1<=n2)
			{
				System.out.println ("A ordem crescente dos n�meros digitados �:"+n3+", "+n1+", "+n2);
			}
		else 			
			{	
				System.out.println ("A ordem crescente dos n�meros digitados �:"+n3+", "+n2+", "+n1);
			}
		
	}

}
