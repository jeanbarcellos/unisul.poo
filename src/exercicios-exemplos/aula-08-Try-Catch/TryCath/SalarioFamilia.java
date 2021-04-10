package br.unisul.aula;

public enum SalarioFamilia {
	ZERO(0,0.00),
	UM(1,100.00),
	DOIS(2,200.00),
	TRES(3,300.01),
	QUATRO_OU_MAIS(4,500.50);
	private int numeroDependentes;
	private double adicional;
	
	private SalarioFamilia(int numeroDependentes, double adicional) {
		this.numeroDependentes=numeroDependentes;
		this.adicional=adicional;
	}

	public int getNumeroDependentes() {
		return numeroDependentes;
	}

	public double getAdicional() {
		return adicional;
	}
	
}
