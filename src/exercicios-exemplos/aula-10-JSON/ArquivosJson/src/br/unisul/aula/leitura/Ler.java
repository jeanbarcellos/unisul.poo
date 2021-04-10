package br.unisul.aula.leitura;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ler {
	public static void main(String[] args) {
		BufferedReader leitorPalavras = null;
		try {
			InputStream leitorByte = new FileInputStream("conteudo/novoArquivo3.txt");
			InputStreamReader leitorCaracter = new InputStreamReader(leitorByte);
			leitorPalavras = new BufferedReader(leitorCaracter);
			String linha = leitorPalavras.readLine();
			while(linha != null){
				System.out.println(linha);
				linha = leitorPalavras.readLine();
			}
		} catch (Exception e) {
			System.err.println(e);
		}

	}
}
