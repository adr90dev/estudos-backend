package PacoteJava;

import java.util.*;

public class ExercicioLaco4 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		double n;
		
		System.out.println("Digite um n�mero: ");
		n = ler.nextInt();
		
		if(n%2 == 0)
		{
			n = Math.sqrt(n);
		}
		else
		{
			n = Math.pow(n,2);	
		}
		
		System.out.printf("Valor dos n�mero digitado calculado de acordo com as condi��es descritas �: %5.2f",n);/*quando usamos o printf, concatenamos com virgula en�o com mais, e temos que identificar de que tipo ele � com %d, %d, %f (aqui podemos escolher a quantidade de casas que queremos imprimir, no exemplo escolhemos mostrar 5 casas decimais para esquerda e duas para a direita e f vem de float)*/
		
	}

}
