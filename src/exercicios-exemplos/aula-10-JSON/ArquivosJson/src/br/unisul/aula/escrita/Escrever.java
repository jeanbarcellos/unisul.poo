package br.unisul.aula.escrita;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Escrever {
	public static void main(String[] args) {
		OutputStream escritorByte = null;
		OutputStreamWriter escritorCaracter = null;
		BufferedWriter escritorPalavras = null;
		try {
			File arquivo = new File("conteudo/novoArquivo3.txt");
			if (!arquivo.exists()){
				arquivo.createNewFile();
			}
			escritorByte = new FileOutputStream(arquivo);
			escritorCaracter = new OutputStreamWriter(escritorByte);
			escritorPalavras = new BufferedWriter(escritorCaracter);
			String linhas ="O texto novo";
			escritorPalavras.write(linhas);
			escritorPalavras.newLine();
			escritorPalavras.flush();
			
		}catch(FileNotFoundException e){
			System.err.println(e);
		}catch (IOException e) {
			System.err.println(e);
		}finally {
			try{
				if(escritorPalavras!=null){
					escritorPalavras.close();
				}
				if(escritorCaracter != null){
					escritorCaracter.close();
				}
				if(escritorByte != null){
					escritorByte.close();
				}
			}catch(Exception e){
				System.err.println(e);
			}
		}
	}

}
