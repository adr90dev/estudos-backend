package PacoteJava;

import java.util.*;

public class ExercicioLaco1 {
	
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
		
		if (n1>n2 && n1>n3)
		{
			System.out.printf ("Esse foi o maior n�mero digitado: %d",n1);
		}
		
		else if (n2>n1 && n2>n3)
			
		{
			System.out.printf ("Esse foi o maior n�mero digitado: %d",n2);
		}
		
		else if (n3>n1 && n3>n2)
			
		{
			System.out.printf ("Esse foi o maior n�mero digitado: %d",n3);
		}
		
	}

}
