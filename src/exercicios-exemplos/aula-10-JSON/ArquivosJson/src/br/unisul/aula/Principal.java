package br.unisul.aula;

import java.io.File;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException {

		File arquivo = new File("conteudo/arqs.txt");
		
		System.out.println("Arquivo existe: "+arquivo.exists());
		
		if (arquivo.exists()) {
			System.out.println(arquivo.getAbsolutePath());
		} else {
			arquivo.createNewFile();
			System.out.println("arquivo criado:" +arquivo.getAbsolutePath());
		}
		
		File pasta = new File("conteudo/");
		
		if (pasta.exists()){
			File novaPasta = new File("conteudo/nova/");
			novaPasta.mkdir();
			System.out.println(novaPasta.getAbsolutePath());
		}

	}
}
