package Arrays;

import java.util.Scanner;

/*
 * 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */

public class Exercicio1 {
	public static void main (String args [])
	{
		
		Scanner ler = new Scanner (System.in);
		
		int[] vetor = {1, 0, 5, -2, 100, 7};
		int soma;
		
		int [] valor = new int[6];
		
		soma = vetor[0] + vetor[1] + vetor[5];
		
		System.out.println("A soma dos vetores de posi��o 0, 1 e 5 �: "+soma);
		
		System.out.println("Os valores do vetor A s�o: \t"+vetor[0]+"\t"+vetor[1]+"\t"+vetor[2]+"\t"+vetor[3]+"\t"+vetor[4]+"\t"+vetor[5]);
		
	}
}