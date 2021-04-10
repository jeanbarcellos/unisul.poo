package br.unisul.aula;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private String nome;
	private TipoParentesco parentesco;
	private SalarioFamilia salarioFamilia;
	private List<Dependentes> dependentes;

	public Funcionario() {
		this.dependentes = new ArrayList<Dependentes>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoParentesco getParentesco() {
		return parentesco;
	}

	public void setParentesco(TipoParentesco parentesco) {
		this.parentesco = parentesco;
	}

	public SalarioFamilia getSalarioFamilia() {
		return salarioFamilia;

	}

	public void calcularSalarioFamilia() {

		switch (this.dependentes.size()) {
		case 0:
			this.salarioFamilia = SalarioFamilia.ZERO;
		case 1:
			this.salarioFamilia = SalarioFamilia.UM;
			break;
		case 2:
			this.salarioFamilia = SalarioFamilia.DOIS;
			break;
		case 3:
			this.salarioFamilia = SalarioFamilia.TRES;
			break;
		default:
			this.salarioFamilia = SalarioFamilia.QUATRO_OU_MAIS;
			break;
		}
	}

	public List<Dependentes> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependentes> dependentes) {
		this.dependentes = dependentes;
	}

	public void setDependentes(Dependentes dependente) {
		this.dependentes.add(dependente);
	}

}
