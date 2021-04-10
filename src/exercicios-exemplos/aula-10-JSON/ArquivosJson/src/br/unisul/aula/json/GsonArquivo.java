package br.unisul.aula.json;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

public class GsonArquivo {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Edson");
		pessoa.setIdade(30);
		Endereco end = new Endereco();
		end.setCEP("99999-000");
		end.setLogradouro("Teste");
		end.setNumero(10);
		pessoa.setEndereco(end);
		try{
			
			PrintWriter fileGravado = new PrintWriter("conteudo/pessoa.json");
			Gson gson = new Gson();
			fileGravado.write(gson.toJson(pessoa));
			fileGravado.close();
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
