package Encapsulamento;

public class Ex2Fornecedor {
	public static void main (String[] args) {
		Exercicio2Fornecedor suplier = new Exercicio2Fornecedor ("Lorival dos Santos Lima", "Rua dos Borbas, 171", "+55 (11) 91234 - 6789", 1150, 500);
		
		suplier.setNome("Lourival dos Santos Lima");
		suplier.setEndereco("Rua dos Borbas, 171");
		suplier.setTelefone("+55 (11) 91234 - 6789");
		
		System.out.println(suplier.getNome());
		System.out.println(suplier.getEndereco());
		System.out.println(suplier.getTelefone());
		System.out.println(suplier.obterSaldo(suplier.getSaldo()));
	}
}
