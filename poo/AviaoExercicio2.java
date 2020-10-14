/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
package POO;

public class AviaoExercicio2 {

	String modelo;
	String paisDeOrigem;
	String capacidadeMaxDePassageiros;
	String capacidadeMinDePassageiros;
	String velocidadeDeCruzeiro;
	String velocidadeMaxima;
	
	public AviaoExercicio2(String tipo, String origem, String maxPassageiro, String minPassageiro, String cruzeiro, String maxima) {
		modelo = tipo;
		paisDeOrigem = origem;
		capacidadeMaxDePassageiros = maxPassageiro;
		capacidadeMinDePassageiros = minPassageiro;
		velocidadeDeCruzeiro = cruzeiro;
		velocidadeMaxima = maxima;
	}
	public String getTodasInfos() {
		String todasInfos = modelo+" "+paisDeOrigem+" "+capacidadeMaxDePassageiros+" "+capacidadeMinDePassageiros+" "+velocidadeDeCruzeiro+" "+velocidadeMaxima;
		return todasInfos;
	}
}
