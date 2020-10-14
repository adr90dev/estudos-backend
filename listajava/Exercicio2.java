package PacoteJava;

import java.util.Scanner;

public class Exercicio2 
{
	public static void main (String args[])
	{
		int resdia, ano, mes, dia;
		Scanner read = new Scanner(System.in);
		System.out.println("Digite seu tempo de vida em dias: ");
		resdia = read.nextInt();
		
		ano = resdia / 365;
		mes = (resdia%365)/30;
		dia = (resdia%365)%30;
		
		System.out.println("Sua idade é: "+ano+" anos, "+mes+" meses,"+dia+" dias.");
		
	}
}