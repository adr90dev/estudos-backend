/*
 * 2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor.
 * Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a classe Pessoa, os atributos
 * valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor).
 * Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores, um m�todo obterSaldo() que devolve a
 * diferen�a entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita
 * verificar o funcionamento dos m�todos implementados na classe Fornecedor e os herdados da classe Pessoa. 
 */
package Encapsulamento;

public class Exercicio2Fornecedor extends Exercicio1Pessoa{
	private double valorCredito;
	private double valorDivida;
	private double saldo;
	
	public Exercicio2Fornecedor (String nome, String endereco, String telefone, double valorCredito, double valorDivida){
		super (nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;				
	}
	
	public double obterSaldo(double saldo) {
		saldo =  valorCredito - valorDivida;
		return saldo;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
}