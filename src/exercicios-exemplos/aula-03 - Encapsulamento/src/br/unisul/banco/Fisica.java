package br.unisul.banco;

public class Fisica extends Correntista {
	private String cpf;
	private int idade;
	
	public Fisica(String cpf, int idade, String nome, String endereco, Conta conta) {
		this.setCpf(cpf);
		this.setIdade(idade);
		this.setEndereco(endereco);
		this.setNome(nome);
		this.setConta(conta);
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
