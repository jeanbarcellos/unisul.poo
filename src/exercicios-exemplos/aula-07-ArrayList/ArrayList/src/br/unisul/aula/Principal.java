package br.unisul.aula;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Cadeira> cadeiras = new ArrayList<Cadeira>();

        Cadeira cadeira = new Cadeira("Preto", 45.8);
        cadeiras.add(cadeira);

        cadeira = new Cadeira("Vermelho", 34.9);
        cadeiras.add(cadeira);

        for (Cadeira novaCadeira : cadeiras) {
            System.out.println("Cor: " + novaCadeira.getCor() + "\n"
                    + "Tamanho: " + novaCadeira.getTamanho() + "\n"
                    + "++++++++++");
        }
    }
}
