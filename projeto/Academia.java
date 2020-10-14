package ProjetoAcademia;

public class Academia 
{	//criando atributos
	private String nome;
	private int idade;
	private String genero;
	private double altura;
	private double peso;
		//criando construtor
	public Academia (String nome,int idade,String genero, double altura, double peso)
	{
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.altura = altura;
		this.peso = peso;
	}
		//criando métodos
	void chegou()
	{
		System.out.println("Você está na academia BOLO É BOM? \n "); 
	}
		//criando get e set 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
