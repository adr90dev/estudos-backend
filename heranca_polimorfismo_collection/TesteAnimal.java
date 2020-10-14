package Polimorfismo;

public class TesteAnimal {
	public static void main (String[] args) {
		Cachorro dog = new Cachorro ();
		Cavalo horse = new Cavalo ();
		Preguica sloth = new Preguica ();
		
		Animal animal = null;
		
		int n = (int)(Math.random()*3.0);
		System.out.println(n);
		switch (n){
		case 0: animal = dog;break;
		case 1: animal = horse;break;
		case 2: animal = sloth;break;
		default: System.out.println("Erro de opção!");
		}
		if(animal!=null) {
			animal.emitesom();
			
		}
	}
}
