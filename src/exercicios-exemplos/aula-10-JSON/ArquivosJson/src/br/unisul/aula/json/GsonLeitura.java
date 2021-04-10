package br.unisul.aula.json;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

public class GsonLeitura {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("conteudo/pessoa.json");
			BufferedReader lerArq = new BufferedReader(file);
			String linha = lerArq.readLine();
			System.out.println(linha);
			Gson gson = new Gson();
			Pessoa pessoa = gson.fromJson(linha, Pessoa.class);
			System.out.println("Nome: " + pessoa.getNome()
							+ "\nIdade: "+ pessoa.getIdade()
							+ "\nEndereço"
							+ "\nLogradouro: "+pessoa.getEndereco().getLogradouro()+"\n"
									+ "Número: "+pessoa.getEndereco().getNumero()+"\n"
											+ "CEP: "+pessoa.getEndereco().getCEP());
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
