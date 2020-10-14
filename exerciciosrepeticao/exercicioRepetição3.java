package PacoteJava;

import java.util.Scanner;

public class exercicioRepetição3 {
	public static void main (String args[]) {
		
		Scanner ler = new Scanner (System.in);
		int idade = 0, menosvinteum = 0, maiscinquenta = 0;
		
		while(idade!=-99) {
			System.out.println("Entre com a sua idade: ");
			idade = ler.nextInt();
			
			if (idade<21) {
				menosvinteum++;
			}
			if (idade>50) {
				maiscinquenta++;
			}
		}
		System.out.println("Quantidade de pessoas com menos de 21 anos foi de: "+menosvinteum);
		System.out.println("Quantidade de pessoas com menos de 50 anos foi de: "+maiscinquenta);
	}
}