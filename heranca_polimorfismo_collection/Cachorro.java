package Polimorfismo;

public class Cachorro extends Animal{
	public Cachorro () {
		super ("Cachorro", 15);
	}
	public void correr (int run) {
		System.out.println("O cachorro está correndo.");
	}
	@Override
	public void emitesom () {
		System.out.println("Auuuuuuuuuuuuuuuauauauaua...");
	}
}
