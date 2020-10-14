//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package Arrays;

import java.util.Scanner;

	public class Exercicio3 {
		public static void main (String args[]){
	
			int[][] matriz = new int[3][3];
			int m10=0;
			
			Scanner entrada = new Scanner (System.in);
			System.out.println("Matriz M[3][3]");
			
			for(int i=0;i<3;i++) {
				for (int j=0;j<3;j++) {
					System.out.printf("Insira um número M[%d][%d]: ",i+1,j+1);
					matriz[i][j] = entrada.nextInt();					
					if (matriz[i][j]>10) {
						m10++;
					}
				}
			}				
				System.out.println("\nVocê inseriu "+m10+" números maior(s) que 10");				
		}
			
	}
	
