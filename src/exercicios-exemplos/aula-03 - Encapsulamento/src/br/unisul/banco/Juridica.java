package br.unisul.banco;

public class Juridica extends Correntista {
	private String cnpj;
	private String nomeFantasia;
	
	public Juridica(String cnpj, String nomeFantasia, String nome, String endereco, 
			Agencia agencia, int numero, 
			double saldo, 
			double limite){
		this.setCnpj(cnpj);
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setNomeFantasia(nomeFantasia);
		this.setConta(new Conta(numero, saldo, limite, this));
	}
	
	public String mostrarNome(){
		return super.mostrarNome()
			   + " - " 
			   + this.getNomeFantasia(); 
	}
	
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	
}
