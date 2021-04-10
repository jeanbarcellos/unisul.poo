package br.unisul.banco;

public class Correntista {
	private Conta conta;
	private String nome;
	private String endereco;
	
	public String mostrarNome(){
		return this.getNome();
	}
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Conta criarConta(Agencia agencia, int numero, double saldo, double limite) {
		Conta conta = new Conta(agencia, numero, saldo, limite, this);
		this.setConta(conta);
		return conta;
	}
	
	private String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
