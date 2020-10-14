package Polimorfismo;

public class Cavalo extends Animal{
	public Cavalo () {
		super ("Cavalo", 20);
	}
	public void correr (int run) {
		System.out.println("O cavalo está correndo.");
	}
	@Override
	public void emitesom () {
		System.out.println("Riiiiiiiiiiiiiiiiiiririririri...");
	}
}