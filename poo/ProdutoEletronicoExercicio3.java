package POO;

public class ProdutoEletronicoExercicio3 {
	
		String fabricante;
		String modelo;
		String cor;
		String sistemaOperacional;
		String dimensao;
		String peso;
		String preco;
		
		public ProdutoEletronicoExercicio3(String fab, String mod, String color, String sistem, String dimen, String p, String price) {
			
		fabricante = fab;
		modelo = mod;
		cor = color;
		sistemaOperacional = sistem;
		dimensao = dimen;
		peso = p;
		preco = price;		
	}
		public String getInfoGeral() {
			String infoGeral = fabricante+" "+modelo+" "+cor+" "+sistemaOperacional+" "+dimensao+" "+peso+" "+preco;
			return infoGeral;
		}
}
