/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package POO;

public class ClienteExercicio1 {
	
	String primeiroNome;
	String segundoNome;
	String terceiroNome;
	String cidadeOndeMora;
	
	public ClienteExercicio1(String primeiro, String segundo, String terceiro, String endereco) {		
	primeiroNome = primeiro;
	segundoNome = segundo;
	terceiroNome = terceiro;
	cidadeOndeMora = endereco;		
	}
	public String getInfosCompletas() {
		String infoCompleta = primeiroNome +" "+segundoNome+" "+terceiroNome+" "+cidadeOndeMora;
		return infoCompleta;
	}
}
