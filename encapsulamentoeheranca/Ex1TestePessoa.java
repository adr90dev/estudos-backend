package Encapsulamento;

public class Ex1TestePessoa {
		public static void main (String[] args) {
			Exercicio1Pessoa pessoa = new Exercicio1Pessoa ( "Rua dos Borbas, 171","Lorival dos Santos Lima", "+55 (11) 91234 - 6789");
			
			pessoa.setNome("Lorival dos Santos Lima");
			pessoa.setEndereco("Rua dos Borbas, 171");
			pessoa.setTelefone("+55 (11) 91234 - 6789");
			
			System.out.println(pessoa.getNome());
			System.out.println(pessoa.getEndereco());
			System.out.println(pessoa.getTelefone());
		}

}
