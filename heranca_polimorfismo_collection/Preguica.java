package Polimorfismo;

public class Preguica extends Animal{
	public Preguica () {
		super ("Pregui�a", 25);
	}
	public void subir (int climb) {
		System.out.println("A pregui�a est� subindo na arvor�.");
	}
	@Override
	public void emitesom () {
		System.out.println("zzzzzzzzZZZZZZZZZzzzzzzzZZZZZ...");
	}
}