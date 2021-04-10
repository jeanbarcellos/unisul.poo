package br.unisul.aula;

public class Principal {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("José");
		funcionario.setParentesco(TipoParentesco.Esposa);
		System.out.println("Nome: "+funcionario.getNome()+"\n"
				+ "Tipo: "+funcionario.getParentesco());
		Dependentes dependente = new Dependentes();
		dependente.setNome("Maria");
		dependente.setDataNascimento("16/04/1994");
		System.out.println(dependente.getDataNascimento());
		
		funcionario.setDependentes(dependente);
		funcionario.calcularSalarioFamilia();
		System.out.println("Dependentes\n"
				+ "Nº dependentes: "+funcionario.getSalarioFamilia().getNumeroDependentes()+
				" Salário:"+ funcionario.getSalarioFamilia().getAdicional());
		for(Dependentes depend: funcionario.getDependentes()){
			System.out.println("Nome:"+depend.getNome()+"\n"+
								"Data Nascimento: "+depend.getDataNascimentoFormatada());
		}
	}
}
