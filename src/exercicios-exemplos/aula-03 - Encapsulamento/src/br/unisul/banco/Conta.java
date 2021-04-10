package br.unisul.banco;

public class Conta {
	
	private Correntista correntista;
	private Agencia agencia;
	private int numero;
	private double saldo;
	private double limite;
	
	public Conta(String cpf, int idade, 
			String nomeFantasia, 
			String nome, String endereco, 
			int numero, double saldo, 
			double limite, 
			int numeroAgencia, 
			String nomeAgencia, 
			String enderecoAgencia){
		this.correntista = new Fisica(cpf, idade, 
				nome, endereco, this);
		this.agencia = new Agencia(numeroAgencia, 
				nomeAgencia, enderecoAgencia);
	}
	
	public Conta(Agencia agencia, int numero, double saldo, 
			double limite, Correntista correntista) {
		this.setAgencia(agencia);
		this.setNumero(numero);
		this.setSaldo(saldo);
		this.setLimite(limite);
		this.setCorrentista(correntista);
	}

	public Conta(int numero, double saldo, double limite, 
			Juridica juridica) {
		this.setNumero(numero);
		this.setSaldo(saldo);
		this.setLimite(limite);
		this.setCorrentista(juridica);
	}

	public void depositar(double deposito){
		this.setSaldo(deposito+this.getSaldo());
	}
	
	public String sacar(double saque){
		double saldo = this.getSaldo()+this.getLimite()-saque;
		if ((saldo)>=0){
			this.setSaldo(this.getSaldo()-saldo);
			return "Saque realizado";
		} else return "Saque negado";
		
	}
	
	public double saldo(){
		return this.getSaldo();
	}
	
	@Override
	public String toString() {
		
		return this.getNumero()+" - "+
			   this.getCorrentista().mostrarNome()
			   + " - " +
			   this.getCorrentista().getEndereco();
	}
	
	private Correntista getCorrentista() {
		return correntista;
	}
	private void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	private Agencia getAgencia() {
		return agencia;
	}
	private void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	private int getNumero() {
		return numero;
	}
	private void setNumero(int numero) {
		this.numero = numero;
	}
	private double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private double getLimite() {
		return limite;
	}
	private void setLimite(double limite) {
		this.limite = limite;
	}
}
