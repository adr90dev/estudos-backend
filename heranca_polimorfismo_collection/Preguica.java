package Polimorfismo;

public class Preguica extends Animal{
	public Preguica () {
		super ("Preguiça", 25);
	}
	public void subir (int climb) {
		System.out.println("A preguiça está subindo na arvoré.");
	}
	@Override
	public void emitesom () {
		System.out.println("zzzzzzzzZZZZZZZZZzzzzzzzZZZZZ...");
	}
}