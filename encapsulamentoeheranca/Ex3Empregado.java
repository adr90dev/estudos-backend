package Encapsulamento;

public class Ex3Empregado {
	public static void main (String[] args) {
		Exercicio3Empregado empregado = new Exercicio3Empregado ("Lorival dos Santos Lima", "Rua dos Borbas, 171", "+55 (11) 91234 - 6789", 243526, 3500.00, 500.00);
		
		empregado.setNome("Lourival dos Santos Lima");
		empregado.setEndereco("Rua dos Borbas, 171");
		empregado.setTelefone("+55 (11) 91234 - 6789");
		empregado.setCodigoSetor(empregado.getCodigoSetor());
		empregado.setSalarioBase(empregado.getSalarioBase());
		
		System.out.println(empregado.getNome());
		System.out.println(empregado.getEndereco());
		System.out.println(empregado.getTelefone());
		System.out.println(empregado.getCodigoSetor());
		System.out.println(empregado.getSalarioBase());
		System.out.println(empregado.salarioReal(empregado.getSalarioReal()));
	}
}
