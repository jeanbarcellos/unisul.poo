package br.unisul.aula;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dependentes {
	private String nome;
	private Calendar dataNascimento = Calendar.getInstance();

	public Dependentes() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento.getTime();
	}

	public String getDataNascimentoFormatada() {
		DateFormat dataFormatada = DateFormat.getDateInstance();
		return dataFormatada.format(this.dataNascimento.getTime());
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		String[] aux = dataNascimento.split("/");
		this.dataNascimento.set(Calendar.YEAR, Integer.parseInt(aux[2]));
		this.dataNascimento.set(Calendar.MONTH, Integer.parseInt(aux[1]) - 1);
		this.dataNascimento.set(Calendar.DAY_OF_MONTH, Integer.parseInt(aux[0]));
	}
}
