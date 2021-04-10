package br.unisul.aula.arquvo;

import java.io.File;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {

		File arquivo = new File("conteudo/testeArquivo.txt");
		
		if (arquivo.exists()){
			System.out.println("existe");
		} else {
			System.out.println("não existe");
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (arquivo.exists()){
			System.out.println("existe");
		} else {
			System.out.println("não existe");
		}

		File pasta = new File("conteudo/pasta/");
		if (pasta.exists()){
			System.out.println("existe");
		} else {
			System.out.println("não existe");
			pasta.mkdir();
			
		}

		if (pasta.exists()){
			System.out.println("existe");
		} else {
			System.out.println("não existe");
		}

	}
}
