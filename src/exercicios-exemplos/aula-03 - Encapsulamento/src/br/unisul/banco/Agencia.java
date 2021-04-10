package br.unisul.banco;

public class Agencia {

	private int numero;
	private String nome;
	private String endereco;
	
	public Agencia(int numero, String nome, String endereco) {
		this.setNumero(numero);
		this.setNome(nome);
		this.setEndereco(endereco);		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
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
